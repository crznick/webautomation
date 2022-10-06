package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.UTestJoinButton;

public class ClickJoinButton implements Task {
    public static ClickJoinButton clickJoin(){
        return Tasks.instrumented(ClickJoinButton.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestJoinButton.JOIN_BUTTON));
    }
}