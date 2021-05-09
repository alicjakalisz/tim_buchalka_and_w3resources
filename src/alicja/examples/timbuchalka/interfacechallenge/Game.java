package alicja.examples.timbuchalka.interfacechallenge;

import java.util.ArrayList;

public class Game implements ISaveable{

    private String name;
    private ArrayList<String> players;
    private ArrayList<String> monsters;

    public Game() {
    }

    public Game(String name, ArrayList<String> players, ArrayList<String> monsters) {
        this.name = name;
        this.players = players;
        this.monsters = monsters;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getPlayers() {
        return players;
    }

    public ArrayList<String> getMonsters() {
        return monsters;
    }

    @Override
    public boolean doImport(ArrayList<String> fields) {
        return false;
    }

    @Override
    public ArrayList<String> doExport() {
        return null;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", players=" + players +
                ", monsters=" + monsters +
                '}';
    }
}
