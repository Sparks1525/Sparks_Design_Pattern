package demo2;

public abstract class Company {
    protected String name;
    public Company(String name){
        this.name = name;
    }

    public abstract void add(Company c);
    public abstract void remove(Company c);
    public abstract void display(Company c);
    public abstract void lineOfDuty();
}
