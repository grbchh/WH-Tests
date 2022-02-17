package Sanity.RegistrationUAT;


import Info.Links;
import Start.URL;
import com.codeborne.selenide.*;
import org.junit.Assert;
import org.junit.Test;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import static org.junit.Assert.assertEquals;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.assertEquals;

public class RegistrationGPT {
    Credentials Creds = new Credentials();
    Buttons Button = new Buttons();
    URL run = new URL();
    Creds Filler = new Creds();
    Links link = new Links();




    @Test
    public void flow() {
        Configuration.reportsFolder = "C:\\Users\\oleksandrh\\Desktop\\Screenshototemporingho";
        System.out.println("Website opened");

        //First Registration Page
        $(Button.getRegiButton()).shouldBe(Condition.enabled).click();

        //Name
        Filler.RandomFP();
//        if (WebDriverRunner.url().equals(link.getNjGPT())){
//            Filler.CandiceMmagentaFP();
//        }else{
//            Filler.CoresCherylFP();
//        }

        //Email
        System.out.println("Typing email...");
        $(Button.getEmailField()).setValue(Creds.getEmail());

        //Gender
        System.out.println("Picking gender...");
        if ($(Button.getGenderDropdown()).isDisplayed()) {
            $(Button.getGenderDropdown()).selectOptionContainingText("Non-Binary");
        }

        //DOB
        System.out.println("Entering date of birth...");
        $(Button.getBirthdayMonthDropdown()).selectOption(Creds.getBirthdayMonth());
        $(Button.getBirthdayDayDropdown()).selectOption(Creds.getBirthdayDay());
        $(Button.getBirthdayYearDropdown()).selectOption(Creds.getBirthdayYear());

        //Phone Number
        System.out.println("Typing phone number...");
        $(Button.getCellPhoneField()).setValue(Creds.getPhoneNumber());

        //Driver License for Nevada
        if ($(Button.getIDTypeDropdown()).isDisplayed()){
            System.out.println("Typing DL...");
            $(Button.getDrivingLicenseNumberField()).setValue(Creds.getDriverLicense());
            $(Button.getIDExpiresDayDropdown()).selectOption(13);
            $(Button.getIDExpiresMonthDropdown()).selectOptionContainingText("8");
            $(Button.getIDExpiresYearDropdown()).selectOption(2025);
//            $((Button.getIDTypeDropdown())).selectOption("Driving license");
        }

        //"Next" button
        $(Button.getNextRegiStepButton()).click();
        System.out.println("1st page is filled with info");

        //Second Registration Page
        System.out.println("Entering stronk password...");
        $(Button.getPasswordField()).setValue("test1234");

        //dropdown 1st question
        System.out.println("Typing first secret question...");
        $(Button.getSecurityQuestionDropdown1()).click();
        $(Button.getSecurityQuestionField1()).setValue(Creds.getAnswerSecurityQs0());

        //dropdown 2nd question
        System.out.println("Typing second secret question...");
        $(Button.getSecurityQuestionDropdown2()).click();
        $(Button.getSecurityQuestionField2()).setValue(Creds.getAnswerSecurityQs1());

        //SSN & ADRESS
        Filler.RandomSP();
//        if (WebDriverRunner.url().equals(link.getNjGPT())){
//            Filler.CandiceMmagentaSP();
//        }else{
//            Filler.CoresCherylSP();
//        }

        //Checkboxes
        $(Button.getAgreementCheckbox1()).click();
        $(Button.getAgreementCheckbox2()).click();
        $(Button.getAgreementCheckbox3()).click();
        $(Button.getAgreementCheckbox4()).click();
        System.out.println("Checkboxes ticked");

        // Final Submit Button
        $(Button.getFinishRegiButton()).shouldBe(Condition.visible).click();
        System.out.println("Submit button pressed");

        //Flow If regi didnt pass after 1st try
        if ($(Button.getFinishRegiErrorText()).isDisplayed()) {
            do {
                System.out.println("Okay, one more click on Submit Button");
                $(Button.getFinishRegiButton()).shouldBe(Condition.visible).click();
                $(Button.getLoadingScreenAfterSubmitBtn()).should(disappear);
                $(Button.getLoadingScreenAfterSubmitBtn()).should(disappear);
            }
            while ($(Button.getFinishRegiErrorText()).isDisplayed());
        }

        //Something I need to set wait to, so webdriver dont start verification below instantly
        $((Button.getBackButton())).should(disappear);

        //This is verification of account type created
        if($(Button.getAfterRegiDepositButton()).isDisplayed())
        {
            System.out.println("Registration passed, here your email:    " + Creds.getEmail());
            System.out.println("Verified user registered! Yay!");
        }
        else if ($(Button.getAfterRegiUnactiveDocUploadButton()).isDisplayed())
        {
            System.out.println("Registration passed, here your email:    " + Creds.getEmail());
            System.out.println("Its an unverified user! Noice!");
        }
        else {
            Assert.fail();
        }
//        else {
//            System.out.println("lol, bro, idk");
//            Configuration.holdBrowserOpen = true;
//        }
    }

}

