package filmTest;

import filmTest.MainPage;
import filmTest.PosterTutBy;
import mainClasses.Constants;
import mainClasses.OnlineCinema;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FilmsTest extends Constants {

    @BeforeTest
    public void beforeTest(){
        driver.manage().window().maximize();
        driver.get(TUT_BY_LINK);
        MAIN_PAGE=new MainPage();
        ONLINE_CINEMA=new OnlineCinema();
        POSTER_TUT_BY=new PosterTutBy();
        ONLN_CNM_FILM=new OnlineCinemaFilm();
    }

    @Test
    public void firstTest(){
        MAIN_PAGE.clickPoster(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(POSTER_TUT_BY.onlnCinmXPath())));
        POSTER_TUT_BY.clickOnlCinema(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ONLN_CNM_FILM.getFilmElement())));
        ONLINE_CINEMA.mainTest(driver,ONLN_CNM_FILM.getFilmDopLink());
    }

    @AfterTest
    public void afterTest(){
    driver.quit();
    }
}
