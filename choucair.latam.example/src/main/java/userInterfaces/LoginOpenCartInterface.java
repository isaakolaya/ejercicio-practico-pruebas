package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginOpenCartInterface extends PageObject {
    public static final Target ENTER_USER = Target.the("username").
            located(By.name("username"));
    public static final Target ENTER_PASS = Target.the("password").
            located(By.name("password"));
    public static final Target LOGIN_BUTTON = Target.the("LOGIN_BUTTON").
            located(By.xpath("//button[contains(text(),' Login')]"));
}
