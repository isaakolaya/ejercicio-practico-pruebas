package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Data;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.OpenCartAnswer;
import questions.OpenCartAnswerProducts;
import tasks.*;

import java.util.List;

public class OpenCartStepdefs {
    @Before
    public void inicair(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Isaak wants to visit the opencart website$")
    public void isaakWantsToVisitTheOpencartWebsite() {
        OnStage.theActorCalled("Isaak").wasAbleTo(OpenOCart.thePage()
        );
    }

    @And("^he log in to the opencart website$")
    public void heLogInToTheOpencartWebsite(List<Data> dataList) {
        OnStage.theActorCalled("Isaak").wasAbleTo(LoginOpenCart.thePage(dataList.get(0)));
    }

    @When("^he goes to the reporting area to review the tax report$")
    public void heGoesToTheReportingAreaToReviewTheTaxReport() {
        OnStage.theActorCalled("Isaak").attemptsTo(ReportArea.section());
    }

    @Then("^he validates report$")
    public void heValidatesReport() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(OpenCartAnswer.toThe(),
                Matchers.equalTo("Reports")));
    }

    @When("^he clicks to the catalog and clicks to the products section$")
    public void heClicksToTheCatalogAndClicksToTheProductsSection() {
        OnStage.theActorCalled("Isaak").attemptsTo(CatalogProducts.section());
    }

    @And("^he makes a filter to search for a product$")
    public void heMakesAFilterToSearchForAProduct(List<Data>dataList) {
        OnStage.theActorCalled("Isaak").attemptsTo(ProductsSection.section(dataList.get(0)));
    }

    @Then("^he validates the product$")
    public void heValidatesTheProduct() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(OpenCartAnswerProducts.toThe(),
                Matchers.equalTo("HP LP3065")));
    }
}
