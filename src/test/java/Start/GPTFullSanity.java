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

    //    @After
    public void ShutDown() {

//        logout.flow();
    }

    @Test
    public void RegistrationTnGPT() {
        Selenide.open(run.getTnGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationVAGPT() {
        Selenide.open(run.getVaGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationNjGPT() {
        Selenide.open(run.getNjGPT());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationInGPT() {
        Selenide.open(run.getInGPT());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationCoGPT() {
        Selenide.open(run.getCoGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationWvGPT() {
        Selenide.open(run.getWvGPT());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationIaGPT() {
        Selenide.open(run.getIaGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationMiGPT() {
        Selenide.open(run.getMiGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationIlGPT(){
        Selenide.open(run.getIlGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationAzGPT() {
        Selenide.open(run.getAzGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationLaGPT() {
        Selenide.open(run.getLaGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationNvGPT() {
        Selenide.open(run.getNvGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationNyGPT() {
        Selenide.open(run.getNyGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationOnGPT() {
        Selenide.open(run.getOnGpt());
        RegistrationGPT.flow();
    }

}
