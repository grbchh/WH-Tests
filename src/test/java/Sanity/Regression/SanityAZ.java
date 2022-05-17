package Sanity.Regression;

import Start.DepositACH;
import Start.DepositCC;
import Start.LimitsGPT_B;
import Start.RegistrationGPT;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.apache.log4j.BasicConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SanityAZ {
    RegistrationGPT regi = new RegistrationGPT();
    DepositCC cc = new DepositCC();
    DepositACH ach = new DepositACH();
    LimitsGPT_B limits = new LimitsGPT_B();

    @BeforeClass
    public static void beforeClass() throws Exception {
        Configuration.startMaximized = true;
        Configuration.screenshots = true;
        BasicConfigurator.configure();
    }

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

    @Test
    public void SetLimits(){ limits.LimitsAZ_GPT(); }
}
