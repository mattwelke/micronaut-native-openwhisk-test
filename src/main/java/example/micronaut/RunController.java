package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;

/**
 * Modeled after https://github.com/nheidloff/openwhisk-quarkus-starter/blob/master/src/main/java/com/ibm/openwhiskquarkus/Run.java
 */
@Controller("/run")
public class RunController {
    @Post
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Output run(Input input) {
        // Input not used right now.
        return new Output("Bob");
    }
}
