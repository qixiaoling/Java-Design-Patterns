package Observer.dp_lunch;


public interface Subject {
    void attach (Observer o);
    void detach (Observer o);
    void Notify();
}
