package Sanity.BasicFLows.Login;

import Start.URL;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Login {

    private Credentials creds = new Credentials();
    private Buttons btn = new Buttons();
    private URL run = new URL();

    @Test
    public void flow() {
        Configuration.timeout = 150000;
        Selenide.open(run.getLink());
        $(btn.getLoginButton()).shouldBe(enabled).click();
        $(btn.getEmailFiled()).shouldBe(enabled).setValue(creds.getLoginEmail());
        $(btn.getPasswordField()).shouldBe(enabled).setValue(creds.getLoginPassword());
        $(btn.getSighnInButton()).shouldBe(enabled).click();
        $(btn.getMyAccountButton()).shouldBe(visible);
        System.out.println("Logged in");
    }

    @Test
    public void CClogin() {
        Configuration.timeout = 60000;
//        Selenide.open(run.getLink());
        $(btn.getLoginButton()).shouldBe(enabled).click();
        $(btn.getEmailFiled()).shouldBe(enabled).setValue("20i4@neogames.com");
        $(btn.getPasswordField()).shouldBe(enabled).setValue("test1234");
        $(btn.getSighnInButton()).shouldBe(enabled).click();
        $(btn.getMyAccountButton()).shouldBe(visible);
        System.out.println("Logged in");
    }


}
