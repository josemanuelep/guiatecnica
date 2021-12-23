package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class DevicesPage extends PageObject {
    public static final Target BUTTON_SELECT_COMPUTER_OS = Target.the("").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target OPTION_COMPUTER_OS_OF = Target.the("").locatedBy("//div[contains(text(),'{0}')]");
    public static final Target BUTTON_SELECT_VERSION = Target.the("").locatedBy("//span[contains(text(),'Select a Version')]");
    public static final Target OPTION_OS_VERSION_OF = Target.the("").locatedBy("//div[contains(text(),'{0}')]");
    public static final Target BUTTON_OS_LANGUAGE = Target.the("").locatedBy("//span[contains(text(),'Select OS language')]");
    public static final Target OPTION_OS_LANGUAGE = Target.the("").locatedBy("//div[contains(text(),'Arabic')]");
    public static final Target BUTTON_SELECT_BRAND_MOVIL = Target.the("").locatedBy("//span[contains(text(),'Select Brand')]");
    public static final Target OPTION_SELECT_BRAND_MOVIL = Target.the("").locatedBy("//div[contains(text(),'Apple')]");
    public static final Target BUTTON_SELECT_MODEL_MOVIL = Target.the("").locatedBy("//span[contains(text(),'Select a Model')]");
    public static final Target OPTION_SELECT_MODEL_MOVIL = Target.the("").locatedBy("//div[text()='iPhone 4']");
    public static final Target OPTION_SELECT_OS_MOVIL = Target.the("").locatedBy("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]");
    public static final Target BUTTON_NEXT = Target.the("").locatedBy("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]");
}
