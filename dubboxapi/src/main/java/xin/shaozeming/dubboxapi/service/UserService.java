package xin.shaozeming.dubboxapi.service;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import xin.shaozeming.dubboxapi.po.User;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 邵泽铭
 * \* Date: 2018/12/21
 * \* Time: 9:50
 * \* Description:
 * \
 */

@Path("user")
public interface UserService {

    @GET
    @Path("getUser")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
    @Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
    public User  getUser();

}
