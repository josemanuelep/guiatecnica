package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class PasswordPage extends PageObject {
    public static final Target INPUT_PASS_1 = Target.the("").located(By.id("password"));
    public static final Target INPUT_PASS_2 = Target.the("").located(By.id("confirmPassword"));
    public static final Target BUTTON_COMPLETE = Target.the("").located(By.xpath("//span[contains(text(),'Complete Setup')]"));
    public static final Target CHECK_1 = Target.the("").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/label[1]/span[1]"));
    public static final Target CHECK_2 = Target.the("").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]"));
    public static final Target CHECK_3 = Target.the("").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]"));
}
