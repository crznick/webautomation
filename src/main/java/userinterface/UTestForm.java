package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import tasks.SignUpForm;

public class UTestForm extends SignUpForm {
    //Part one
    public static final Target FIRST_NAME = Target.the("First Name Field").located(By.name("firstName"));
    public static final Target LAST_NAME = Target.the("Last Name Field").located(By.name("lastName"));
    public static final Target EMAIL_ADRESS = Target.the("Email Adress Field").located(By.name("email"));
    public static final Target BIRTH_MONTH = Target.the("Date of Birth Month").located(By.xpath("//option[contains(@label, 'May')]"));
    public static final Target BIRTH_DAY = Target.the("Date of Birth Day").located(By.xpath("//option[contains(@label, '14')]"));
    public static final Target BIRTH_YEAR = Target.the("Date of Birth Year").located(By.xpath("//option[contains(@label, '1993')]"));
    public static final Target NEXT_STEP1 = Target.the("Next Location part one Button").located(By.xpath("//a[contains(@aria-label, 'Next step - define your location')]"));


    //Part two
    public static final Target CITY = Target.the("City field").located(By.name("city"));
    public static final Target STATE = Target.the("State field").located(By.xpath("//span[contains(@aria-label, 'Select a state')]"));
    public static final Target STATE_SELECTION = Target.the("State field").located(By.xpath("//div[contains(text(), 'Florida')]"));
    public static final Target ZIP = Target.the("Zip code").located(By.name("zip"));
    public static final Target COUNTRY = Target.the("Country").located(By.xpath("//span[contains(@aria-label, 'Select a country')]"));
    public static final Target COUNTRY_SELECTION = Target.the("Country").located(By.xpath("//div[contains(text(), 'United States')]"));
    public static final Target NEXT_STEP2 = Target.the("Next Location part one Button").located(By.xpath("//a[contains(@aria-label, 'Next step - select your devices')]"));

    //Part three
    public static final Target COMPUTER = Target.the("Computer Field").located(By.xpath(""));
    public static final Target OS_VERSION = Target.the("OS Version Field").located(By.xpath(""));
    public static final Target LANGUAGE = Target.the("Language field").located(By.xpath(""));
    public static final Target NEXT_STEP3 = Target.the("Next Location part one Button").located(By.xpath("//a[contains(@aria-label, 'Next - final step')]"));


    //Part four
    public static final Target PASSWORD = Target.the("Password Field").located(By.name("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm Password Field").located(By.name("confirmPassword"));
    public static final Target TERMS_USE = Target.the("Terms and Guidelines").located(By.name("termOfUse"));
    public static final Target POLICY = Target.the("Privacy & Security Policy").located(By.name("privacySetting"));
    public static final Target NEXT_STEP4 = Target.the("Next Location part one Button").located(By.xpath("//a[contains(@aria-label, 'Complete Setup')]"));

}
