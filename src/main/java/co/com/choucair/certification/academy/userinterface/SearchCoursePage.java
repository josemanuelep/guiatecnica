package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTOM_UC = Target.the("buttom that selects universidad choucair").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE = Target.the("to search a course").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("button to search a course").located(By.id("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("to search course").located(By.xpath("//h4[contains(text(),'Recursos Automatización Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("extract the name of the course").located(By.xpath("//h1[contains(text(),'Recursos Automatización Bancolombia')]"));
}
