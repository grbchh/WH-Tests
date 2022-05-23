package Start;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.BasicConfigurator;
import org.junit.Before;

public class Config {
    @Before
    public void Basic() {
        WebDriverManager.chromedriver().setup();
        Configuration.startMaximized = true;
        Configuration.timeout = 30000;
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = true;
        BasicConfigurator.configure();
        Configuration.reportsFolder = "C:\\Users\\oleksandrh\\Desktop\\Screenshototemporingho";
        Configuration.headless = false;

    }
}
