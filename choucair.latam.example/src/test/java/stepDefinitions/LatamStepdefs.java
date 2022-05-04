package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Data;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.OpenPage;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.LatamAnswer;
import questions.OpenCartAnswer;
import tasks.Flights;
import tasks.OpenThePage;
import tasks.SelectionFlights;

import java.util.List;

public class LatamStepdefs {
    @Before
    public void inicair(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Isaak wants to visit the Latam website$")
    public void isaakWantsToVisitTheLatamWebsite() {
        OnStage.theActorCalled("Isaak").wasAbleTo(OpenThePage.thePage());
    }

    @When("^Select the Use LATAM Pass Miles checkbox to then enter the origin and destination plus the departure date and the return date of the flight and click the Search button$")
    public void selectTheUseLATAMPassMilesCheckboxToThenEnterTheOriginAndDestinationPlusTheDepartureDateAndTheReturnDateOfTheFlightAndClickTheSearchButton(List<Data>dataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(Flights.section(dataList.get(0)));
    }

    @Then("^he validates the flights$")
    public void heValidatesTheFlights() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(LatamAnswer.toThe(),
                Matchers.equalTo("Resumen de tu viaje")));
    }
}
