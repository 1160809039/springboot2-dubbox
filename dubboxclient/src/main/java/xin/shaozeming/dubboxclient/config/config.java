package xin.shaozeming.dubboxclient.config;

import com.alibaba.dubbo.config.*;
import com.alibaba.dubbo.config.spring.AnnotationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 邵泽铭
 * @date: 2018/12/24
 * @description:
 **/
@Configuration
public class config {
    private static final String APPLICATION_NAME = "consumer";

    private static final String REGISTRY_ADDRESS = "zookeeper://47.105.202.148:2181";

    private static final String ANNOTATION_PACKAGE = "xin.shaozeming.dubboxclient.controller";


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
    public AnnotationBean annotationBean() {
        AnnotationBean annotationBean = new AnnotationBean();
        annotationBean.setPackage(ANNOTATION_PACKAGE);
        return annotationBean;
    }

}