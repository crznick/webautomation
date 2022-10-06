package co.com.choucair.certification.webautomation.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/webAutomation.feature",
        glue = {"co.com.choucair.certification.webautomation.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {

}
