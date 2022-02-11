package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;

/**
 * Controller only exists to make OpenWhisk happy.
 * Modeled after https://github.com/nheidloff/openwhisk-quarkus-starter/blob/master/src/main/java/com/ibm/openwhiskquarkus/Init.java
 */
@Controller("/init")
public class InitController {
    @Post
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String init() {
        return "";
    }
}
