package Sanity.BasicFLows.Login;

import Start.URL;

public class Credentials {
    private URL url = new URL();

    private String loginEmail = url.getLoginEmail();
    private String loginPassword = "test1234";


    public String getLoginEmail() {
        return loginEmail;
    }
    public String getLoginPassword() {
        return loginPassword;
    }
}
