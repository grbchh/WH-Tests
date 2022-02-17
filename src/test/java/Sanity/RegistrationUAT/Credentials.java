package Sanity.RegistrationUAT;

import Info.Reader;
import Tools.RandomNumberGenerator;

import java.util.Scanner;


public class Credentials {
    Reader Reader = new Reader();
    Scanner in = new Scanner(System.in);
    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();


    private String email ="20i4@neogames.com";



//     private String email = "qa__"+"Zefirka"+"@neogames.com";
//    private String email = "qa_"+"heh"+"@neogames.com";
//    private String email ="20i4@neogames.com" //in.next()+ "Neogames.com";
    //"20i4@neogames.com";
//    private String email = "R1U3@neogames.com";

    //_______________________________________________________________________________________________________________
    private String phoneNumber =  "380" + randomNumberGenerator.PhoneNumber();
//    private String phoneNumber =  "6082926307";
    //_______________________________________________________________________________________________________________
    private String username = "Candice";
    private String surname = "Mmagenta";
    private String address = "58 MARCY CT";
    private String city = "HANOVER TOWNSHIP";
    private String zipCode = "94904";
    private String ssn = "4645";
    //_______________________________________________________________________________________________________________
    private int birthdayMonth = 6;
    private int birthdayDay = 6;
    private String birthdayYear = "1989";

    private String answerSecurityQs0 = "Sandwich";
    private String answerSecurityQs1 = "Cat";
    //_______________________________________________________________________________________________________________
    private String driverLicense = "D" + randomNumberGenerator.DriverLicense();
    //_______________________________________________________________________________________________________________
    public String getUsername() {
        return username;
    }
    public String getDriverLicense() {
        return driverLicense;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getSurname() {
        return surname;
    }
    public String getEmail() {
        return email;
    }
    public int getBirthdayMonth() {
        return birthdayMonth;
    }
    public int getBirthdayDay() {
        return birthdayDay;
    }
    public String getBirthdayYear() {
        return birthdayYear;
    }
    public String getAnswerSecurityQs0() {
        return answerSecurityQs0;
    }
    public String getAnswerSecurityQs1() {
        return answerSecurityQs1;
    }
    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;
    }
    public String getZipCode() {
        return zipCode;
    }
    public String getSsn() {
        return ssn;
    }
}
