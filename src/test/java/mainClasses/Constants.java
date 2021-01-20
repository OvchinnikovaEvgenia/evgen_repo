package mainClasses;

import catroonTest.OnlineCinemaCatroon;
import filmTest.MainPage;
import filmTest.OnlineCinemaFilm;
import filmTest.PosterTutBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import serialsTest.OnlineCinemaSerials;

public class Constants {
   public MainPage MAIN_PAGE;
   public OnlineCinema ONLINE_CINEMA;
   public OnlineCinemaCatroon  ONLN_CNM_CARTOON;
   public OnlineCinemaFilm ONLN_CNM_FILM;
   public OnlineCinemaSerials ONLN_CNM_SERIALS;
   public PosterTutBy POSTER_TUT_BY;
   public String TUT_BY_LINK="https://www.tut.by/";
   public String LINK_ONLINE_CINEMA="https://afisha.tut.by/online-cinema/";
   public WebDriver driver;
   public WebDriverWait wait;

    @BeforeTest
    public void beforeStart(){
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
        driver=new ChromeDriver();
        wait=new WebDriverWait(driver,10);
    }

}
