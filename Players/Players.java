package Players;

import pokemons.Pokemon; 

public class Players {
    String name = "";
    Pokemon[] pokemon = new Pokemon[6]; 

    public Players(String name, Pokemon[] pokemon) {
        this.name = name;
        this.pokemon = pokemon;
    }

    public String getName() {
        return name;
    }
    public Pokemon[] getPokemon() {
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
