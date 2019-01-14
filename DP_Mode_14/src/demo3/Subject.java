package demo3;

import demo1.Observer;

public interface Subject {
    void myNotify();
    String getSubjectState();
    void setSubjectState(String state);
}
