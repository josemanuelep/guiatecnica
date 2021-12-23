package co.com.choucair.certification.academy.interactions;

import co.com.choucair.certification.academy.model.FeatureData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.certification.academy.userinterface.YourselfPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillYourself implements Interaction {

    private FeatureData featureData;

    public FillYourself(FeatureData featureData) {
        this.featureData = featureData;
    }

    public static FillYourself inThePage(FeatureData featureData) {
        return new FillYourself(featureData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(INPUT_FIRST_NAME, isVisible()).forNoMoreThan(10).seconds(), Enter.theValue(featureData.getFirstName()).into(INPUT_FIRST_NAME),
                Enter.theValue(featureData.getLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(featureData.getEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(featureData.getMonthBirth()).from(INPUT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(featureData.getDayBirth()).from(INPUT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(featureData.getYearBirth()).from(INPUT_BIRTH_YEAR),
                WaitUntil.the(BUTTON_NEXT, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_NEXT));
    }
}
