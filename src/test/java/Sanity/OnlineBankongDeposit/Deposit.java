package Sanity.OnlineBankongDeposit;

import Start.URL;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Deposit {
    Buttons btn = new Buttons();
    URL url = new URL();
    public void deposit() {
        Selenide.open(url.getLink());
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
        System.out.println("Chossed CC as payment method");


        $(By.id("lbx-header-title")).shouldHave(text("Select your bank"));
        System.out.println("Checked title of OB");
//        $(btn.getSearchBankFieldByName()).shouldBe(enabled).setValue("Demo Bank");
        $(By.id(btn.getDemoBankButtonById())).shouldBe(enabled).click();



//        $(btn.getSearchBankField()).setValue("Demo Bank").pressEnter();
//        $(btn.getDemoBankButton()).shouldBe(enabled).click();
//        $(btn.getOnlineBankingButton()).shouldBe(visible).click();
//        $(btn.getWarningConfirm()).shouldBe(visible).click();
//        $(btn.getUserField()).setValue("ODMEN");
//        $(btn.getPassField()).setValue("POROL");
//        $(btn.getContiniueButton1()).click();
//        $(btn.getContiniueButton2()).shouldBe(visible).click();
//        $(btn.getContiniueButton3()).shouldBe(visible).click();
//        $(btn.getFinishHeader()).shouldHave(text("Payment Receipt"));

    }
}
