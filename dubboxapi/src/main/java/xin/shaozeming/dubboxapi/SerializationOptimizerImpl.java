package xin.shaozeming.dubboxapi;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import xin.shaozeming.dubboxapi.po.Hello;
import xin.shaozeming.dubboxapi.po.User;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: 邵泽铭
 * @date: 2018/12/24
 * @description:
 **/
public class SerializationOptimizerImpl implements SerializationOptimizer {
    @Override
    public Collection<Class> getSerializableClasses() {

        List<Class> classes = new LinkedList<Class>();
        classes.add(User.class);
        classes.add(Hello.class);
        return classes;
    }
}