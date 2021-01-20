package catroonTest;

public class OnlineCinemaCatroon {

    private String forCartoonLink="tab-cartoons";
    private String cartoonElement="//*[@id=\"tab-cartoons\"]/div[1]/div/div/div[1]/div/div/button";

    public String getForCartoonLink(){
        return forCartoonLink;
    }
    public String getCartoonElement(){return cartoonElement;
    }
}
