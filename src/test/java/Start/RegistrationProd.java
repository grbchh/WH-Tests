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

public class RegistrationProd {
    Sanity.RegistrationProd.RegistrationProd RegistrationProd = new Sanity.RegistrationProd.RegistrationProd();
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
    public void RegistrationTN_Prod() {
        open(run.getTnProd());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationVA_Prod() {
        open(run.getVaGpt());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationNJ_Prod() {
        open(run.getNjPROD());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationIN_Prod() {
        open(run.getInPROD());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationCO_Prod() {
        open(run.getCoProd());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationWV_Prod() {
        open(run.getWvProd());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationIA_Prod() {
        open(run.getIaProd());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationMI_Prod() {
        open(run.getMiProd());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationIL_Prod(){
        open(run.getIlProd());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationAZ_Prod() {
        open(run.getAzProd());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationLA_Prod() {
        open(run.getLaProd());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationNV_Prod() {
        open(run.getNvProd());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationNY_Prod() {
        open(run.getNyProd());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationON_Prod() {
        open(run.getOnProd());
        RegistrationProd.Flow();
    }

}
