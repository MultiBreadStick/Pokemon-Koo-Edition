package Players;

import java.util.ArrayList;
import java.util.List;

/**
 * The Players class represents a player in the game.
 * It contains the player's name and their team of Pokémon.
 */
public class Players {
    private String name;
    private ArrayList<PlayerPokemon> pokemonTeam;

    /**
     * Constructs a new Players object with the specified name and Pokémon team.
     * 
     * @param name The name of the player.
     * @param pokemonTeam The team of Pokémon assigned to the player.
     */
    public Players(String name, ArrayList<PlayerPokemon> pokemonTeam) {
        this.name = name;
        this.pokemonTeam = new ArrayList<>();
    }

    /**
     * Gets the name of the player.
     * 
     * @return The name of the player.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the player.
     * 
     * @param name The new name of the player.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the player's team of Pokémon.
     * 
     * @return A List containing the player's Pokémon.
     */
    public List<PlayerPokemon> getPokemonTeam() {
        return pokemonTeam;
    }

    /**
     * Displays the player's information, including their name and Pokémon team.
     * This method prints the player's name and the details of each Pokémon in their team.
     */
    public void displayPlayerInfo() {
        System.out.println("Player Name: " + getName());
        System.out.println("Pokémon:");
        for (PlayerPokemon p : pokemonTeam) {
            System.out.println("- " + p.getName() + " (" + p.getType() + ")");
        }
    }
}