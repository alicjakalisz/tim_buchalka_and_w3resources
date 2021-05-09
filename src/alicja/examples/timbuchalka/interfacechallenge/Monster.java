package alicja.examples.timbuchalka.interfacechallenge;

import java.util.ArrayList;

public class Monster implements ISaveable {

    private String name;
    private String power;
    private int life;

    public Monster() {
    }

    public Monster(String name, int life, String power) {
        this.name = name;
        this.life = life;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public String getPower() {
        return power;
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
            this.power=fields.get(1);
        }
        return true;
    }

    @Override
    public ArrayList<String> doExport() {
        ArrayList<String> list= new ArrayList<>();
        list.add(name);
        list.add(power);
        list.add(""+life);

        return list;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", power='" + power + '\'' +
                '}';
    }
}
