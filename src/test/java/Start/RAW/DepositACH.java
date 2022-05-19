package Start.RAW;

import Info.Links;
import Sanity.BasicFLows.Login.Login;
import com.codeborne.selenide.Configuration;
import org.apache.log4j.BasicConfigurator;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class DepositACH {
    Login login = new Login();
    Sanity.ACHDeposit.Deposit ach = new Sanity.ACHDeposit.Deposit();
    Links run = new Links();

    @Before
    public void StartUp() {
        Configuration.startMaximized = true;
//        Configuration.timeout = 60000;
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = true;
        BasicConfigurator.configure();
    }

    @Test
    public void Deposit_ACH_GPT_Arizona() {
        open(run.getArizonaGpt());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_GPT_Colorado() {
        open(run.getColoradoGpt());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_GPT_Iowa() {
        open(run.getIaGpt());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_GPT_Illinois() {
        open(run.getIlGpt());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_GPT_Tennesse() {
        open(run.getTennesseGpt());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_GPT_Virginia() {
        open(run.getVaGpt());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_GPT_NewJersey() {
        open(run.getNewJerseyGpt());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_GPT_Indiana() {
        open(run.getIndianaGpt());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_GPT_WestVirginia() {
        open(run.getWestVirginiaGpt());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_GPT_Louisiana() {
        open(run.getLouisianaGpt());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_GPT_Nevada() {
        open(run.getNevadaGpt());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_GPT_NewYork() {
        open(run.getNewYorkGpt());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_GPT_Ontario() {
        open(run.getOntarioGpt());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_GPT_Wyoming() {
        open(run.getWyomingGpt());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_GPT_Pensilvania() {
        open(run.getPaGpt());
        login.ACHlogin();
        ach.deposit();
    }
    @Test
    public void Deposit_ACH_CERT_Arizona() {
        open(run.getArizonaCert());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_CERT_Colorado() {
        open(run.getColoradoCert());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_CERT_Iowa() {
        open(run.getIaCert());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_CERT_Illinois() {
        open(run.getIlCert());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_CERT_Tennesse() {
        open(run.getTennesseCert());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_CERT_Virginia() {
        open(run.getVaCert());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_CERT_NewJersey() {
        open(run.getNewJerseyCert());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_CERT_Indiana() {
        open(run.getIndianaCert());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_CERT_WestVirginia() {
        open(run.getWestVirginiaCert());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_CERT_Louisiana() {
        open(run.getLouisianaCert());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_CERT_Nevada() {
        open(run.getNevadaCert());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_CERT_NewYork() {
        open(run.getNewYorkCert());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_CERT_Ontario() {
        open(run.getOntarioCert());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_CERT_Wyoming() {
        open(run.getWyomingCert());
        login.ACHlogin();
        ach.deposit();
    }

    @Test
    public void Deposit_ACH_CERT_Pensilvania() {
        open(run.getPennsylvaniaCert());
        login.ACHlogin();
        ach.deposit();
    }

}
