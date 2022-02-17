package Start;

import Info.Links;
import Sanity.BasicFLows.Login.Login;
import Sanity.CreditCardDeposit.Deposit;
import com.codeborne.selenide.Configuration;
import org.apache.log4j.BasicConfigurator;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class DepositACH {
    Login login = new Login();
    Sanity.ACHDeposit.Deposit ach = new Sanity.ACHDeposit.Deposit();
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
    public void DepositACH_AZ() {
        open(run.getAzGpt());
        login.ACHlogin();
        ach.deposit();
    }
    @Test
    public void DepositACH_CO() {
        open(run.getCoGpt());
        login.ACHlogin();
        ach.deposit();
    }
    @Test
    public void DepositACH_IA() {
        open(run.getIaGpt());
        login.ACHlogin();
        ach.deposit();
    }
    @Test
    public void DepositACH_IL() {
        open(run.getIlGpt());
        login.ACHlogin();
        ach.deposit();
    }
    @Test
    public void DepositACH_TN() {
        open(run.getTnGpt());
        login.ACHlogin();
        ach.deposit();
    }
    @Test
    public void DepositACH_VA() {
        open(run.getVaGpt());
        login.ACHlogin();
        ach.deposit();
    }
    @Test
    public void DepositACH_NJ() {
        open(run.getNjGPT());
        login.ACHlogin();
        ach.deposit();
    }
    @Test
    public void DepositACH_IN() {
        open(run.getInGPT());
        login.ACHlogin();
        ach.deposit();
    }
    @Test
    public void DepositACH_WV() {
        open(run.getWvGPT());
        login.ACHlogin();
        ach.deposit();
    }
    @Test
    public void DepositACH_LA() {
        open(run.getLaGpt());
        login.ACHlogin();
        ach.deposit();
    }
    @Test
    public void DepositACH_NV() {
        open(run.getNvGpt());
        login.ACHlogin();
        ach.deposit();
    }
    @Test
    public void DepositACH_NY() {
        open(run.getNyGpt());
        login.ACHlogin();
        ach.deposit();
    }
    @Test
    public void DepositACH_ON() {
        open(run.getOnGpt());
        login.ACHlogin();
        ach.deposit();
    }
}
