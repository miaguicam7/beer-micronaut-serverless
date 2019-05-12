package beer.cost.function.app;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class TicketCostResponse implements Serializable {

    private static final long serialVersionUID = -7370755938399864882L;
    private double cost=0;

    @JsonCreator
    public TicketCostResponse(@JsonProperty("cost") double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

}

