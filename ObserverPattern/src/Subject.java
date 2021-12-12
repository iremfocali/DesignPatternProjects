public interface Subject {
    public void registerObserver(Fans f);
    public void removeObserver(Fans f);
    public void notifyObserver();
}
