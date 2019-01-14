package demo2;

public class Work {

    private State current;

    public Work(){
        current = new ForenoonState();
    }

    private int hour;
    private boolean finish;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void setState(State s){
        this.current = s;
    }

    public void writeProgram(){
        current.writeProgram(this);
    }
}
