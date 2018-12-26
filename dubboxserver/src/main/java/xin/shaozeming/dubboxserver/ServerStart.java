package xin.shaozeming.dubboxserver;

import org.apache.http.Consts;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.logging.LoggingSystem;
import org.springframework.context.annotation.ImportResource;

/**
 * @author: 邵泽铭
 * @date: 2018/12/21
 * @description:
 **/

@SpringBootApplication
//@ImportResource("classpath:dubbo-provider.xml")
public class ServerStart {
   public static void main(String[] args) throws Exception{

       System.setProperty("org.springframework.boot.logging.LoggingSystem","org.springframework.boot.logging.log4j2.Log4J2LoggingSystem");
       System.setProperty("dubbo.application.logger","slf4j");
       new SpringApplicationBuilder(ServerStart.class)
               .web(WebApplicationType.NONE)
               .run(args);
   }


}