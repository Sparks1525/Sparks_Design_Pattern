package demo2;

public class Note extends Expression {
    @Override
    public void excute(String key, double value) {
        String note  = "";
        switch (key){
            case "C":
                note = "1";
                break;
        }
    }
}
