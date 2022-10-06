package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.UTestPage;

public class OpenMainPage implements Task {
    private UTestPage uTestpage;
    public static OpenMainPage getMainPage() {
        return Tasks.instrumented(OpenMainPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(uTestpage));
    }
}
