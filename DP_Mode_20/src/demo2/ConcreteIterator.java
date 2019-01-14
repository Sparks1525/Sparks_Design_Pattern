package demo2;

public class ConcreteIterator extends Iterator{

    private ConcreteAggregate aggregate;
    private int  current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate){
        this.aggregate  = aggregate;
    }


    @Override
    public Object first() {
        return aggregate.get(0);
    }

    @Override
    public Object next() {

        Object ret = null;
        current++;
        if(current < aggregate.size()){
            ret = aggregate.get(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.size() ? true : false;
    }

    @Override
    public Object currentItem() {
        return aggregate.get(current);
    }
}