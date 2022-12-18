package Observer.bakery_NotOpenForExtention;

public interface Business {
    void attach (Observer o);
    void detach (Observer o);
    void Notify();
}
