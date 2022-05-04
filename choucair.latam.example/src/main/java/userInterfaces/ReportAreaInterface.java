package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReportAreaInterface extends PageObject {
    public static final Target REPORT_BUTTON_1 = Target.the("REPORT_BUTTON_1").
            located(By.xpath("(//a[contains(text(),'Reports')])[1]"));
    public static final Target REPORT_BUTTON_2 = Target.the("REPORT_BUTTON_1").
            located(By.xpath("(//a[contains(text(),'Reports')])[2]"));
    public static final Target VALIDATOR_TEXT = Target.the("Verificar").
            located(By.xpath("//*[@id='content']/div[1]/div/h1"));
}
