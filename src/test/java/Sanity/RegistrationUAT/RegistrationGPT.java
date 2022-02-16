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

        System.out.println("Website opened");

        //First Registration Page
        $(Button.getRegiButton()).shouldBe(Condition.enabled).click();

        //Name
        System.out.println("Typing name...");
        $(Button.getFirstNameField()).setValue(Creds.getUsername());
        $(Button.getLastNameField()).setValue(Creds.getSurname());

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

        //ssn
        System.out.println("Typing SSN...");
        $(Button.getSsnField()).setValue(Creds.getSsn());

        //adress
        System.out.println("Typing adress...");
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

        // Final Submit Button
        $(Button.getFinishRegiButton()).shouldBe(Condition.visible).click();
        System.out.println("Submit button pressed");

        //Something I need to set wait to, so webdriver dont start verification instantly
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
            System.out.println("Unverified user registrated! Noice!");
        }
        else {
            Selenide.
        }
//        else {
//            System.out.println("lol, bro, idk");
//            Configuration.holdBrowserOpen = true;
//        }
    }

}

