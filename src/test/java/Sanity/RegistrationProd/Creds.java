package Sanity.RegistrationProd;

import Tools.RandomNumberGenerator;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class Creds {
    Buttons Button = new Buttons();
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
        $(Button.getFirstNameField()).setValue("Crypto");
        $(Button.getLastNameField()).setValue("Bro");
    };
    public void RandomSP (){
        //ssn
        System.out.println("Typing SSN...");
        $(Button.getSsnField()).setValue(randomNumberGenerator.RoutingNumber());

        //аdress
        System.out.println("Typing adress...");
        $(Button.getAdressField()).setValue("Qeckington St");
        $(Button.getCityField()).setValue("Hehester");
        $(Button.getZipCodeField()).setValue(randomNumberGenerator.RoutingNumber());
        System.out.println("2nd page is filled with info");
    };
}


