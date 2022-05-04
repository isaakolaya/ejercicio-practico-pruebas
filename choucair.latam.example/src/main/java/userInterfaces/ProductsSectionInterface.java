package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsSectionInterface extends PageObject {
    public static final Target PRODUCT_NAME_INPUT = Target.the("PRODUCT_NAME_INPUT").
            located(By.name("filter_name"));
    public static final Target MODEL_INPUT = Target.the("MODEL_INPUT").
            located(By.name("filter_model"));
    public static final Target PRICE_INPUT = Target.the("PRICE_INPUT").
            located(By.name("filter_price"));
    public static final Target QUANTITY_INPUT = Target.the("QUANTITY_INPUT").
            located(By.name("filter_quantity"));
    public static final Target FILTER_BUTTON = Target.the("FILTER_BUTTON").
            located(By.id("button-filter"));
    public static final Target VALIDATOR_TEXT = Target.the("VALIDATOR_TEXT").
            located(By.xpath("//td[contains(text(),'HP LP3065')]"));
}
