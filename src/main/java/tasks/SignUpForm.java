package tasks;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.pages.components.Dropdown;
import org.openqa.selenium.By;
import userinterface.UTestForm;

public class SignUpForm implements Task {

    public static Performable fillForm() {
        return Tasks.instrumented(SignUpForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Douglas").into(UTestForm.FIRST_NAME),
                Enter.theValue("Marin").into(UTestForm.LAST_NAME),
                Enter.theValue("doug_14@dumpmail.com").into(UTestForm.EMAIL_ADRESS),
                Click.on(UTestForm.BIRTH_MONTH),
                Click.on(UTestForm.BIRTH_DAY),
                Click.on(UTestForm.BIRTH_YEAR),
                Click.on(UTestForm.NEXT_STEP1),
                Enter.theValue("123").into(UTestForm.ZIP),
                Click.on(UTestForm.NEXT_STEP2),
                Click.on(UTestForm.NEXT_STEP3),
                Enter.theValue("ADiguhkjnsf2387!").into(UTestForm.PASSWORD),
                Enter.theValue("ADiguhkjnsf2387!").into(UTestForm.CONFIRM_PASSWORD),
                Click.on(UTestForm.TERMS_USE),
                Click.on(UTestForm.POLICY),
                Click.on(UTestForm.NEXT_STEP4)
        );
    }
}
