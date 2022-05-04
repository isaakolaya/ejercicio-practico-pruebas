package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightsInterface extends PageObject {
    public static final Target ORIGIN_INPUT = Target.the("ORIGIN_INPUT").
            located(By.id("txtInputOrigin_field"));
    public static final Target AUTOCOMPLETE_BUTTON_O = Target.the("AUTOCOMPLETE_BUTTON").
            located(By.id("btnItemAutoComplete_0"));
    public static final Target DESTINATION_INPUT = Target.the("DESTINATION_INPUT").
            located(By.id("txtInputDestination_field"));
    public static final Target AUTOCOMPLETE_BUTTON_D = Target.the("AUTOCOMPLETE_BUTTON").
            located(By.id("btnItemAutoComplete_0"));
    public static final Target DEPARTURE_INPUT = Target.the("DEPARTURE_INPUT").
            located(By.id("departureDate"));
    public static final Target DEPARTURE_DATE = Target.the("DEPARTURE_DAY").
            located(By.xpath("//*[@id='calendarContainer']/div/div/div/div/div[2]/div[2]/div/div[3]/div/table/tbody/tr[1]/td[3]"));
    public static final Target ARRIVAL_DATE = Target.the("DEPARTURE_DAY").
            located(By.xpath("//*[@id='calendarContainer']/div/div/div/div/div[2]/div[2]/div/div[3]/div/table/tbody/tr[1]/td[7]"));
    public static final Target SEARCH_BUTTON = Target.the("SEARCH_BUTTON").
            located(By.id("btnSearchCTA"));
    public static final Target VALIDATOR_TEXT = Target.the("VALIDATOR TEXT").
            located(By.xpath("(//h2[contains(text(),'Resumen de tu viaje')])[2]"));
}
