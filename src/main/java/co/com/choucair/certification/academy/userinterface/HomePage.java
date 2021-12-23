package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class HomePage extends PageObject {
    public static final Target JOIN_TODAY_BUTTON = Target.the("").located(By.cssSelector("a.unauthenticated-nav-bar__sign-up"));
}
