package co.com.choucair.certification.webautomation.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.ClickJoinButton;
import tasks.OpenMainPage;
import tasks.SignUpForm;

import java.security.Signature;

public class uTestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the user are at uTest home page$")
    public void the_user_are_at_uTest_home_page() {
        OnStage.theActorCalled("User").wasAbleTo(OpenMainPage.getMainPage());
    }


    @When("^clicks on the Join Today button$")
    public void clicks_on_the_Join_Today_button() {
        OnStage.theActorCalled("User").attemptsTo(ClickJoinButton.clickJoin());
    }

    @Then("^user get redirected to the sign up form and fill form$")
    public void user_get_redirected_to_the_sign_up_form() {
        OnStage.theActorCalled("User").wasAbleTo(SignUpForm.fillForm());
    }
}
