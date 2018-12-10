//发起人角色
public class Originator {
    private String state;

    public Originator() {
    }

    //工厂方法，返还一个新的备忘录对象
    public MementoIF createMemento() {
        return new Memento(this.state);
    }

    //将发起人恢复到备忘录对象记录的状态
    public void restoreMemento(MementoIF memento) {
        Memento aMemento = (Memento) memento;
        this.setState(aMemento.getState());
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("state = " + state);
    }
}
