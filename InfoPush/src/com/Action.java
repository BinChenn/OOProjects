package com;

import java.util.Vector;

public class Action {
    private Vector<Observerr> obs;

    public Action(){
        obs = new Vector<>();
    }

    public synchronized void addObserver(Observerr o){
        if(o == null)
            return;
        else{
            if(!obs.contains(o))
                obs.addElement(o);
        }

    }

    public void deleteObserver(Observerr o){
        obs.removeElement(o);
    }

    public synchronized void notifyObserver(){
        Object[] temp;
        temp = obs.toArray();
        for(int i = temp.length-1; i>=0; i--)
            ((Observerr)temp[i]).update(this, null);

    }
}
