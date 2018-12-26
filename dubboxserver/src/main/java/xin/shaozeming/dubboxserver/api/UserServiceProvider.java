package xin.shaozeming.dubboxserver.api;


import com.alibaba.dubbo.config.annotation.Service;
import xin.shaozeming.dubboxapi.po.User;
import xin.shaozeming.dubboxapi.service.UserService;

/**
 * @author: 邵泽铭
 * @date: 2018/12/21
 * @description:
 **/

@Service(interfaceClass = UserService.class)
public class UserServiceProvider implements UserService {
   @Override
    public User getUser() {
       User user=new User();
       user.setUserName("szm");
       user.setPassword("123456");
       return user;
    }
}