package Start.RAW;

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

public class LimitsGPT_B {
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
//        Configuration.timeout = 60000;
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = true;
        BasicConfigurator.configure();
        Configuration.reportsFolder = "C:\\Users\\oleksandrh\\Desktop\\Screenshototemporingho";

    }


    @Test
    public void LimitsTN_GPT() {
        open(run.getTennesseGpt());
        RegistrationGPT.FlowWithRandomUser();
        limits.Flow();
    }

    @Test
    public void LimitsVA_GPT() {
        open(run.getVaGpt());
        RegistrationGPT.FlowWithRandomUser();
        limits.Flow();
    }

    @Test
    public void LimitsNJ_GPT() {
        open(run.getNewJerseyGpt());
        RegistrationGPT.FlowWithRandomUser();
        limits.Flow();
    }

    @Test
    public void LimitsIN_GPT() {
        open(run.getIndianaGpt());
        RegistrationGPT.FlowWithRandomUser();
        limits.Flow();
    }

    @Test
    public void LimitsCO_GPT() {
        open(run.getColoradoGpt());
        RegistrationGPT.FlowWithRandomUser();
        limits.Flow();
    }

    @Test
    public void LimitsWV_GPT() {
        open(run.getWestVirginiaGpt());
        RegistrationGPT.FlowWithRandomUser();
        limits.Flow();
    }

    @Test
    public void LimitsIA_GPT() {
        open(run.getIaGpt());
        RegistrationGPT.FlowWithRandomUser();
        limits.Flow();
    }

    @Test
    public void LimitsMI_GPT() {
        open(run.getMichiganGpt());
        RegistrationGPT.FlowWithRandomUser();
        limits.Flow();
    }

    @Test
    public void LimitsIL_GPT(){
        open(run.getIlGpt());
        RegistrationGPT.FlowWithRandomUser();
        limits.Flow();
    }

    @Test
    public void LimitsAZ_GPT() {
        open(run.getArizonaGpt());
        RegistrationGPT.FlowWithRandomUser();
        limits.Flow();
    }

    @Test
    public void LimitsLA_GPT() {
        open(run.getLouisianaGpt());
        RegistrationGPT.FlowWithRandomUser();
        limits.Flow();
    }

    @Test
    public void LimitsNvGPT() {
        open(run.getNevadaGpt());
        RegistrationGPT.FlowWithRandomUser();
        limits.Flow();
    }

    @Test
    public void LimitsNyGPT() {
        open(run.getNewYorkGpt());
        RegistrationGPT.FlowWithRandomUser();
        limits.Flow();
    }

    @Test
    public void LimitsOnGPT() {
        open(run.getOntarioGpt());
        RegistrationGPT.FlowWithRandomUser();
        limits.Flow();
    }

    @Test
    public void LimitsNVMGPT() {
        open(run.getNevadaCsGpt());
        RegistrationGPT.FlowWithRandomUser();
        limits.Flow();
    }
}
