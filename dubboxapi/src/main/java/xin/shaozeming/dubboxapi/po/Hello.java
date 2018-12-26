package xin.shaozeming.dubboxapi.po;

import java.io.Serializable;

/**
 * @author: 邵泽铭
 * @date: 2018/12/25
 * @description:
 **/
public class Hello implements Serializable {
    private static final long serialVersionUID = 8045324066559032429L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}