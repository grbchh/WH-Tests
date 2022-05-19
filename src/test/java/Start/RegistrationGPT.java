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
        Configuration.reportsFolder = "C:\\Users\\oleksandrh\\Desktop\\Screenshototemporingho";

    }


    @Test
    public void SignUp_GPT_Tennesse() {
        open(run.getTennesseGpt());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_GPT_Virginia() {
        open(run.getVaGpt());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_GPT_NewJersey() {
        open(run.getNewJerseyGpt());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_GPT_Indiana() {
        open(run.getIndianaGpt());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_GPT_Colorado() {
        open(run.getColoradoGpt());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_GPT_WestVirginia() {
        open(run.getWestVirginiaGpt());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_GPT_Iowa() {
        open(run.getIaGpt());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_GPT_Michigan() {
        open(run.getMichiganGpt());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_GPT_Illinois(){
        open(run.getIlGpt());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_GPT_Arizona() {
        open(run.getArizonaGpt());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_GPT_Louisiana() {
        open(run.getLouisianaGpt());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_GPT_Nevada() {
        open(run.getNevadaGpt());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_GPT_NewYork() {
        open(run.getNewYorkGpt());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_GPT_Ontario() {
        open(run.getOntarioGpt());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_GPT_NevadaM() {
        open(run.getNevadaCsGpt());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_GPT_Wyoming() {
        open(run.getWyomingGpt());
        RegistrationGPT.Flow();
    }
    @Test
    public void SignUp_GPT_Pensilvania() {
        open(run.getPaGpt());
        RegistrationGPT.Flow();
    }
}
