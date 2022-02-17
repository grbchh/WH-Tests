package Sanity.BasicFLows.Limits;

import com.codeborne.selenide.*;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Flow {
    Buttons btn = new Buttons();


    @Test
    public void Flow(){
        //My account
        $(btn.getMyAccountButton()).shouldBe(Condition.enabled).click();
        System.out.println("My Account pressed");

        //AccountSettings
        $(btn.getAccountSettingsButton()).shouldBe(Condition.enabled).click();
        System.out.println("Account Settungs pressed");

        //Gaming Limits Button
        $(btn.getGamingLimitsButton()).shouldBe(Condition.enabled).click();
        System.out.println("Gaming Limits pressed");

        //Page load check
        $(btn.getCheckIfLimitsPageLoaded()).shouldBe(Condition.visible);
        System.out.println("Page load check");

        //Daily deposit limit
        $(By.name("Deposit[Daily]")).selectOption("$10,000");

        //Weekly deposit limit
        $(By.name("Deposit[Weekly]")).selectOption("$50,000");

        //Monthly deposit limit
        $(By.name("Deposit[Monthly]")).selectOption("$100,000");

        //Daily play limit
        $(By.name("Play[Daily]")).selectOption("$10,000");

        //Weekly play limit
        $(By.name("Play[Weekly]")).selectOption("$50,000");

        //Monthly play limit
        $(By.name("Play[Monthly]")).selectOption("$100,000");

        //Time logged in
        $(By.name("LoggedInTime[Daily]")).selectOption("24 hours");
        System.out.println("Limits set");

        //Apply button
        $(btn.getApplyButton()).shouldBe(Condition.enabled).click();
        System.out.println("Apply button pressed");
        $(btn.getConfirmButton()).shouldBe(Condition.enabled).click();
        System.out.println("Confirm button pressed");

    }


}
