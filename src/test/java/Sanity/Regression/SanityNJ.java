package Sanity.Regression;

import Sanity.CreditCardDeposit.Deposit;
import Start.DepositACH;
import Start.DepositCC;
import Start.RegistrationGPT;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SanityNJ {
    RegistrationGPT regi = new RegistrationGPT();
    DepositCC cc = new DepositCC();
    DepositACH ach = new DepositACH();

    @AfterClass
    public static void afterClass() throws Exception {
        WebDriverRunner.closeWebDriver();
    }

    @Test
    public void Registration() {
        regi.RegistrationNJ_GPT();
    }

    @Test
    public void CCdeposit() {
        cc.DepositCC_NJ();
    }

    @Test
    public void ACHdeposit() {
        ach.DepositACH_NJ();
    }
}
