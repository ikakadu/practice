package com.it.test;

import java.io.Serializable;
import java.util.Map;

public class redisDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3403311129106063534L;
	private String bondCd;//
	private String netPrc;//
	private String stlSpd;//
	private String yldToMrty;//
	private String exrcsYld;//
	private String acrdIntrst;//
	private String prncplPerHndrdYuan;//
	private  Map<String,String> map;
	
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public String getBondCd() {
		return bondCd;
	}
	public void setBondCd(String bondCd) {
		this.bondCd = bondCd;
	}
	public String getNetPrc() {
		return netPrc;
	}
	public void setNetPrc(String netPrc) {
		this.netPrc = netPrc;
	}
	public String getStlSpd() {
		return stlSpd;
	}
	public void setStlSpd(String stlSpd) {
		this.stlSpd = stlSpd;
	}
	public String getYldToMrty() {
		return yldToMrty;
	}
	public void setYldToMrty(String yldToMrty) {
		this.yldToMrty = yldToMrty;
	}
	public String getExrcsYld() {
		return exrcsYld;
	}
	public void setExrcsYld(String exrcsYld) {
		this.exrcsYld = exrcsYld;
	}
	public String getAcrdIntrst() {
		return acrdIntrst;
	}
	public void setAcrdIntrst(String acrdIntrst) {
		this.acrdIntrst = acrdIntrst;
	}
	public String getPrncplPerHndrdYuan() {
		return prncplPerHndrdYuan;
	}
	public void setPrncplPerHndrdYuan(String prncplPerHndrdYuan) {
		this.prncplPerHndrdYuan = prncplPerHndrdYuan;
	}
	@Override
	public String toString() {
		return "redisDto [bondCd=" + bondCd + ", netPrc=" + netPrc + ", stlSpd=" + stlSpd + ", yldToMrty=" + yldToMrty
				+ ", exrcsYld=" + exrcsYld + ", acrdIntrst=" + acrdIntrst + ", prncplPerHndrdYuan=" + prncplPerHndrdYuan
				+ ", map=" + map + "]";
	}
	
}
