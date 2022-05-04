package tasks;

import models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userInterfaces.ProductsSectionInterface;

public class ProductsSection implements Task {
    private Data data;

    public ProductsSection(Data data) {
        this.data = data;
    }

    public static ProductsSection section(Data data) {
        return Tasks.instrumented(ProductsSection.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.getProductName()).into(ProductsSectionInterface.PRODUCT_NAME_INPUT)
                , Enter.theValue(data.getModel()).into(ProductsSectionInterface.MODEL_INPUT)
                , Enter.theValue(data.getPrice()).into(ProductsSectionInterface.PRICE_INPUT)
                , Enter.theValue(data.getQuantity()).into(ProductsSectionInterface.QUANTITY_INPUT)
                , Click.on("//select[@name='filter_status']")
                , Hit.the(Keys.ARROW_DOWN).into("//select[@name='filter_status']")
                , Hit.the(Keys.ENTER).into("//select[@name='filter_status']")
                , Click.on(ProductsSectionInterface.FILTER_BUTTON)
        );
    }
}
