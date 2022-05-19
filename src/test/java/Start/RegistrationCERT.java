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
        Configuration.timeout = 13000;
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = true;
        BasicConfigurator.configure();
    }


    @Test
    public void SignUp_CERT_Tennesey() {
        open(run.getTennesseCert());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_CERT_Virginia() {
        open(run.getVaGpt());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_CERT_NewJersey() {
        open(run.getNewJerseyCert());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_CERT_Indiana() {
        open(run.getIndianaCert());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_CERT_Colorado() {
        open(run.getColoradoCert());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_CERT_WestVirginia() {
        open(run.getWestVirginiaCert());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_CERT_Iowa() {
        open(run.getIaCert());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_CERT_Michigan() {
        open(run.getMichiganCert());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_CERT_Illinois(){
        open(run.getIlCert());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_CERT_Arizona() {
        open(run.getArizonaCert());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_CERT_Louisiana() {
        open(run.getLouisianaCert());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_CERT_Nevada() {
        open(run.getNevadaCert());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_CERT_NewYork() {
        open(run.getNewYorkCert());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_CERT_Ontario() {
        open(run.getOntarioCert());
        RegistrationGPT.Flow();
    }

    @Test
    public void SignUp_CERT_Wyoming() {
        open(run.getWyomingCert());
        RegistrationGPT.Flow();
    }
    @Test
    public void SignUp_CERT_Pensilvania() {
        open(run.getPennsylvaniaCert());
        RegistrationGPT.Flow();
    }


}
