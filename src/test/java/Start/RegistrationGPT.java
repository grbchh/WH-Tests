package Start;

import Info.Links;
import Sanity.BasicFLows.DocumentUpload.Upload;
import Sanity.BasicFLows.Limits.Flow;
import Sanity.BasicFLows.Logout.Logout;
import Sanity.BasicFLows.Login.Login;
import Sanity.CreditCardDeposit.Deposit;
import com.codeborne.selenide.Configuration;
import org.apache.log4j.BasicConfigurator;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationGPT {
    Sanity.RegistrationUAT.RegistrationGPT RegistrationGPT = new Sanity.RegistrationUAT.RegistrationGPT();
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
        Configuration.timeout = 60000;
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = true;
        BasicConfigurator.configure();

    }


    @Test
    public void RegistrationTN_GPT() {
        open(run.getTnGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationVA_GPT() {
        open(run.getVaGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationNJ_GPT() {
        open(run.getNjGPT());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationIN_GPT() {
        open(run.getInGPT());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationCO_GPT() {
        open(run.getCoGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationWV_GPT() {
        open(run.getWvGPT());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationIA_GPT() {
        open(run.getIaGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationMI_GPT() {
        open(run.getMiGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationIL_GPT(){
        open(run.getIlGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationAZ_GPT() {
        open(run.getAzGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationLA_GPT() {
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
