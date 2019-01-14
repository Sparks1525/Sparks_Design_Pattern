package demo2;

public class AfternoonState extends State{
    @Override
    public void writeProgram(Work w) {
        if(w.getHour() < 17){

        } else {
            w.setState(new EveningState());
            w.writeProgram();
        }
    }
}
