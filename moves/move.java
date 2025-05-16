package moves;

/**
 * The Move class represents a move that a Pokémon can use in battle.
 * It contains attributes such as the move's name, type, power, accuracy, priority, category, and effect.
 */
public class Move { 
    String name = ""; 
    String type = ""; 
    double power = 0; 
    double accuracy = 0; 
    double priority = 0; 
    String category = ""; 
    String effect = ""; 
    
    /**
     * Constructs a new Move object with the specified attributes.
     * 
     * @param name The name of the move.
     * @param type The type of the move (e.g., "Fire", "Water").
     * @param power The power of the move (0 for status moves).
     * @param accuracy The accuracy of the move (percentage).
     * @param priority The priority of the move (higher values indicate higher priority).
     * @param category The category of the move ("Physical", "Special", or "Status").
     * @param effect A description of the move's effect.
     */
    public Move(String name, String type, double power, double accuracy, double priority, String category, String effect) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
        this.priority = priority;
        this.category = category;
        this.effect = effect;
    }
    
    /**
     * Gets the name of the move.
     * 
     * @return The name of the move.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Gets the type of the move.
     * 
     * @return The type of the move.
     */
    public String getType() {
        return type;
    }
    
    /**
     * Gets the power of the move.
     * 
     * @return The power of the move.
     */
    public double getPower() {
        return power;
    }
    
    /**
     * Gets the accuracy of the move.
     * 
     * @return The accuracy of the move (percentage).
     */
    public double getAccuracy() {
        return accuracy;
    }
    
    /**
     * Gets the priority of the move.
     * 
     * @return The priority of the move.
     */
    public double getPriority() {
        return priority;
    }

    /**
     * Gets the category of the move.
     * 
     * @return The category of the move ("Physical", "Special", or "Status").
     */
    public String getCategory() {
        return category;
    }

    /**
     * Gets the effect of the move.
     * 
     * @return A description of the move's effect.
     */
    public String getEffect() {
        return effect;
    }
}