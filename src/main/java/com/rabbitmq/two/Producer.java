package com.rabbitmq.two;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Channel;

//import com.rabbitmq.client.ConnectionFactory;

//import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import org.apache.commons.lang3.time.DateFormatUtils;

public class Producer {
    public final static String QUEUE_NAME="rabbitMQ.test";

    public static void main(String[] args) throws IOException, TimeoutException {
        //创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //设置RabbitMQ相关信息
        factory.setHost("192.168.50.154");
//        factory.setHost("127.0.0.1");
//        factory.setPort(5672);//默认服务端口是5672
        factory.setUsername("admin");
        factory.setPassword("123456");
        //创建一个新的连接
        Connection connection = factory.newConnection();
        //创建一个通道
        Channel channel = connection.createChannel();
        //  声明一个队列        
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        String time = DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss SSS");
        String message = "Hello RabbitMQ "+time;
        //发送消息到队列中
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes("UTF-8"));
        System.out.println("Producer Send +'" + message + "'");
        //关闭通道和连接
        channel.close();
        connection.close();
    }
}
