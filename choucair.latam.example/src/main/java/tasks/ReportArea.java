package tasks;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userInterfaces.ReportAreaInterface;

public class ReportArea implements Task {

    public static ReportArea section() {
        return Tasks.instrumented(ReportArea.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ReportAreaInterface.REPORT_BUTTON_1)
                , Click.on(ReportAreaInterface.REPORT_BUTTON_2)
                , Click.on("//select[@name='report']")
                , Hit.the(Keys.ARROW_DOWN).into("//select[@name='report']")
                , Hit.the(Keys.ARROW_DOWN).into("//select[@name='report']")
                , Hit.the(Keys.ARROW_DOWN).into("//select[@name='report']")
                , Hit.the(Keys.ENTER).into("//select[@name='report']")
        );
    }
}
