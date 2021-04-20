/*
package com.rabbitmq.two;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import com.rabbitmq.client.QueueingConsumer;

*/
/**
 * com.rabbitmq.amqp-client   <version>3.6.5</version>版本
 *//*

@Deprecated
public class Consumer {
    private final static String QUEUE_NAME = "queue_demo";

    
    public static void main(String[] argv) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
 
        factory.setHost("192.168.50.154");
//      factory.setPort(15672);//15672是默认控制台端口
//      factory.setPort(5672);
        factory.setUsername("admin");
        factory.setPassword("123456");
        factory.setVirtualHost("/");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");
        QueueingConsumer consumer = new QueueingConsumer(channel);
        channel.basicConsume(QUEUE_NAME, true, consumer);
        while(true){
            QueueingConsumer.Delivery delivery = consumer.nextDelivery();
            String message = new String(delivery.getBody());
            System.out.println(" [x] Received '" + message + "'");
        }
    }

}
*/
