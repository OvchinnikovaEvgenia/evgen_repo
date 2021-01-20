package filmTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlineCinemaFilm {

    private String forFilmsLink="tab-films";
    private String filmGenres="//*[@id=\"tab-films\"]/div[1]/div/div/div[1]/div/div/button";

    public  String getFilmElement(){
        return filmGenres;
    }

    public String getFilmDopLink(){
        return forFilmsLink;
    }
}
