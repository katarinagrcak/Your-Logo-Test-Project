package tests;


import org.junit.Test;

import pages.HomePage;

public class HomePageTest extends BasePageTest{

    public HomePage homePage;

    String emailAdress = "kaca_grcak@hotmail.com";
    String password = "testing25";
    int numberOfPopularItems = 7;
    int numberOfBestSellerItems = 7;

    @Test
    public void numberOfPopularItems(){
        homePage = new HomePage(driver);
        homePage.basePage();
        homePage.numberOfPopularItems(numberOfPopularItems);

        try{
            Thread.sleep(1000);

        }catch(InterruptedException e){
            e.printStackTrace();

        }
    }

    @Test
    public void numberOfBestSellerItems(){
        homePage = new HomePage(driver);
        homePage.basePage();
        homePage.clickOnBestSellerButton();
        homePage.numberOfBestSellerItems(numberOfBestSellerItems);

        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();

        }
    }


}
    
