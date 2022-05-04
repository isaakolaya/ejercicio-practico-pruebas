package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectionFlightsInterface extends PageObject {
    public static final Target Wrapper_Card_Flight = Target.the("Wrapper Card Flight").
            located(By.id("WrapperCardFlight0"));
    public static final Target PRICE_BUTTON = Target.the("PRICE_BUTTON").
            located(By.xpath("//span[contains(text(),'Mantener precio base')]"));
}
