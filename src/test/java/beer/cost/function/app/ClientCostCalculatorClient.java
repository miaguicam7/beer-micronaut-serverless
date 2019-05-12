package beer.cost.function.app;

import io.micronaut.function.client.FunctionClient;
import io.micronaut.http.annotation.Body;
import io.micronaut.retry.annotation.Retryable;
import io.reactivex.Single;

import javax.inject.Named;

@FunctionClient
public interface ClientCostCalculatorClient {
    @Named("beer-cost")
    //TODO: externalize configuration
    @Retryable(attempts = "3", delay = "2s")
    public Single<TicketCostResponse> apply(@Body TicketCostRequest ticketCostRequest) ;
}