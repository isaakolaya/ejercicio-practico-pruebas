package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userInterfaces.SelectionFlightsInterface;

public class SelectionFlights implements Task {
    public static SelectionFlights section() {
        return Tasks.instrumented(SelectionFlights.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectionFlightsInterface.Wrapper_Card_Flight)
                , Click.on(SelectionFlightsInterface.PRICE_BUTTON)
        );
    }
}
