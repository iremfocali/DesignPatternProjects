import java.util.ArrayList;

public class Celebrity implements Subject {
    private ArrayList<Observer> observers;
    private String celebrity_name;
    private String tweet;

    public Celebrity(String celebrity_name) {
        this.celebrity_name = celebrity_name;
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Fans fan) {
        observers.add(fan);
        System.out.println(fan.getFans_name() + " has started following " + celebrity_name);
    }

    @Override
    public void removeObserver(Fans fan) {
        int i = observers.indexOf(fan);
        if(i >= 0){
            observers.remove(i);
            System.out.println(fan.getFans_name() + " has stopped following " + celebrity_name);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers){
            o.update();
        }
    }

    public String getCelebrityName(){
        return celebrity_name;
    }
    public String fans_name(){
        return fans_name();
    }
    public String getTweet(){
        return tweet;
    }
    public void setTweet(String tweet){
        this.tweet = tweet;
        notifyObserver();
    }
}
