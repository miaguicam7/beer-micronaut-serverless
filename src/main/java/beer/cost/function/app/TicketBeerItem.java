package beer.cost.function.app;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class TicketBeerItem implements Serializable {
    private static final long serialVersionUID = -5803935122677992780L;
    private  String name;
    private  String size;

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    @JsonCreator
    public TicketBeerItem(@JsonProperty("name") String name, @JsonProperty("size") String size) {
        super();
        this.name = name;
        this.size = size;
    }
}
