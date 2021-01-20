package filmTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage  {

    private String poster="//*[@id=\"mainmenu\"]/ul/li[5]/a";

    public String getPosterXPath(){
        return poster;
    }

    public void clickPoster(WebDriver driver){
        driver.findElement(By.xpath(poster)).click();
    }
}
