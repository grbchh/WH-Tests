package Start;

import Info.Links;
import Sanity.BasicFLows.DocumentUpload.Upload;
import Sanity.BasicFLows.Limits.Flow;
import Sanity.BasicFLows.Logout.Logout;
import Sanity.BasicFLows.Login.Login;
import Sanity.CreditCardDeposit.Deposit;
import Sanity.RegistrationUAT.RegistrationGPT;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class GPTFullSanity {
    Sanity.RegistrationUAT.RegistrationGPT RegistrationGPT = new RegistrationGPT();
    Logout logout = new Logout();
    Deposit cc = new Deposit();
    Login login = new Login();
    Flow limits = new Flow();
    Links run = new Links();
    Sanity.OnlineBankongDeposit.Deposit pwmb = new Sanity.OnlineBankongDeposit.Deposit();
    Sanity.ACHDeposit.Deposit ach = new Sanity.ACHDeposit.Deposit();
    Upload upload = new Upload();

    @Before
    public void StartUp() {
        Configuration.startMaximized = true;
        Configuration.timeout = 18000;
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = false;
        BasicConfigurator.configure();

//        login.flow();
    }


    @Test
    public void RegistrationTnGPT() {
        open(run.getTnGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationVAGPT() {
        open(run.getVaGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationNjGPT() {
        open(run.getNjGPT());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationInGPT() {
        open(run.getInGPT());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationCoGPT() {
        open(run.getCoGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationWvGPT() {
        open(run.getWvGPT());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationIaGPT() {
        open(run.getIaGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationMiGPT() {
        open(run.getMiGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationIlGPT(){
        open(run.getIlGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationAzGPT() {
        open(run.getAzGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationLaGPT() {
        open(run.getLaGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationNvGPT() {
        open(run.getNvGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationNyGPT() {
        open(run.getNyGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationOnGPT() {
        open(run.getOnGpt());
        RegistrationGPT.flow();
    }

}
