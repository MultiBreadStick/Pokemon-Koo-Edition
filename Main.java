import pokemons.Gen1Pokemon; 
import javax.swing.JFrame; 
import java.util.Scanner;  
import pokemons.Pokemon;
import pokemons.Gen1Pokemon;

public class Main {
    public static void main(String[] args) {
        System.out.println(Gen1Pokemon.getGen1PokemonList()); 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Pokemon: Koo Edition!");
        System.out.println("Please enter your name: ");
        String playerName = scanner.nextLine(); 
        while (true) {
            
        }
    }

    public Pokemon[] pokemonAssigner() {
        Pokemon[] assigner = new Pokemon[6]; 
        for (int x = 0; x < 5; x++) {
            Gen1Pokemon.getGen1PokemonList(); 
        }
        return assigner; 
    }
}
