package tests;


import org.junit.Test;

import pages.LoginPage;

public class LoginTest extends BasePageTest{
    public LoginPage loginPage;
    String emailAdress = "kaca_grcak@hotmail.com";
    String password = "testing25";
    String emptyEmail = "";
    String wrongPassword = "123456";
    String errorEmptyEmail = "An email address required.";
    String errorWrongPassword = "Authentication failed.";


    @Test
    public void verifyLoginTest(){
        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(emailAdress, password);
        loginPage.verifySuccesfulLogin("MY ACCOUNT");
        

        try{
            Thread.sleep(5000);

        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test
    public void verifyLogoutTest(){
        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(emailAdress, password);
        loginPage.clickOnLogoutMenuItem();
        loginPage.verifySuccesfulLogout("AUTHENTICATION");

        try{
            Thread.sleep(5000);

        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }

    @Test
    public void verifyUnsuccesfulLoginEmptyEmail(){
        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(emptyEmail, password);
        loginPage.verifyUnSuccesfulLogin(errorEmptyEmail);

        try{
            Thread.sleep(5000);

        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test
    public void
     verifyUnSuccesfulLoginWrongPassword(){
        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(emailAdress, wrongPassword);
        loginPage.verifyUnSuccesfulLogin(errorWrongPassword);

        try{
            Thread.sleep(5000);

        }catch(InterruptedException e){
            e.printStackTrace();
        }
     }





    
}
