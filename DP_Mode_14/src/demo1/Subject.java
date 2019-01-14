package demo1;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void myNotify();
    String getSubjectState();
    void setSubjectState(String state);
}
