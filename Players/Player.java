package Players;

import java.util.ArrayList;
import java.util.List;

/**
 * The Player class represents a human player in the game.
 * It extends the Players class and inherits its attributes and methods.
 */
public class Player extends Players {

    /**
     * Constructs a new Player object with the specified name and Pokémon team.
     * 
     * @param name The name of the player.
     * @param pokemonTeam The team of Pokémon assigned to the player.
     */
    public Player(String name, ArrayList<PlayerPokemon> pokemonTeam) {
        super(name, pokemonTeam);
    }
}