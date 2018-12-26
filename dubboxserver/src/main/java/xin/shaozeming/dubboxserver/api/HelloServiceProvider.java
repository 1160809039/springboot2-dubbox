package xin.shaozeming.dubboxserver.api;

import com.alibaba.dubbo.config.annotation.Service;
import xin.shaozeming.dubboxapi.po.Hello;
import xin.shaozeming.dubboxapi.service.HelloService;
/**
 * @author: 邵泽铭
 * @date: 2018/12/25
 * @description:
 **/
@Service(interfaceClass = HelloService.class)
public class HelloServiceProvider implements HelloService {
    @Override
    public Hello sayHello(String str) {
        Hello hello=new Hello();
        hello.setName(str);
        return hello;
    }


}