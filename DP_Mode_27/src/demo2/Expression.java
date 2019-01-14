package demo2;

public abstract class Expression {
    public void interpret(PlayContext context){
        if (context.getText().length() == 0){
            return;
        } else {

        }
    }

    public abstract void excute(String key, double value);
}
