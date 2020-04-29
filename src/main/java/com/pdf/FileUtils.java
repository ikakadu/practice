package com.pdf;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.io.*;
import java.util.Iterator;

/**
 * 文件工具类
 *
 * @author shw
 * @create 2020-01-10
 **/
//@Slf4j
public class FileUtils {
	private static Logger log = LoggerFactory.getLogger(FileUtils.class);

	public static String ReadFile(String filePath) throws IOException{
		return ReadFile(filePath, "UTF-8");
	}

	public static String ReadFile(String filePath, String charset) throws IOException {
		File file = new File(filePath);
		return org.apache.commons.io.FileUtils.readFileToString(file, charset);
	}

	public static void WriteFile(String content, String filePath, boolean append) throws IOException {

		FileWriter fw = null;

		try {
			fw = new FileWriter(filePath, append);
			fw.append(content);
			fw.flush();
		} catch (IOException e) {
			throw e;
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (Exception e) {
				log.error("",e);
			}
		}

	}

	public static String getImageExtension(byte[] data) {
		ImageInputStream iis = null;
		try {
			iis = ImageIO.createImageInputStream(new ByteArrayInputStream(data));

			Iterator<ImageReader> imageReaders = ImageIO.getImageReaders(iis);

			while (imageReaders.hasNext()) {
				ImageReader reader = (ImageReader) imageReaders.next();
				return reader.getFormatName();
			}
		} catch (Exception e) {
			log.error("", e);
		} finally {
			IOUtils.closeQuietly(iis);
		}
		return "jpeg";
	}

	/**
	 * 将文件转换成byte数组
	 * @param tradeFile
	 * @return
	 */
	public static byte[] File2byte(File tradeFile) {
		byte[] buffer = null;
		try (FileInputStream fis = new FileInputStream(tradeFile);
			 ByteArrayOutputStream bos = new ByteArrayOutputStream();) {
			byte[] b = new byte[1024];
			int n;
			while ((n = fis.read(b)) != -1) {
				bos.write(b, 0, n);
			}
			buffer = bos.toByteArray();
		} catch (FileNotFoundException e) {
			log.error("", e);
		} catch (IOException e) {
			log.error("", e);
		}
		return buffer;
	}

	/**
	 * 获取临时目录
	 *
	 * @param tmpDirName 临时文件夹名称
	 * @return
	 */
	public static String getFileTmpPath(String tmpDirName){
		File file = new File(System.getProperty("java.io.tmpdir"),tmpDirName);
		if(!file.exists()){
			file.mkdirs();
		}
		return file.getPath();
	}
}
