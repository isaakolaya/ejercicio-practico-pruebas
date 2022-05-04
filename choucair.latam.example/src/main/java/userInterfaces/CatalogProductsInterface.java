package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CatalogProductsInterface extends PageObject {
    public static final Target CATALOG_BUTTON = Target.the("CATALOG_BUTTON").
            located(By.xpath("//a[contains(text(),'Catalog')]"));
    public static final Target PRODUCTS_BUTTON = Target.the("PRODUCTS_BUTTON").
            located(By.xpath("//a[contains(text(),'Products')]"));
}
