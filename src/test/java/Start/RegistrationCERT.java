package Start;

import Info.Links;
import Sanity.BasicFLows.DocumentUpload.Upload;
import Sanity.BasicFLows.Limits.Flow;
import Sanity.BasicFLows.Login.Login;
import Sanity.BasicFLows.Logout.Logout;
import Sanity.CreditCardDeposit.Deposit;
import Sanity.RegistrationUAT.RegistrationGPT;
import com.codeborne.selenide.Configuration;
import org.apache.log4j.BasicConfigurator;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationCERT {
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
        Configuration.timeout = 60000;
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = true;
        BasicConfigurator.configure();
    }


    @Test
    public void RegistrationTN_CERT() {
        open(run.getTnCert());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationVA_CERT() {
        open(run.getVaGpt());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationNJ_CERT() {
        open(run.getNjCERT());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationIN_CERT() {
        open(run.getInCERT());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationCO_CERT() {
        open(run.getCoCert());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationWV_CERT() {
        open(run.getWvCERT());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationIA_CERT() {
        open(run.getIaCert());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationMI_CERT() {
        open(run.getMiCert());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationIL_CERT(){
        open(run.getIlCert());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationAZ_CERT() {
        open(run.getAzCert());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationLA_CERT() {
        open(run.getLaCert());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationNV_CERT() {
        open(run.getNvCert());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationNY_CERT() {
        open(run.getNyCert());
        RegistrationGPT.flow();
    }

    @Test
    public void RegistrationON_CERT() {
        open(run.getOnCert());
        RegistrationGPT.flow();
    }

}
