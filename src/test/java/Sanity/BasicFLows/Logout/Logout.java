package Sanity.BasicFLows.Logout;

import Sanity.RegistrationUAT.Credentials;
import Start.URL;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.getSelectedRadio;

public class Logout {

    private Buttons buttons = new Buttons();
    private URL run = new URL();
    private Credentials creds = new Credentials();

    @Test
    public void flow(){
        Selenide.open(run.getLink());
        $(buttons.getMyAccountButton()) .shouldBe(enabled).click();
        $(buttons.getMenuNameField()).shouldHave(text(creds.getUsername()));
        $(buttons.getLogoutButton()).shouldBe(enabled).click();
        System.out.println("Logged out!");
    }
}
