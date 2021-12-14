package Sanity.Regression.Michigan;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class Withdraw {

    private Credentials creds = new Credentials();
    private Buttons btn = new Buttons();


    @Test
    public void Withdraw() {
//        holdBrowserOpen = true;

        Configuration.timeout = 150000;
        Selenide.open(creds.getLink());
        System.out.println("Website opened");

        $(btn.getLoginButton()).shouldBe(enabled).click();
        $(btn.getEmailFiled()).shouldBe(enabled).setValue(creds.getLoginEmail());
        $(btn.getPasswordField()).shouldBe(enabled).setValue(creds.getLoginPassword());
        $(btn.getSighnInButton()).shouldBe(enabled).click();
        $(btn.getMyAccountButton()).shouldBe(visible);
        System.out.println("Logged in");
        $(btn.getMyAccountButton()).shouldBe(enabled).click();
        sleep(2000);
        $(btn.getWithdrawButton()).shouldBe(enabled).click();
        System.out.println("Going to withdraw menu");
        $(btn.getMyAccountWithdrawLoadMenuCheck()).shouldBe(enabled);

//        do {
//            System.out.println("Need to delete previous withdraw, hold on...");
//            $(btn.getCancelWithdrawButton()).click();
//            $(btn.getCancelWithdrawConfirmationButton()).click();
//            Selenide.refresh();
//            $(btn.getMyAccountButton()).shouldBe(visible);
//            $(btn.getMyAccountButton()).click();
//            $(btn.getWithdrawButton()).click();
//            $(btn.getMyAccountWithdrawLoadMenuCheck()).shouldBe(enabled);
//            System.out.println("...done");
//        }
//        while ($(btn.getCancelWithdrawButton()).isDisplayed());
//            $(btn.getConfirmWithdrawButton()).shouldBe(enabled);

        System.out.println("Aha, Loaded");
        $(btn.getWithdrawMethodDropdown()).click();
        $(btn.getConfirmWithdrawMethobOption()).click();
        System.out.println("Choosed ACH to withdraw");

        $(btn.getAmountToWithdrawField()).setValue("25");
        System.out.println("25 buck to withdraw, check");
        $(btn.getConfirmWithdrawButton()).click();
        $(btn.getSuccessInWithdrawText()).shouldBe(visible);
        System.out.println("Withdraw sent!");
    }
}
