import pokemons.Gen1Pokemon; // Import the Gen1Pokemon class

public class Main {
    public static void main(String[] args) {
        // Initialize the Gen 1 Pokémon list
        Gen1Pokemon.initializeGen1Pokemon();

        // Verify if all Pokémon are present
        verifyPokemon();
    }

    public static void verifyPokemon() {
        System.out.println("Verifying Pokémon list...");
        Gen1Pokemon.verifyPokemonList();
    }
}
