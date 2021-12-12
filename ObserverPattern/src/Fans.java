public class Fans extends Observer {
    private String fans_name;
    String celebrity_name;
    private Celebrity celebrity;

    public String getFans_name() {
        return fans_name;
    }

    public void setFans_name(String fans_name) {
        this.fans_name = fans_name;
    }

    public Fans(String fans_name,Celebrity celebrity) {
        this.fans_name = fans_name;
        this.celebrity = celebrity;
        celebrity.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println(celebrity.getCelebrityName() + " has tweeted ::  -> " + celebrity.getTweet() );
        System.out.println(getFans_name() + " " + "has received " + celebrity.getCelebrityName() + "'s -> " + celebrity.getTweet());
    }

}
