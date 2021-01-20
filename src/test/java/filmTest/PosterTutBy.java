package filmTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PosterTutBy  {

    private String onlineCinema= "/html/body/ul/li[12]/a";

    public String onlnCinmXPath(){
        return onlineCinema;
    }

    public void clickOnlCinema(WebDriver driver){
        driver.findElement(By.xpath(onlineCinema)).click();

    }
}
