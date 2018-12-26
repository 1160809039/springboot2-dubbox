package xin.shaozeming.dubboxserver.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xin.shaozeming.dubboxapi.SerializationOptimizerImpl;

/**
 * @author: 邵泽铭
 * @date: 2018/12/21
 * @description:
 **/
@Configuration
public class config {

    private static final String APPLICATION_NAME = "provider";

    private static final String REGISTRY_ADDRESS = "zookeeper://47.105.202.148:2181";

    private static final String ANNOTATION_PACKAGE = "xin.shaozeming.dubboxserver.api";


    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(APPLICATION_NAME);
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(REGISTRY_ADDRESS);
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig=new ProtocolConfig();
        protocolConfig.setName("rest");
        protocolConfig.setPort(8887);
        protocolConfig.setSerialization("kryo");
        protocolConfig.setOptimizer(SerializationOptimizerImpl.class.getName());
//        protocolConfig.setHost("192.168.0.244");
        protocolConfig.setServer("netty");
        protocolConfig.setThreads(500);
        protocolConfig.setAccepts(500);
        protocolConfig.setExtension(
                "com.alibaba.dubbo.rpc.protocol.rest.support.LoggingFilter"
        );
        return protocolConfig;
    }


    @Bean
    public AnnotationBean annotationBean() {
        AnnotationBean annotationBean = new AnnotationBean();
        annotationBean.setPackage(ANNOTATION_PACKAGE);
        return annotationBean;
    }

}