package Start;

import Info.Links;
import Sanity.RegistrationUAT.Credentials;
import Sanity.RegistrationUAT.RegistrationGPT;

public class URL {
    //Info
    Links RunTestOn = new Links();
    Credentials RegiGPT = new Credentials();
    ///////////////
    private String Link = RunTestOn.getNyCert();
//    private String LoginEmail = "oleksandrh@neogames.com";
      private String LoginEmail = RegiGPT.getEmail();

    ///////GETTERS

    public String getLoginEmail() {
        return LoginEmail;
    }

    public String getLink() {
        return Link;
    }
}
