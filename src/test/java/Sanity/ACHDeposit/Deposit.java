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

        System.out.println("Website opened, lets wait for buttons");

        //Account button
        $(btn.getAccountMenuButton()).shouldBe(Condition.enabled).click();
        System.out.println("Clicked on Account Menu button");

        //Deposit button
        $(btn.getDepositButton()).shouldBe(Condition.enabled).click();
        System.out.println("Clicked on Deposit button");




        //Waiting for menu to load, sometimes may take a while
        $(btn.getSafeAndSecureElement()).shouldBe(Condition.visible);
        System.out.println("");


        //Entering amount
        $(btn.getDepositAmountField()).should(appear).setValue("33");
        System.out.println("Entered 33$ as deposit amount");

        //Pressing continue
        $(btn.getContinueButton()).click();
        System.out.println("LETS");

        //Pressing another continue
        $(btn.getSubmitButton()).should(appear).click();
        System.out.println("GO!");

        //Checking if deposit passed
        $(btn.getDepositMenuAppearCheckHeader()).should(appear).shouldHave(text("Confirmed"));
        System.out.println("Deposit successfull, yo!");


    }
}
