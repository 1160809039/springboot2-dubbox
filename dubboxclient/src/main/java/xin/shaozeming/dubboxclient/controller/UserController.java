package xin.shaozeming.dubboxclient.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xin.shaozeming.dubboxapi.po.Hello;
import xin.shaozeming.dubboxapi.po.User;
import xin.shaozeming.dubboxapi.service.HelloService;
import xin.shaozeming.dubboxapi.service.UserService;
/**
 * @author: 邵泽铭
 * @date: 2018/12/24
 * @description:
 **/
@RestController
public class UserController  {

    @Reference(interfaceClass=UserService.class,loadbalance = "roundrobin",cluster = "failover",retries = 2)
    private UserService userService;


    @GetMapping("/user")
    public User getUser(){
        return userService.getUser();
    }

    @Reference(interfaceClass=HelloService.class)
    private HelloService helloService;


    @GetMapping("/hello")
    public Hello getHello(@RequestParam("str") String str){
        return helloService.sayHello(str);
    }


}