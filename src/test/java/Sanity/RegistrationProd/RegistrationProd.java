package Sanity.RegistrationProd;


import Info.Links;
import Start.URL;
import Tools.RandomNumberGenerator;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationProd {
    Credentials Creds = new Credentials();
    Buttons Button = new Buttons();
    URL run = new URL();
    Sanity.RegistrationProd.Creds Filler = new Creds();
    Links link = new Links();
    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();




    @Test
    public void Flow() {
        Configuration.reportsFolder = "C:\\Users\\oleksandrh\\Desktop\\Screenshototemporingho";
        System.out.println("Website opened, now looking for that two heckin' buttons..");

        //First Registration Page
        $(Button.getRegiButton()).shouldBe(Condition.enabled).click();

        //Name
        Filler.RandomFP();

        //Email
        System.out.println("Typing email...");
        $(Button.getEmailField()).setValue(Creds.getEmail());

        //Gender
        if ($(Button.getGenderDropdown()).isDisplayed()) {
            System.out.println("Picking gender...");
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

        //Checkboxes
        $(Button.getAgreementCheckbox1()).click();
        $(Button.getAgreementCheckbox2()).click();
        $(Button.getAgreementCheckbox3()).click();
        $(Button.getAgreementCheckbox4()).click();
        System.out.println("Checkboxes ticked");

        // 1st tap
        $(Button.getFinishRegiButton()).shouldBe(Condition.enabled).click();
        System.out.println("Submit button pressed");
        $(Button.getLoadingScreenAfterSubmitBtn()).should(disappear);
        $(Button.getFinishRegiErrorText()).should(appear);

        //2nd tap
        $(Button.getFinishRegiButton()).shouldBe(Condition.enabled).click();
        System.out.println("I said submit!");
        $(Button.getLoadingScreenAfterSubmitBtn()).should(disappear);
        $(Button.getFinishRegiErrorText()).should(appear);

        //3rd tap
        $(Button.getFinishRegiButton()).shouldBe(Condition.enabled).click();
        System.out.println("I SAID SUBMIT!!!");
        $(Button.getLoadingScreenAfterSubmitBtn()).should(disappear);

        //Something I need to set wait to, so webdriver dont start verification below instantly
        $((Button.getBackButton())).should(disappear);
        $((Button.getAfterRegiContentField())).shouldBe(visible);

        if ($(Button.getAfterRegiOnfindoVerificationField()).isDisplayed()||$(Button.getDocUploadButton()).isDisplayed()){
            System.out.println("Hippity Hoppity!");
            System.out.println("This account:");
            System.out.println(Creds.getEmail());
            System.out.println("Is your property");
        }else{
            Assert.fail();
            System.out.println("No regi for you, fag");
        }







//        //This is verification of account type created
//        if($(Button.getAfterRegiDepositButton()).isDisplayed())
//        {
//            System.out.println("Registration passed, here your email:    " + Creds.getEmail());
//            System.out.println("Verified user registered! Yay!");
//        }
//        else if ($(Button.getAfterRegiUnactiveDocUploadButton()).isDisplayed())
//        {
//            System.out.println("Registration passed, here your email:    " + Creds.getEmail());
//            System.out.println("Its an unverified user! Noice!");
//        }
//        else if ($(Button.getAfterRegiOnfindoVerificationField()).isDisplayed())
//        {
//            System.out.println("Registration passed, here your email:    " + Creds.getEmail());
//            System.out.println("Its an unverified user! Onfindoooo!");
//        }
//        else {
//            Assert.fail();
//            System.out.println("IDK what the fuck I did registered,but here's your email:    " + Creds.getEmail());
//        }
    }

    public void FlowWithRandomUser() {
        Configuration.reportsFolder = "C:\\Users\\oleksandrh\\Desktop\\Screenshototemporingho";
        System.out.println("Website opened, now looking for that two heckin' buttons..");

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
        $(Button.getEmailField()).setValue("qa_"+randomNumberGenerator.RngForEmail()+"@neogames.com");

        //Gender
        System.out.println("Picking gender...");
        if ($(Button.getGenderDropdown()).isDisplayed()) {
            $(Button.getGenderDropdown()).selectOptionContainingText("Non-Binary");
        }

        //DOB
        System.out.println("Entering date of birth...");
        $(Button.getBirthdayMonthDropdown()).selectOption(randomNumberGenerator.MonthOfBirth());
        $(Button.getBirthdayDayDropdown()).selectOption(randomNumberGenerator.DayOfBirth());
        $(Button.getBirthdayYearDropdown()).selectOption(randomNumberGenerator.YearOfBirth());

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
        $(Button.getLoadingScreenAfterSubmitBtn()).should(disappear);
        //Flow If regi didnt pass after 1st try
        $(Button.getFinishRegiButton()).shouldBe(Condition.enabled).click();
        System.out.println("I said submit!");

        System.out.println("Okay, one more click on Submit Button");
        $(Button.getFinishRegiButton()).shouldBe(Condition.enabled).click();
        $(Button.getLoadingScreenAfterSubmitBtn()).should(disappear);
        $(Button.getFinishRegiButton()).shouldBe(Condition.enabled).click();

        //while...do which fails

//        if ($(Button.getFinishRegiErrorText()).isDisplayed()) {
//        do {
//                System.out.println("Okay, one more click on Submit Button");
//                $(Button.getFinishRegiButton()).shouldBe(Condition.enabled).click();
//                $(Button.getLoadingScreenAfterSubmitBtn()).should(disappear);
//                $(Button.getLoadingScreenAfterSubmitBtn()).should(disappear);
//            sleep(5000);
//
//        }
//            while ($(Button.getFinishRegiErrorText()).isDisplayed());
//        }else{
//            System.out.println("Fuck");
//        }

        //Something I need to set wait to, so webdriver dont start verification below instantly
        $((Button.getBackButton())).should(disappear);
        $(Button.getAfterRegiOnfindoVerificationField()).shouldBe(visible);

//        //This is verification of account type created
//        if($(Button.getAfterRegiDepositButton()).isDisplayed())
//        {
//            System.out.println("Registration passed, here your email:    " + Creds.getEmail());
//            System.out.println("Verified user registered! Yay!");
//        }
//        else if ($(Button.getAfterRegiUnactiveDocUploadButton()).isDisplayed())
//        {
//            System.out.println("Registration passed, here your email:    " + Creds.getEmail());
//            System.out.println("Its an unverified user! Noice!");
//        }
//        else {
//            Assert.fail();
//        }
//        else {
//            System.out.println("lol, bro, idk");
//            Configuration.holdBrowserOpen = true;
//        }
    }

}

