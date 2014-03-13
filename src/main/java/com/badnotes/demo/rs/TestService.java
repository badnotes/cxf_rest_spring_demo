package com.badnotes.demo.rs;

import javax.ws.rs.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by jun.wan on 14-3-13.
 */
@Path("/test")
@XmlRootElement
public class TestService {

    // host/service/test/say?name=joe
    @GET
    @Path("/say")
    @Produces("application/json")
    public String say(@QueryParam("name")String name){
        return name + " say: Hello World!";
    }

    // host/service/test/says/joe
    @GET
    @Path("/says/{name}")
    @Produces("application/json")
    public String says(@PathParam("name")String name){
        return name + " say: Hello World!";
    }
}
