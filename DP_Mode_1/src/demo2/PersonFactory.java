package demo2;

public class PersonFactory {

    public static Person createStudent(){
        return new Student();
    }

    public static Person createTeacher(){
        return new Teacher();
    }

    public static Person createWorker(){
        return new Worker();
    }
}
