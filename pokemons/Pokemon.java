package pokemons;
import java.util.ArrayList; 

public class Pokemon {
    double health = 0; 
    String name = ""; 
    String type = ""; 
    double attack = 0;
    double defense = 0;
    double speed = 0;
    double specialAttack = 0;
    double specialDefense = 0;
    ArrayList<String> moves = new ArrayList<String>();
    String frontImage = ""; 
    String backImage = ""; 

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

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public double getHealth() {
        return health;
    }
    public double getAttack() {
        return attack;
    }
    public double getDefense() {
        return defense;
    }
    public double getSpeed() {
        return speed;
    }
    public double getSpecialAttack() {
        return specialAttack;
    }
    public double getSpecialDefense() {
        return specialDefense;
    }
    public String getFrontImage() { // Getter for the front image
        return frontImage;
    }
    public String getBackImage() { // Getter for the back image
        return backImage;
    }
    public String toString() { // Updated toString to include the front and back images
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
