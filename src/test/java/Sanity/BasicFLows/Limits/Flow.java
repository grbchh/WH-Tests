package Sanity.BasicFLows.Limits;

import Start.URL;
import com.codeborne.selenide.*;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Flow {
    Buttons btn = new Buttons();


    @Test
    public void login(){
        $(btn.getMyAccountButton()).shouldBe(Condition.enabled).click();
        System.out.println("My Account pressed");
        $(btn.getAccountSettingsButton()).shouldBe(Condition.enabled).click();
        System.out.println("Account Settungs pressed");
        $(btn.getGamingLimitsButton()).shouldBe(Condition.enabled).click();
        System.out.println("Gaming Limits pressed");
        $(btn.getCheckIfLimitsPageLoaded()).shouldBe(Condition.visible);
        System.out.println("Page load check");


        $(By.name("Deposit[Daily]")).selectOption("$10,000");
        $(By.name("Deposit[Weekly]")).selectOption("$50,000");
        $(By.name("Deposit[Monthly]")).selectOption("$100,000");
        $(By.name("Play[Daily]")).selectOption("$10,000");
        $(By.name("Play[Weekly]")).selectOption("$50,000");
        $(By.name("Play[Monthly]")).selectOption("$100,000");
        $(By.name("LoggedInTime[Daily]")).selectOption("24 hours");


        System.out.println("Limits set");


        $(btn.getApplyButton()).shouldBe(Condition.enabled).click();
        System.out.println("pressed");
        $(btn.getConfirmButton()).shouldBe(Condition.enabled).click();

    }


}
