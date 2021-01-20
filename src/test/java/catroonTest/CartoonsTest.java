package catroonTest;

import mainClasses.Constants;
import mainClasses.OnlineCinema;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CartoonsTest extends Constants {

    @BeforeTest
    public void beforeTest(){
        driver.manage().window().maximize();
        driver.get(LINK_ONLINE_CINEMA);
        ONLINE_CINEMA=new OnlineCinema();
        ONLN_CNM_CARTOON=new OnlineCinemaCatroon();
    }

    @Test
    public void cartoonTest(){
        driver.get("https://afisha.tut.by/online-cinema/animation/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ONLN_CNM_CARTOON.getCartoonElement())));
        ONLINE_CINEMA.mainTest(driver,ONLN_CNM_CARTOON.getForCartoonLink());
    }
    @AfterTest
    public void afterTest(){
    driver.quit();
    }
}
