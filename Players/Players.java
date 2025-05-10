package Players;

import java.util.ArrayList;
import java.util.List;

public class Players {
    private String name;
    private ArrayList<PlayerPokemon> pokemonTeam;

    public Players(String name, ArrayList<PlayerPokemon> pokemonTeam) {
        this.name = name;
        this.pokemonTeam = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<PlayerPokemon> getPokemonTeam() {
        return pokemonTeam;
    }

    public void displayPlayerInfo() {
        System.out.println("Player Name: " + getName());
        System.out.println("Pokémon:");
        for (PlayerPokemon p : pokemonTeam) {
            System.out.println("- " + p.getName() + " (" + p.getType() + ")");
        }
    }
}
