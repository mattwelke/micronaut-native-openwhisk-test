package example.micronaut;

import java.util.Objects;

/**
 * Modeled after https://github.com/nheidloff/openwhisk-quarkus-starter/blob/master/src/main/java/com/ibm/openwhiskquarkus/Input.java
 */
public class Output {

    private String name;

    public Output() {

    }

    public Output(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Output output = (Output) o;
        return Objects.equals(name, output.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
