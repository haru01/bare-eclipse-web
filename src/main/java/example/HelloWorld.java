package example;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.view.Viewable;

@Path("/")
@Produces(MediaType.TEXT_HTML)
public class HelloWorld {

    @GET
    @Path("/hello")
    public Viewable index(@Context HttpServletRequest request) {
        return new Viewable("/hello", "!");
    }
}
