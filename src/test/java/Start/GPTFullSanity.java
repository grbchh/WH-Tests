package Start;

import Sanity.BasicFLows.DocumentUpload.Upload;
import Sanity.BasicFLows.Limits.Flow;
import Sanity.BasicFLows.Logout.Logout;
import Sanity.BasicFLows.Login.Login;
import Sanity.CreditCardDeposit.Deposit;
import Sanity.RegistrationUAT.RegistrationGPT;
import com.codeborne.selenide.Configuration;
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
    public void ShutDown(){

//        logout.flow();
    }

    @Test
    public void Registration() {
        RegistrationGPT.flow();
    }

//    @Test
    public void CreditCardDeposit(){
        login.flow();
        cc.flow();
    }

//    @Test
    public void ACHDeposit() {
        login.flow();
        ach.deposit();
    }

//    @Test
    public void SetResponsibleGamingLimits(){
        login.flow();
        limits.login();
    }

//    @Test
    public void OnlineBankingDeposit(){
        login.flow();
        pwmb.deposit();
    }

//    @Test
    public void UploadDocument(){
        login.flow();
        upload.upload();
    }
}
