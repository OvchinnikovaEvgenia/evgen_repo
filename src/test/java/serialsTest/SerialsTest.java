package serialsTest;

import mainClasses.Constants;
import mainClasses.OnlineCinema;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SerialsTest extends Constants {
    @BeforeTest
    public void beforeTest(){
        driver.manage().window().maximize();
        driver.get(LINK_ONLINE_CINEMA);
        ONLINE_CINEMA=new OnlineCinema();
        ONLN_CNM_SERIALS=new OnlineCinemaSerials();
    }
    @Test
    public void test(){
        driver.get("https://afisha.tut.by/online-cinema/serial/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ONLN_CNM_SERIALS.getSerialElement())));
        ONLINE_CINEMA.mainTest(driver,ONLN_CNM_SERIALS.getForSerialsLink());
    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
