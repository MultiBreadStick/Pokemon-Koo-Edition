package pokemons;

import Players.PlayerPokemon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The PokemonAssigner class is responsible for assigning random teams of Pokémon
 * to players or opponents. It uses the Gen1Pokemon data to create a team of 6 Pokémon.
 */
public class PokemonAssigner {

    /**
     * Generates a random team of 6 PlayerPokemon objects.
     * 
     * @return An ArrayList containing 6 randomly selected PlayerPokemon.
     * @throws IllegalStateException if the Gen1Pokemon list is not initialized or contains fewer than 6 Pokémon.
     */
    public static ArrayList<PlayerPokemon> getRandomPlayerPokemonTeam() {
        Gen1Pokemon.initializeGen1Pokemon();
        List<Gen1Pokemon> allPokemon = Gen1Pokemon.getGen1PokemonList();
        Collections.shuffle(allPokemon);
        ArrayList<PlayerPokemon> randomTeam = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Gen1Pokemon pokemonData = allPokemon.get(i);
            randomTeam.add(new PlayerPokemon(pokemonData.getName()));
        }
        return randomTeam;
    }
}
