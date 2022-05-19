package Start;

import Info.Links;
import Sanity.BasicFLows.DocumentUpload.Upload;
import Sanity.BasicFLows.Limits.Flow;
import Sanity.BasicFLows.Login.Login;
import Sanity.BasicFLows.Logout.Logout;
import Sanity.CreditCardDeposit.Deposit;
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
        Configuration.timeout = 400000;
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = true;
        BasicConfigurator.configure();
    }


    @Test
    public void RegistrationTN_Prod() {
        open(run.getTennesseProd());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationVA_Prod() {
        open(run.getVaGpt());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationNJ_Prod() {
        open(run.getNewJerseyProd());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationIN_Prod() {
        open(run.getIndianaProp());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationCO_Prod() {
        open(run.getColoradoProd());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationWV_Prod() {
        open(run.getWestVirginiaProd());
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
        open(run.getArizonaProd());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationLA_Prod() {
        open(run.getLouisianaProd());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationNV_Prod() {
        open(run.getNevadaProd());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationNY_Prod() {
        open(run.getNewYorkProd());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationON_Prod() {
        open(run.getOntarioProd());
        RegistrationProd.Flow();
    }

    @Test
    public void RegistrationWY_Prod() {
        open(run.getWyomingProd());
        RegistrationProd.Flow();
    }
    @Test
    public void RegistrationPA_Prod() {
        open(run.getPennsylvaniaProd());
        RegistrationProd.Flow();
    }
}
