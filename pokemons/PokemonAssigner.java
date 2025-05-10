package pokemons;

import Players.PlayerPokemon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokemonAssigner {

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
