package alicja.examples.timbuchalka.interfacechallenge;

import java.util.ArrayList;

public class Player implements ISaveable {

    private String name;
    private String weapon;
    private int life;

    public Player() {
    }

    public Player(String name, String weapon, int life) {
        this.name = name;
        this.weapon = weapon;
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getLife() {
        return life;
    }

    @Override
    public boolean doImport(ArrayList<String> fields) {
        if(fields==null || fields.size()!=3){
            return false;
        }else{
            try{
                this.life=Integer.parseInt(fields.get(2));
            }
            catch(NumberFormatException e){
                System.out.println("Life does not have numeric value");
                return false;
            }
            this.name=fields.get(0);
            this.weapon=fields.get(1);
        }
        return true;
    }

    @Override
    public ArrayList<String> doExport() {
        ArrayList<String> list= new ArrayList<>();
        list.add(name);
        list.add(weapon);
        list.add(""+life);

        return list;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", life=" + life +
                '}';
    }
}
