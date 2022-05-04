package tasks;

import models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterfaces.FlightsInterface;

public class Flights implements Task {
    private Data data;

    public Flights(Data data) {
        this.data = data;
    }

    public static Flights section(Data data) {
        return Tasks.instrumented(Flights.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                  Enter.theValue(data.getOrigin()).into(FlightsInterface.ORIGIN_INPUT)
                , Click.on(FlightsInterface.AUTOCOMPLETE_BUTTON_O)
                , Enter.theValue(data.getDestination()).into(FlightsInterface.DESTINATION_INPUT)
                , Click.on(FlightsInterface.AUTOCOMPLETE_BUTTON_D)
                , Click.on(FlightsInterface.DEPARTURE_INPUT)
                , Click.on(FlightsInterface.DEPARTURE_DATE)
                , Click.on(FlightsInterface.ARRIVAL_DATE)
                , Click.on(FlightsInterface.SEARCH_BUTTON)
        );
    }
}
