package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LocationPage extends PageObject {
    public static final Target INPUT_CITY = Target.the("").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("").located(By.id("zip"));
    public static final Target BUTTON_NEXT_DEVICES = Target.the("").located(By.xpath("//span[contains(text(),'Next: Devices')]"));

}
