package beer.cost.function.app;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeerCostFunctionAppFunctionTest {

    @Test
    public void testFunction() throws Exception {
        EmbeddedServer server = ApplicationContext.run(EmbeddedServer.class);

        BeerCostFunctionAppClient client = server.getApplicationContext().getBean(BeerCostFunctionAppClient.class);

        assertEquals(client.index().blockingGet(), "beer-cost-function-app");
        server.stop();
    }
}
