package Observer.bakery;

public interface Business {
    void attach (Observer o);
    void detach (Observer o);
    void Notify();
}
