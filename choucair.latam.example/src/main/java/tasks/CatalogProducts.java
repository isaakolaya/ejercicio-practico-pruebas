package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userInterfaces.CatalogProductsInterface;

public class CatalogProducts implements Task {
    public static CatalogProducts section() {
        return Tasks.instrumented(CatalogProducts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CatalogProductsInterface.CATALOG_BUTTON)
                , Click.on("//a[contains(text(),'Products')]")
        );
    }
}
