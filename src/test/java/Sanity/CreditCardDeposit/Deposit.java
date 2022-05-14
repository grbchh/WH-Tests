package Sanity.CreditCardDeposit;

import Start.URL;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Deposit {
    Buttons btn = new Buttons();
    Credentials creds = new Credentials();

    public void flow(){


        $(btn.getAccountMenuButton()).shouldBe(Condition.enabled).click();
        System.out.println("Clicked on Account Menu button");
        $(btn.getDepositButton()).shouldBe(Condition.enabled).click();
        System.out.println("Clicked on Deposit button");
        $(btn.getSafeAndSecureElement()).shouldBe(Condition.visible);



        if($(btn.getViewAllDepositsMethodsButton()).is(Condition.enabled)){
            $(btn.getDeleteExistingCardsCredsButton()).click();
            $(btn.getConfirmDeletingCardCredsButton()).click();
            System.out.println("Oh, I see you made a deposit already");
        }
        $(btn.getChooseDepositMethodButton()).should(Condition.appear);
        $(btn.getChooseDepositMethodButton()).shouldBe(Condition.enabled).click();
        System.out.println("Chossed CC as payment method");
        // Entering Data
        $(btn.getNameOnCardField()).shouldBe(Condition.visible);
        $(btn.getNameOnCardField()).shouldBe(Condition.enabled).setValue("Taras Shevchenko");
        System.out.println("Name entered");
        $(btn.getCardNumberField()).shouldBe(Condition.visible).setValue(creds.getCreditCardNumber());
        System.out.println("Card number entered");
        $(btn.getExpirationMonthDropdown()).selectOption(creds.getExpirationMonth());
        System.out.println("Month picked");
        $(btn.getExpirationYearDropdown()).selectOption(creds.getExpirationYear());
        System.out.println("Year picked");
        $(btn.getCvvField()).setValue(creds.getCVV());
        System.out.println("CVV entered");
        $(btn.getAmountField()).setValue("100");
        System.out.println("Amount set to $100");
        $(btn.getSubmitDepositFormButton()).click();
        System.out.println("Clicked on continue button");
        $(btn.getSummarySubmitDepositFormButton()).shouldBe(Condition.enabled).click();
        System.out.println("Clicked on submit button");
        $(btn.getFinishHeader()).shouldBe(Condition.visible).shouldHave(Condition.text("Confirmed"));

//        if($(btn.getCheckIfNoCardAddedBeforeField()).has(Condition.text("Add credit or debit card"))){
//
//        }else {
//            System.out.println("Detected card details, trying to delete them");
//            $(btn.getDeleteExistingCardsCredsButton()).shouldBe(Condition.enabled).click();
//            $(btn.getConfirmDeletingCardCredsButton()).shouldBe(Condition.visible).click();
//            System.out.println("Card deleted");
//            $(btn.getChooseDepositMethodButton()).shouldBe(Condition.visible).click();
//            $("#paymentForm > div.mwc-cashier-payment-tools-container.ng-scope > div > mwc-cashier-payment-logo > img").shouldBe(Condition.visible);
//            $(btn.getNameOnCardField()).shouldBe(Condition.enabled).setValue("Taras Shevchenko");
//            System.out.println("Name entered");
//            $(btn.getCardNumberField()).shouldBe(Condition.visible).setValue(creds.getCreditCardNumber());
//            System.out.println("Card number entered");
//            $(btn.getExpirationMonthDropdown()).selectOption(creds.getExpirationMonth());
//            System.out.println("Month picked");
//            $(btn.getExpirationYearDropdown()).selectOption(creds.getExpirationYear());
//            System.out.println("Year picked");
//            $(btn.getCvvField()).setValue(creds.getCVV());
//            System.out.println("CVV entered");
//            $(btn.getAmountField()).setValue("1000");
//            System.out.println("Amount set to $1000");
//            $(btn.getSubmitDepositFormButton()).click();
//            System.out.println("Clicked on continue button");
//            $(btn.getSummarySubmitDepositFormButton()).shouldBe(Condition.enabled).click();
//            System.out.println("Clicked on submit button");
//            $(btn.getFinishHeader()).shouldBe(Condition.visible).shouldHave(Condition.text("Confirmed"));
//        }
    }


}
