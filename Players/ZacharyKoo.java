package Players;

import java.util.ArrayList;
import java.util.List;

/**
 * The ZacharyKoo class represents an AI opponent in the game.
 * It extends the Players class and provides functionality for selecting moves randomly.
 */
public class ZacharyKoo extends Players {

    /**
     * Constructs a new ZacharyKoo object with a predefined name and a team of Pokémon.
     * 
     * @param pokemonTeam The team of Pokémon assigned to Zachary Koo.
     */
    public ZacharyKoo(ArrayList<PlayerPokemon> pokemonTeam) {
        super("Zachary Koo", pokemonTeam);
    }

    /**
     * Selects a random move for Zachary Koo's Pokémon during a battle.
     * 
     * @return An integer representing the index of the selected move (0 to 3).
     */
    public int getMove() {
        return (int)(Math.random() * 4); 
    }
}