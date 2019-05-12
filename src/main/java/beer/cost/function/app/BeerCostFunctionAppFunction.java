package beer.cost.function.app;

import io.micronaut.function.FunctionBean;
import java.util.function.Supplier;

@FunctionBean("beer-cost-function-app")
public class BeerCostFunctionAppFunction implements Supplier<String> {

    @Override
    public String get() {
        return "beer-cost-function-app";
    }
}
