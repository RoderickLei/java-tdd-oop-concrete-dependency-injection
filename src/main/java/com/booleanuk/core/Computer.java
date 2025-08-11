package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    private PowerSupply psu;
    public ArrayList<Game> installedGames;

    public Computer(PowerSupply psu) {
        this.psu = psu;
        this.installedGames = new ArrayList<>();
    }

    public Computer(PowerSupply psu, ArrayList<Game> installedGames) {
        this.psu = psu;
        this.installedGames = installedGames;
    }

    public void turnOn() {
        this.psu.isOn = true;
    }

    public void installGame(String gameName) {
        Game game = new Game(gameName);
        this.installedGames.add(game);
    }

    public String playGame(String gameName) {
        for (Game g : this.installedGames) {
            if (g.name.equals(gameName)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
