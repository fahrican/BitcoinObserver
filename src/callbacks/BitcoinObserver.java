package callbacks;

public interface BitcoinObserver {

    void addObserver(UpdateObserver observer);

    void removeObserver(UpdateObserver observer);

    void notifyObserver();

}
