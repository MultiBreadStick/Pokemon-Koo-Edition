import pokemons.Gen1Pokemon;
import pokemons.PokemonAssigner;
import Players.PlayerPokemon;
import Players.Player;
import moves.Moves;
import moves.Move;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class for the Pokemon: Koo Edition game.
 * This class handles the game loop, user interaction, and battle mechanics.
 */
public class Main {
    /**
     * Main method to start the game.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Pokemon: Koo Edition!");
        System.out.println("Please enter your name: ");
        String playerName = scanner.nextLine();
        Gen1Pokemon.initializeGen1Pokemon();
        Moves.initializeMoves();
        ArrayList<PlayerPokemon> playerPokemonTeam = PokemonAssigner.getRandomPlayerPokemonTeam();
        Player player = new Player(playerName, playerPokemonTeam);
        ArrayList<PlayerPokemon> opponentPokemonTeam = PokemonAssigner.getRandomPlayerPokemonTeam();
        Player opponent = new Player("Opponent", opponentPokemonTeam);
        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Display Player Info");
            System.out.println("2. View Pokémon Stats");
            System.out.println("3. Battle Opponent");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                player.displayPlayerInfo();
            } else if (choice == 2) {
                System.out.println("Choose a Pokémon to view stats:");
                for (int i = 0; i < playerPokemonTeam.size(); i++) {
                    System.out.println((i + 1) + ". " + playerPokemonTeam.get(i).getName());
                }
                System.out.print("Enter the number of the Pokémon: ");
                int pokemonChoice = scanner.nextInt();
                if (pokemonChoice > 0 && pokemonChoice <= playerPokemonTeam.size()) {
                    PlayerPokemon chosenPokemon = playerPokemonTeam.get(pokemonChoice - 1);
                    System.out.println(chosenPokemon);
                } else {
                    System.out.println("Invalid choice.");
                }
            } else if (choice == 3) {
                System.out.println("A wild battle begins!");
                PlayerPokemon playerPokemon = playerPokemonTeam.get(0); // Use the first Pokémon
                PlayerPokemon opponentPokemon = opponentPokemonTeam.get(0); // Use the first opponent Pokémon
                System.out.println("Your Pokémon: " + playerPokemon.getName() + " (" + playerPokemon.getType() + ")");
                System.out.println("Opponent's Pokémon: " + opponentPokemon.getName() + " (" + opponentPokemon.getType() + ")");
                while (true) {
                    System.out.println("\nWhat will " + playerPokemon.getName() + " do?");
                    System.out.println("1. Attack");
                    System.out.println("2. Run");
                    System.out.print("Choose an option: ");
                    int battleChoice = scanner.nextInt();
                    if (battleChoice == 1) {
                        System.out.println("Choose a move:");
                        ArrayList<String> playerMoves = playerPokemon.getMoves();
                        for (int i = 0; i < playerMoves.size(); i++) {
                            System.out.println((i + 1) + ". " + playerMoves.get(i));
                        }
                        System.out.print("Enter the number of the move: ");
                        int moveChoice = scanner.nextInt();
                        if (moveChoice > 0 && moveChoice <= playerMoves.size()) {
                            String moveName = playerMoves.get(moveChoice - 1);
                            Move move = Moves.getMoveByName(moveName);
                            double damage = calculateDamage(playerPokemon, opponentPokemon, move);
                            System.out.println(playerPokemon.getName() + " used " + move.getName() + "!");
                            opponentPokemon.setCurrentHealth(opponentPokemon.getCurrentHealth() - damage);
                            System.out.println(opponentPokemon.getName() + " took " + damage + " damage!");
                            System.out.println(opponentPokemon.getName() + " has " + opponentPokemon.getCurrentHealth() + " HP left.");
                            if (opponentPokemon.getCurrentHealth() <= 0) {
                                System.out.println(opponentPokemon.getName() + " fainted!");
                                break;
                            }
                            System.out.println(opponentPokemon.getName() + " attacks!");
                            Move opponentMove = Moves.getRandomMove(opponentPokemon.getMoves());
                            double opponentDamage = calculateDamage(opponentPokemon, playerPokemon, opponentMove);
                            System.out.println(opponentPokemon.getName() + " used " + opponentMove.getName() + "!");
                            playerPokemon.setCurrentHealth(playerPokemon.getCurrentHealth() - opponentDamage);
                            System.out.println(playerPokemon.getName() + " took " + opponentDamage + " damage!");
                            System.out.println(playerPokemon.getName() + " has " + playerPokemon.getCurrentHealth() + " HP left.");

                            if (playerPokemon.getCurrentHealth() <= 0) {
                                System.out.println(playerPokemon.getName() + " fainted!");
                                break;
                            }
                        } else {
                            System.out.println("Invalid move choice.");
                        }
                    } else if (battleChoice == 2) {
                        System.out.println("You ran away from the battle!");
                        break;
                    } else {
                        System.out.println("Invalid choice.");
                    }
                }
            } else if (choice == 4) {
                System.out.println("Exiting the game. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Calculates the damage dealt by an attacker to a defender using a specific move.
     * 
     * @param attacker The attacking Pokémon.
     * @param defender The defending Pokémon.
     * @param move The move used by the attacker.
     * @return The calculated damage.
     * @throws NullPointerException if any of the parameters are null.
     */
    public static double calculateDamage(PlayerPokemon attacker, PlayerPokemon defender, Move move) {
        //Added using AI due to errors. 
        if (attacker == null) {
            throw new NullPointerException("Attacker is null.");
        }
        if (defender == null) {
            throw new NullPointerException("Defender is null.");
        }
        if (move == null) {
            throw new NullPointerException("Move is null.");
        }
    
        double attackStat = move.getCategory().equals("Physical") ? attacker.getAttack() : attacker.getSpecialAttack();
        double defenseStat = move.getCategory().equals("Physical") ? defender.getDefense() : defender.getSpecialDefense();
        double baseDamage = ((2 * 50 / 5 + 2) * move.getPower() * (attackStat / defenseStat)) / 50 + 2;
        double randomFactor = 0.85 + (Math.random() * 0.15); // Random factor between 0.85 and 1.0
        return baseDamage * randomFactor;
    }
}