
public interface MementoIF {
}

class Memento implements MementoIF{
    private String savedState;
    protected Memento(String someState){
        savedState = someState;
    }

    public void setState(String someState){
        savedState = someState;
    }

    public String getState(){
        return savedState;
    }
}


