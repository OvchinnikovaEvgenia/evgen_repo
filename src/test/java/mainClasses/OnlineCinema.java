package mainClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import static org.testng.AssertJUnit.assertTrue;


public class OnlineCinema  {
  public  ArrayList<String> genresList;
  public ArrayList<String> filmsList ;
  private int random;

   public void clickGenres(WebDriver driver,String dopLink){
      driver.findElement(By.xpath("//*[@id=\""+dopLink+"\"]/div[1]/div/div/div[1]/div/div/button")).click();
   }


    public void addToList(String dopLink){
        for(int i=1;i<=10;i++){
            genresList.add("//*[@id=\""+dopLink+"\"]/div[1]/div/div/div[1]/div/div/div/ul/li["+i+"]");
        }
    }



    public String randomClick(WebDriver driver,String dopLink){
        addToList(dopLink);
        random=(int)((Math.random()*9)+1);
        String genreName= driver.findElement(By.xpath(genresList.get(random))).getText();
        driver.findElement(By.xpath(genresList.get(random))).click();
        return genreName;
    }

    public ArrayList<String> createArray(WebDriver driver){
      filmsList=new ArrayList<String>();
      try {
        for(int i=1;i<=5;i++) {
            for (int j = 1; j <= 5; j++) {
                driver.findElement(By.xpath("//*[@id=\"online-cinema\"]/div[1]/ul[" + i + "]/li[" + j + "]/div"));
                filmsList.add("//*[@id=\"online-cinema\"]/div[1]/ul[" + i + "]/li[" + j + "]/div");

            }
        }
      }
      catch (NoSuchElementException e) {
          return filmsList;
      }
      return filmsList;
    }

    public void mainTest(WebDriver driver,String dopLink){
        genresList = new ArrayList<String>();
        String filmGenre;
        clickGenres(driver,dopLink);
        String element = randomClick(driver,dopLink);
        ArrayList<String> allFilms=createArray(driver);
        if(allFilms.size()!=0){
            for(String film:allFilms){
                filmGenre=driver.findElement(By.xpath(film)).getText();
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                assertTrue(filmGenre.contains(element));
            }
        }
    }

}
