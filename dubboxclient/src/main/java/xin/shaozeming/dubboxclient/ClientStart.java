package xin.shaozeming.dubboxclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author: 邵泽铭
 * @date: 2018/12/24
 * @description:
 **/
@SpringBootApplication
//@ImportResource("classpath:dubbo-consumer.xml")
public class ClientStart {
    public static void main(String[] args) throws Exception{
        System.setProperty("dubbo.application.logger","slf4j");
        SpringApplication.run(ClientStart.class,args);		

    }
}