package Start;

import Info.Links;
import Sanity.BasicFLows.Login.Login;
import Sanity.CreditCardDeposit.Deposit;
import com.codeborne.selenide.Configuration;
import org.apache.log4j.BasicConfigurator;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class DepositCC {
    Login login = new Login();
    Deposit cc = new Deposit();
    Links run = new Links();

    @Before
    public void StartUp() {
        Configuration.startMaximized = true;
        Configuration.timeout = 60000;
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = true;
        BasicConfigurator.configure();
    }

    @Test
    public void DepositCC_AZ() {
        open(run.getAzGpt());
        login.flow();
        cc.flow();
    }
    @Test
    public void DepositCC_CO() {
        open(run.getCoGpt());
        login.flow();
        cc.flow();
    }
    @Test
    public void DepositCC_IA() {
        open(run.getIaGpt());
        login.flow();
        cc.flow();
    }
    @Test
    public void DepositCC_IL() {
        open(run.getIlGpt());
        login.flow();
        cc.flow();
    }
    @Test
    public void DepositCC_TN() {
        open(run.getTnGpt());
        login.flow();
        cc.flow();
    }
    @Test
    public void DepositCC_VA() {
        open(run.getVaGpt());
        login.flow();
        cc.flow();
    }
    @Test
    public void DepositCC_NJ() {
        open(run.getNjGPT());
        login.flow();
        cc.flow();
    }
    @Test
    public void DepositCC_IN() {
        open(run.getInGPT());
        login.flow();
        cc.flow();
    }
    @Test
    public void DepositCC_WV() {
        open(run.getWvGPT());
        login.flow();
        cc.flow();
    }
    @Test
    public void DepositCC_LA() {
        open(run.getLaGpt());
        login.flow();
        cc.flow();
    }
    @Test
    public void DepositCC_NV() {
        open(run.getNvGpt());
        login.flow();
        cc.flow();
    }
    @Test
    public void DepositCC_NY() {
        open(run.getNyGpt());
        login.flow();
        cc.flow();
    }
    @Test
    public void DepositCC_ON() {
        open(run.getOnGpt());
        login.flow();
        cc.flow();
    }
}

