package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userInterfaces.Repository;

public class OpenThePage implements Task {
    private Repository repository;
    public static OpenThePage thePage() {
        return Tasks.instrumented(OpenThePage.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(repository));
    }

}
