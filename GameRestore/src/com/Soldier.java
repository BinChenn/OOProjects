package com;

public class Soldier {
    private String name;
    private int life;
    private int attack;
    private int defence;

    public Soldier(String name){
        this.name = name;
        this.life = 100;
        this.attack = 100;
        this.defence = 100;
    }

    public MementoIF createMemento(){
        return new Memento(this.life, this.attack, this.defence);
    }

    public void restoreMemento(MementoIF mem){
        Memento newmem = (Memento) mem;
        this.life = newmem.getLife();
        this.attack = newmem.getAttack();
        this.defence = newmem.getDefence();
    }

    public void fight(){
        this.life = 0;
        this.attack = 0;
        this.defence = 0;
    }


    private class Memento implements MementoIF {
        private int life;
        private int attack;
        private int defence;

        public Memento(int life, int attack, int defence){
            Memento.this.life = life;
            Memento.this.attack = attack;
            Memento.this.defence = defence;
        }

        private int getLife() {
            return Memento.this.life;
        }

        private void setLife(int life) {
            Memento.this.life = life;
        }

        private int getAttack() {
            return Memento.this.attack;
        }

        private void setAttack(int attack) {
            Memento.this.attack = attack;
        }

        private int getDefence() {
            return Memento.this.defence;
        }

        private void setDefence(int defence) {
            Memento.this.defence = defence;
        }
    }


    @Override
    public String toString() {
        return "Soldier: "+this.getName() + " , "
                + "Life: "+this.getLife() + " , "
                + "Attack: " + this.getAttack() + " , "
                + "defence: "+ this.getDefence();
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
