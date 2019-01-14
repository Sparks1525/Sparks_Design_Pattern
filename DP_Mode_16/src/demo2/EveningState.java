package demo2;

public class EveningState extends State{
    @Override
    public void writeProgram(Work w) {
        if(w.isFinish()){
            w.setState(new RestState());
            w.writeProgram();
        } else {
            if(w.getHour() < 21){

            } else {
                w.setState(new SleepingState());
                w.writeProgram();
            }
        }
    }
}
