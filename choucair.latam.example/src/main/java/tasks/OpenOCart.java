package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userInterfaces.OpenCartRepository;

public class OpenOCart implements Task {
    private OpenCartRepository openCartRepository;
    public static OpenOCart thePage() {
        return Tasks.instrumented(OpenOCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(openCartRepository));
    }
}
