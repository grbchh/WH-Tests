package Sanity.RegistrationUAT;

import Start.URL;
import Tools.RandomNumberGenerator;
import com.github.javafaker.Faker;
import org.junit.Test;
import Start.URL;
import com.codeborne.selenide.*;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Creds {
    Buttons Button = new Buttons();
    Faker faker = new Faker();
    String name = faker.name().fullName();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String streetAddress = faker.address().streetAddress();
    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();



    //Candice Mmagenta
    public void CandiceMmagentaFP (){
        $(Button.getFirstNameField()).shouldBe(Condition.visible);
        $(Button.getFirstNameField()).setValue("Candice");
        $(Button.getLastNameField()).setValue("Mmagenta");
    };
    public void CandiceMmagentaSP (){
        //ssn
        System.out.println("Typing SSN...");
        $(Button.getSsnField()).setValue("4645");

        //аdress
        System.out.println("Typing adress...");
        $(Button.getAdressField()).setValue("58 MARCY CT");
        $(Button.getCityField()).setValue("HANOVER TOWNSHIP");
        $(Button.getZipCodeField()).setValue("94904");
        System.out.println("2nd page is filled with info");
    };

    //Cores Cheryl
    public void CoresCherylFP (){
        $(Button.getFirstNameField()).setValue("Cores");
        $(Button.getLastNameField()).setValue("Cheryl");
    };
    public void CoresCherylSP (){
        //ssn
        System.out.println("Typing SSN...");
        $(Button.getSsnField()).setValue("1379");

        //аdress
        System.out.println("Typing adress...");
        $(Button.getAdressField()).setValue("9884 21 June St");
        $(Button.getCityField()).setValue("Keene");
        $(Button.getZipCodeField()).setValue("59201");
        System.out.println("2nd page is filled with info");
    };

    //Random
    public void RandomFP (){
        $(Button.getFirstNameField()).shouldBe(Condition.visible);
        $(Button.getFirstNameField()).setValue(firstName);
        $(Button.getLastNameField()).setValue(lastName);
    };
    public void RandomSP (){
        //ssn
        System.out.println("Typing SSN...");
        $(Button.getSsnField()).setValue(randomNumberGenerator.RoutingNumber());

        //аdress
        System.out.println("Typing adress...");
        $(Button.getAdressField()).setValue(streetAddress);
        $(Button.getCityField()).setValue(lastName);
        $(Button.getZipCodeField()).setValue(randomNumberGenerator.RoutingNumber());
        System.out.println("2nd page is filled with info");
    };

    //Fred Nobu ACH guy
    public void ACHGuyFP (){
        $(Button.getFirstNameField()).shouldBe(Condition.visible);
        $(Button.getFirstNameField()).setValue("Fred");
        $(Button.getLastNameField()).setValue("Nobu");
    };
    public void ACHGuySP (){
        //ssn
        System.out.println("Typing SSN...");
        $(Button.getSsnField()).setValue("3456");

        //аdress
        System.out.println("Typing adress...");
        $(Button.getAdressField()).setValue("45 9th STREET N");
        $(Button.getCityField()).setValue("PHOENIX");
        $(Button.getStateSelector()).selectOptionContainingText("Arizona");
        $(Button.getZipCodeField()).setValue("85020");
        System.out.println("2nd page is filled with info");
    };
}


