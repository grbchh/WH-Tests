package Sanity.ACHDeposit;

import Start.URL;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Deposit {
    public void deposit() {
        Buttons btn = new Buttons();
        URL run = new URL();
        Creds creds = new Creds();

        Selenide.open(run.getLink());
        System.out.println("Website opened");
        $(btn.getAccountMenuButton()).shouldBe(Condition.enabled).click();
        System.out.println("Clicked on Account Menu button");
        $(btn.getDepositButton()).shouldBe(Condition.enabled).click();
        System.out.println("Clicked on Deposit button");
        $(btn.getSafeAndSecureElement()).shouldBe(Condition.visible);

        if($(btn.getViewAllDepositsMethodsButton()).is(Condition.visible)){
            $(btn.getViewAllDepositsMethodsButton()).click();
            System.out.println("Oh, I see you made a deposit already");
        }
        $(btn.getChooseDepositMethodButton()).should(Condition.appear);
        $(btn.getChooseDepositMethodButton()).shouldBe(Condition.enabled).click();
        System.out.println("Chossed ACH as payment method");

            $(btn.getRoutingNumberField()).shouldBe(enabled).setValue(creds.getRoutingNumber());
            $(btn.getAccountNumber()).shouldBe(enabled).setValue(creds.getAccountNumber());
            System.out.println("Entered routing and account numbers");

            $(btn.getDriverLicenseField()).shouldBe(enabled).setValue(creds.getDriverLicense());
            $(btn.getDriverLicenseStateDropdown()).shouldBe(enabled).selectOption("VA");
            System.out.println("Entered Driving License");

            $(btn.getAgreementCheckbox()).shouldBe(enabled).click();
            System.out.println("Checkbox ticked");
            $(btn.getDepositAmountField()).shouldBe(enabled).setValue("99");
            System.out.println("Amount set to $99");

            $(btn.getContinueButton()).shouldBe(enabled).click();
            System.out.println("Continue clicked");

            $(btn.getSubmitButton()).shouldBe(enabled).click();
            System.out.println("Submit clicked");

            $(btn.getDepositMenuAppearCheckHeader()).shouldHave(text("Confirmed"));
//
//
//
//            System.out.println("Detected account details, trying to delete them");
//            $(btn.getDeleteExistingCardsCredsButton()).shouldBe(Condition.enabled).click();
//            $(btn.getConfirmDeletingCardCredsButton()).shouldBe(Condition.visible).click();
//            System.out.println("Card deleted");
//            $(btn.getChooseDepositMethodButton()).shouldBe(Condition.visible).click();
//            $("#paymentForm > div.mwc-cashier-payment-tools-container.ng-scope > div > mwc-cashier-payment-logo > img").shouldBe(Condition.visible);
//
//            $(btn.getRoutingNumberField()).shouldBe(enabled).setValue(creds.getRoutingNumber());
//            $(btn.getAccountNumber()).shouldBe(enabled).setValue(creds.getAccountNumber());
//            System.out.println("Entered routing and account numbers");
//
//
//            $(btn.getDriverLicenseField()).shouldBe(enabled).setValue(creds.getDriverLicense());
//            $(btn.getDriverLicenseStateDropdown()).shouldBe(enabled).selectOption("VA");
//            System.out.println("Entered Driving License");
//
//            $(btn.getAgreementCheckbox()).shouldBe(enabled).click();
//            System.out.println("Checkbox ticked");
//            $(btn.getDepositAmountField()).shouldBe(enabled).setValue("99");
//            System.out.println("Amount set to $99");
//
//            $(btn.getContinueButton()).shouldBe(enabled).click();
//            System.out.println("Continue clicked");
//
//            $(btn.getSubmitButton()).shouldBe(enabled).click();
//            System.out.println("Submit clicked");
//
//            $(btn.getDepositMenuAppearCheckHeader()).shouldHave(text("Confirmed"));
//
//

    }
}
