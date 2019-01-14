package demo1;

public class Test18 {
    public static void main(String[] args){
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.getInitState();

        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setMemento(lixiaoyao.saveState());

        lixiaoyao.fight();

        lixiaoyao.recoveryState(stateAdmin.getMemento());

    }
}
