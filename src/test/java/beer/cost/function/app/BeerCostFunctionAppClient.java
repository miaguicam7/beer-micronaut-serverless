package beer.cost.function.app;

import io.micronaut.function.client.FunctionClient;
import io.reactivex.Single;

import javax.inject.Named;

@FunctionClient
public interface BeerCostFunctionAppClient {

    @Named("beer-cost-function-app")
    Single<String> index();

}
