package pokemons;

import java.util.ArrayList;

/**
 * The Pokemon class represents a Pokémon with its attributes, moves, and images.
 * It serves as the base class for all Pokémon in the game.
 */
public class Pokemon {
    double health = 0;
    String name = "";
    String type = "";
    double attack = 0;
    double defense = 0;
    double speed = 0;
    double specialAttack = 0;
    double specialDefense = 0;
    ArrayList<String> moves = new ArrayList<>();
    String frontImage = "";
    String backImage = "";

    /**
     * Constructs a new Pokemon object with the specified attributes.
     * 
     * @param name The name of the Pokémon.
     * @param type The type(s) of the Pokémon (e.g., "Fire", "Water").
     * @param health The maximum health of the Pokémon.
     * @param attack The attack stat of the Pokémon.
     * @param defense The defense stat of the Pokémon.
     * @param speed The speed stat of the Pokémon.
     * @param specialAttack The special attack stat of the Pokémon.
     * @param specialDefense The special defense stat of the Pokémon.
     * @param moves A list of moves the Pokémon can use.
     * @param frontImage The file path to the front image of the Pokémon.
     * @param backImage The file path to the back image of the Pokémon.
     */
    public Pokemon(String name, String type, double health, double attack, double defense, double speed, double specialAttack, double specialDefense, ArrayList<String> moves, String frontImage, String backImage) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.moves = moves;
        this.frontImage = frontImage;
        this.backImage = backImage;
    }

    /**
     * Gets the name of the Pokémon.
     * 
     * @return The name of the Pokémon.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the type(s) of the Pokémon.
     * 
     * @return The type(s) of the Pokémon.
     */
    public String getType() {
        return type;
    }

    /**
     * Gets the maximum health of the Pokémon.
     * 
     * @return The health of the Pokémon.
     */
    public double getHealth() {
        return health;
    }

    /**
     * Gets the attack stat of the Pokémon.
     * 
     * @return The attack stat of the Pokémon.
     */
    public double getAttack() {
        return attack;
    }

    /**
     * Gets the defense stat of the Pokémon.
     * 
     * @return The defense stat of the Pokémon.
     */
    public double getDefense() {
        return defense;
    }

    /**
     * Gets the speed stat of the Pokémon.
     * 
     * @return The speed stat of the Pokémon.
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Gets the special attack stat of the Pokémon.
     * 
     * @return The special attack stat of the Pokémon.
     */
    public double getSpecialAttack() {
        return specialAttack;
    }

    /**
     * Gets the special defense stat of the Pokémon.
     * 
     * @return The special defense stat of the Pokémon.
     */
    public double getSpecialDefense() {
        return specialDefense;
    }

    /**
     * Gets the file path to the front image of the Pokémon.
     * 
     * @return The file path to the front image of the Pokémon.
     */
    public String getFrontImage() {
        return frontImage;
    }

    /**
     * Gets the file path to the back image of the Pokémon.
     * 
     * @return The file path to the back image of the Pokémon.
     */
    public String getBackImage() {
        return backImage;
    }

    /**
     * Gets the list of moves the Pokémon can use.
     * 
     * @return An ArrayList of move names.
     */
    public ArrayList<String> getMoves() {
        return moves;
    }

    /**
     * Returns a string representation of the Pokémon, including its attributes and images.
     * 
     * @return A string representation of the Pokémon.
     */
    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", defense=" + defense +
                ", speed=" + speed +
                ", specialAttack=" + specialAttack +
                ", specialDefense=" + specialDefense +
                ", frontImage='" + frontImage + '\'' +
                ", backImage='" + backImage + '\'' +
                '}';
    }
}