package xin.shaozeming.dubboxapi.service;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import xin.shaozeming.dubboxapi.po.Hello;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 邵泽铭
 * \* Date: 2018/12/25
 * \* Time: 11:37
 * \* Description:
 * \
 */
@Path("hello")
public interface HelloService {
    @GET
    @Path("sayHello")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
    @Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
    public Hello sayHello(@QueryParam("str") String str );

}
