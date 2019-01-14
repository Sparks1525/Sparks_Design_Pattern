package demo2;

public class NoonState extends State{
    @Override
    public void writeProgram(Work w) {
        if(w.getHour() < 13){

        } else {
            w.setState(new AfternoonState());
            w.writeProgram();
        }
    }
}
