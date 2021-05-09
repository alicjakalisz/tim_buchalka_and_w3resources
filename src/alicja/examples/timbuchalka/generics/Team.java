package alicja.examples.timbuchalka.generics;

import java.util.ArrayList;

public class Team<T extends Player>{ // type can be any extended from Player)
    private String name;
    int played=0;
    int won=0;
    int lost=0;
    int tied=0;

    //now we are going to create an array list thats using generic
    //for our objects
    private ArrayList<T>members= new ArrayList<>();//empty list of players

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
        // we are creating a method that will be adding players to the list, player
    //is an abstract class so we cannot create object from it but we can from
    //all the classes that are subclasses
    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println((player).getName()+ "is already on this team");
            return false;
        }else{
            members.add(player);
            System.out.println((player).getName()+" picked for team"+ this.name);
            return true;
        }


        }
    public int numPlayers(){
        return this.members.size();
    }
    public void matchResult(Team opponent, int ourScore, int theirScore){
        if(ourScore> theirScore){
            won++;
        }else if(ourScore==theirScore){
            tied++;
        }else{
            lost++;
        }
        played++;
        if(opponent!=null){
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won*2)+tied;
    }
}
