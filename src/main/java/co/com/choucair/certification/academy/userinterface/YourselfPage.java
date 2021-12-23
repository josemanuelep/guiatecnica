package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class YourselfPage extends PageObject {
    public static final Target INPUT_FIRST_NAME = Target.the("").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("").located(By.id("email"));
    public static final Target INPUT_BIRTH_MONTH = Target.the("").located(By.id("birthMonth"));
    public static final Target INPUT_BIRTH_DAY = Target.the("").located(By.id("birthDay"));
    public static final Target INPUT_BIRTH_YEAR = Target.the("").located(By.id("birthYear"));
    public static final Target BUTTON_NEXT = Target.the("").located(By.xpath("//span[contains(text(),'Next: Location')]"));
}
