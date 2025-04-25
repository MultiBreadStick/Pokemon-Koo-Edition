package Players;

import Players.PlayerPokemon; 

public class Players {
    String name = "";
    PlayerPokemon[] pokemon = new PlayerPokemon[6]; 

    public Players(String name, PlayerPokemon[] pokemon) {
        this.name = name;
        this.pokemon = pokemon;
    }

    public String getName() {
        return name;
    }
    public PlayerPokemon[] getPokemon() {
        return pokemon;
    }

    public void displayPlayerInfo() {
        System.out.println("Player Name: " + getName());
        System.out.println("Pokémon:");
        for (Pokemon p : getPokemon()) {
            System.out.println("- " + p.getName());
        }
    }
}
