package com.badnotes.demo.ws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jun.wan on 14-3-13.
 */
public class WsClient {

    public static void main(String[] args){
        // 加载客户端的配置定义
        ApplicationContext context = new ClassPathXmlApplicationContext("ws_client.xml");
        // 获取定义的 Web Service Bean
        ITest helloService = (ITest) context.getBean("helloServiceClient");
        String username = "joe";
        // 调用方法进行服务消费
        String result = helloService.say(username);
        System.out.println("Result:" + result);
    }
}
