package Sanity.RegistrationUAT;

import Tools.RandomNumberGenerator;


public class Credentials {
    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

//     private String email = "qa__"+"r390gt"+"@neogames.com";
//    private String email = "qa_"+"heh"+"@neogames.com";
    private String email = "achachhachac@neogames.com";

    //_______________________________________________________________________________________________________________
    private String phoneNumber =  "380" + randomNumberGenerator.PhoneNumber();
//    private String phoneNumber =  "3800495934";
    //_______________________________________________________________________________________________________________
    private String username = "Cores";
    private String surname = "Cheryl";
    private String address = "9884 21 June St";
    private String city = "Keene";
    private String zipCode = "59201";
    private String ssn = "0294";
    //_______________________________________________________________________________________________________________
    private int birthdayMonth = 6;
    private int birthdayDay = 6;
    private String birthdayYear = "1989";

    private String answerSecurityQs0 = "Sandwich";
    private String answerSecurityQs1 = "Cat";
    //_______________________________________________________________________________________________________________
    public String getUsername() {
        return username;
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
