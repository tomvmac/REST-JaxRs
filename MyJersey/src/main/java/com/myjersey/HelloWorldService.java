package com.myjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created with IntelliJ IDEA.
 * User: Tom
 * Date: 8/1/14
 * Time: 10:33 AM
 *
 */


/**
 * To access HelloWorldService from the browser when running jetty run war, open your browser and use
 * http://localhost:8080/rest/hello/something
 */
@Path("/hello")
public class HelloWorldService {

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {

        String output = "Jersey say : " + msg;

        return Response.status(200).entity(output).build();

    }

}
