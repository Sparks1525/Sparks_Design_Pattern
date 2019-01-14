package demo2;

import java.util.*;

public class Test28 {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());

        Success v1 = new Success();
        o.display(v1);
    }
}
