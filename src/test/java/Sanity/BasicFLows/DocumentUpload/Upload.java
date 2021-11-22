package Sanity.BasicFLows.DocumentUpload;

import Start.URL;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

public class Upload {
    public void upload(){
        Buttons btn = new Buttons();
        Files files = new Files();
        URL url = new URL();

        Selenide.open(url.getLink());
        Selenide.$(btn.getAccountMenuButton()).shouldBe(Condition.enabled).click();
        Selenide.$(btn.getAccountSettingsButton()).shouldBe(Condition.enabled).click();
        Selenide.$(btn.getSecureDocumentUploadButton()).shouldBe(Condition.enabled).click();
        Selenide.$(btn.getUploadDocumentField()).uploadFile(files.jpg);
        Selenide.$(btn.getUploadDocumentField()).uploadFile(files.pdf);
        Selenide.$(btn.getSubmitButton()).shouldBe(Condition.enabled).click();


    }
}
