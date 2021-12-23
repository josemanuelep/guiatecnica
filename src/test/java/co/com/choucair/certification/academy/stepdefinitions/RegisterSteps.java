package co.com.choucair.certification.academy.stepdefinitions;

import co.com.choucair.certification.academy.interactions.FillYourself;
import co.com.choucair.certification.academy.model.FeatureData;
import co.com.choucair.certification.academy.tasks.OpenRegisterForm;
import co.com.choucair.certification.academy.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.choucair.certification.academy.Utils.Constantes.INDEX_O;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterSteps {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Go to u-test page and open register form$")
    public void goToUTestPageAndOpenRegisterForm() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), OpenRegisterForm.inThePage());
    }

    @Given("^fill the following data to register$")
    public void fillTheFollowingDataToRegister(List<FeatureData> featureDataList) {
        theActorInTheSpotlight().attemptsTo(FillYourself.inThePage(featureDataList.get(INDEX_O)));
    }

}
