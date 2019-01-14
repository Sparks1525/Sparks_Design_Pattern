package demo2;

public class ForenoonState extends State{
    @Override
    public void writeProgram(Work w) {
        if(w.getHour() < 12){

        } else {
            w.setState(new NoonState());
            w.writeProgram();
        }
    }
}
