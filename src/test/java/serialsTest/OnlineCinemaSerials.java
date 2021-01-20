package serialsTest;

public class OnlineCinemaSerials {

    private String forSerialsLink="tab-tv-series";
    private String serialElement="//*[@id=\"tab-tv-series\"]/div[1]/div/div/div[1]/div/div/button";

    public String getForSerialsLink(){
        return forSerialsLink;
    }
    public String getSerialElement(){return serialElement;}
}
