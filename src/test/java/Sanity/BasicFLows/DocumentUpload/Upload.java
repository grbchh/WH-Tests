package Sanity.BasicFLows.DocumentUpload;

import Start.URL;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class Upload {
    public void upload(){
        Buttons btn = new Buttons();
        Files files = new Files();
        URL url = new URL();

        Selenide.open(url.getLink());
        System.out.println("Opened your shitty website");
        $(btn.getAccountMenuButton()).shouldBe(Condition.enabled).click();
        System.out.println("Ckicked on menu");
        $(btn.getAccountSettingsButton()).shouldBe(Condition.enabled).click();
        System.out.println("Clicked on account settings");
        $(btn.getSecureDocumentUploadButton()).shouldBe(Condition.enabled).click();
        System.out.println("Clicked on doc upload");

        $(btn.getUpladdocbutton()).uploadFile(new File("C:\\\\Users\\\\oleksandrh\\\\Documents\\\\upload\\\\jpg.jpg\", \"jpg.jpg"));
//        $(btn.getUpladdocbutton()).uploadFile(files.jpg);
//        $(By.name("Add new")).uploadFile(files.jpg);

        $(btn.getUploadDocumentField()).uploadFile(files.jpg);
        System.out.println("uploaded jpg");
        $(btn.getUploadDocumentField()).uploadFile(files.pdf);
        System.out.println();
        $(btn.getSubmitButton()).shouldBe(Condition.enabled).click();


    }
}
