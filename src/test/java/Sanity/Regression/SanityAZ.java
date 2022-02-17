package Sanity.Regression;

import Start.DepositACH;
import Start.DepositCC;
import Start.RegistrationGPT;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.AfterClass;
import org.junit.Test;

public class SanityAZ {
    RegistrationGPT regi = new RegistrationGPT();
    DepositCC cc = new DepositCC();
    DepositACH ach = new DepositACH();

    @AfterClass
    public static void afterClass() throws Exception {
        WebDriverRunner.closeWebDriver();
    }

    @Test
    public void Registration() {
        regi.RegistrationAZ_GPT();
    }

    @Test
    public void CCdeposit() {
        cc.DepositCC_AZ();
    }

    @Test
    public void ACHdeposit() {
        ach.DepositACH_AZ();
    }
}
