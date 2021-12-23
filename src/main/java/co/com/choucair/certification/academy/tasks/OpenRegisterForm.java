package co.com.choucair.certification.academy.tasks;

import co.com.choucair.certification.academy.model.FeatureData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.certification.academy.userinterface.HomePage.JOIN_TODAY_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OpenRegisterForm implements Task {


    public static OpenRegisterForm inThePage() {
        return Tasks.instrumented(OpenRegisterForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(JOIN_TODAY_BUTTON, isVisible()).forNoMoreThan(10).seconds(), Click.on(JOIN_TODAY_BUTTON));
    }
}
