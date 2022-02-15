package Sanity.BasicFLows.DocumentUpload;

import java.io.File;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;


public class Files {
    File jpg = new File("C:\\Users\\oleksandrh\\Documents\\upload\\jpg.jpg", "jpg.jpg");
    File pdf = new File("C:\\Users\\oleksandrh\\Documents\\upload\\pdf.pdf", "pdf.pdf");

    public File getJpg() {
        return jpg;
    }
    public File getPdf() {
        return pdf;
    }
}
