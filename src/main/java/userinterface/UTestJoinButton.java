package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import tasks.ClickJoinButton;

public class UTestJoinButton extends ClickJoinButton {
    public static final Target JOIN_BUTTON = Target.the("Join Today Button").located(By.xpath(getPath()));

    public static String getPath() {
        return "//a[@class='unauthenticated-nav-bar__sign-up']";
    }
}
