package beer.cost.function.app;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ClientCostCalculatorTest {
    @Test
    public void testBeerCost() throws Exception {
        EmbeddedServer server = ApplicationContext.run(EmbeddedServer.class);
        ClientCostCalculatorClient client = server.getApplicationContext().getBean(ClientCostCalculatorClient.class);
        TicketBeerItem beer1 = new TicketBeerItem("MAHOU", "S");
        TicketCostRequest request = new TicketCostRequest(Arrays.asList(beer1));
        TicketCostResponse responseCost = client.apply(request).blockingGet();
        assertEquals(1.5, responseCost.getCost(),0);
        server.stop();
    }
}
