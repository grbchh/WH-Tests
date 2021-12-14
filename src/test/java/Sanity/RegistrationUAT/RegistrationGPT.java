package Sanity.RegistrationUAT;


import Start.URL;
import com.codeborne.selenide.*;
import org.junit.Test;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationGPT {
    Credentials Creds = new Credentials();
    Buttons Button = new Buttons();
    URL run = new URL();

    @Test
    public void flow() {

        Configuration.timeout = 150000;
        Selenide.open(run.getLink());
        System.out.println("Website opened");

        //First Registration Page
        $(Button.getRegiButton()).shouldBe(Condition.enabled).click();
        $(Button.getFirstNameField()).setValue(Creds.getUsername());
        $(Button.getLastNameField()).setValue(Creds.getSurname());
        $(Button.getEmailField()).setValue(Creds.getEmail());
        //DOB
        $(Button.getBirthdayMonthDropdown()).selectOption(Creds.getBirthdayMonth());
        $(Button.getBirthdayDayDropdown()).selectOption(Creds.getBirthdayDay());
        $(Button.getBirthdayYearDropdown()).selectOption(Creds.getBirthdayYear());

        $(Button.getCellPhoneField()).setValue(Creds.getPhoneNumber());
        $(Button.getNextRegiStepButton()).click();
        System.out.println("1st page is filled with info");

        //Second Registration Page
        $(Button.getPasswordField()).setValue("test1234");
        //dropdown 1st question
        $(Button.getSecurityQuestionDropdown1()).click();
        $(Button.getSecurityQuestionField1()).setValue(Creds.getAnswerSecurityQs0());
        //dropdown 2nd question
        $(Button.getSecurityQuestionDropdown2()).click();
        $(Button.getSecurityQuestionField2()).setValue(Creds.getAnswerSecurityQs1());
        //ssn
        $(Button.getSsnField()).setValue(Creds.getSsn());
        //adress
        $(Button.getAdressField()).setValue(Creds.getAddress());
        $(Button.getCityField()).setValue(Creds.getCity());
        $(Button.getZipCodeField()).setValue(Creds.getZipCode());
        System.out.println("2nd page is filled with info");

        //Checkboxes
        $(Button.getAgreementCheckbox1()).click();
        $(Button.getAgreementCheckbox2()).click();
        $(Button.getAgreementCheckbox3()).click();
        $(Button.getAgreementCheckbox4()).click();
        System.out.println("Checkboxes ticked");


        $(Button.getFinishRegiButton()).shouldBe(Condition.visible).click();
        System.out.println("Submit button pressed");

        $((Button.getBackButton())).should(disappear);
//        sleep(5000);//????????????????????????????
        if($(Button.getAfterRegiDepositButton()).isDisplayed())
        {
            System.out.println("Registration passed, here your email:" + Creds.getEmail());
            System.out.println("Verified user registered! Yay!");
        }

        else if ($(Button.getAfterRegiUnactiveDocUploadButton()).isDisplayed())
        {
            System.out.println("Registration passed, here your email:" + Creds.getEmail());
            System.out.println("Unverified user registrated! Noice!");
        }
        else {
            System.out.println("lol, bro, idk");
            sleep(1000000);
        }
    }

}

