package demo3;

public class StockObserver {
    private String name;
    private Subject sub;

    public StockObserver(String name, Subject sub){
        this.name = name;
        this.sub = sub;
    }

    public void closeStockMarket(){
        // TODO
    }
}
