package demo1;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Command> orders = new ArrayList<>();

    public void setOrder(Command command){

        if(command.toString() == "没有鸡翅"){

        } else {
            orders.add(command);
        }
    }

    public void canelOrder(Command comand){
        orders.remove(comand);
    }

    public void wNotify(){
        for(Command cmd : orders){
            cmd.ExcuteCommand();
        }

    }
}
