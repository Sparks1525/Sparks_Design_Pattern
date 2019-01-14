package demo2;

public class Test {
    public static void main(String[] args){
        Work emergencyProjects = new Work();
        emergencyProjects.setHour(9);
        emergencyProjects.writeProgram();

        emergencyProjects.setFinish(false);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(19);
        emergencyProjects.writeProgram();
    }
}
