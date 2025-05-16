package Players;

import pokemons.Pokemon;
import pokemons.Gen1Pokemon;

/**
 * The PlayerPokemon class represents a Pokémon that belongs to a player.
 * It extends the Pokemon class and includes additional attributes and methods
 * for managing the Pokémon's status, health, and stat modifiers during battles.
 */
public class PlayerPokemon extends Pokemon {
    String status = null; 
    Boolean isFainted = false;
    double SpecAtkMod = 1; 
    double SpecDefMod = 1;
    double AtkMod = 1;
    double DefMod = 1;
    double SpdMod = 1;
    double currentHealth = 0; 

    /**
     * Constructs a new PlayerPokemon object based on the specified Pokémon name.
     * The attributes are initialized using data from the Gen1Pokemon class.
     * 
     * @param name The name of the Pokémon.
     */
    public PlayerPokemon(String name) {
        super(
            Gen1Pokemon.getPokemonInfo(name).getName(),
            Gen1Pokemon.getPokemonInfo(name).getType(),
            Gen1Pokemon.getPokemonInfo(name).getHealth(),
            Gen1Pokemon.getPokemonInfo(name).getAttack(),
            Gen1Pokemon.getPokemonInfo(name).getDefense(),
            Gen1Pokemon.getPokemonInfo(name).getSpeed(),
            Gen1Pokemon.getPokemonInfo(name).getSpecialAttack(),
            Gen1Pokemon.getPokemonInfo(name).getSpecialDefense(),
            Gen1Pokemon.getPokemonInfo(name).getMoves(),
            Gen1Pokemon.getPokemonInfo(name).getFrontImage(),
            Gen1Pokemon.getPokemonInfo(name).getBackImage()
        );
        this.currentHealth = Gen1Pokemon.getPokemonInfo(name).getHealth();
        this.status = null;
        this.isFainted = false;
        this.SpecAtkMod = 1;
        this.SpecDefMod = 1;
        this.AtkMod = 1;
        this.DefMod = 1;
        this.SpdMod = 1;
    }

    /**
     * Gets the current status of the Pokémon (e.g., "Burned", "Paralyzed").
     * 
     * @return The status of the Pokémon.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status of the Pokémon.
     * 
     * @param status The new status of the Pokémon.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Checks if the Pokémon is fainted.
     * 
     * @return True if the Pokémon is fainted, false otherwise.
     */
    public Boolean getIsFainted() {
        return isFainted;
    }

    /**
     * Updates the fainted status of the Pokémon based on its current health.
     * 
     * @param isFainted True if the Pokémon is fainted, false otherwise.
     */
    public void setIsFainted(Boolean isFainted) {
        if (currentHealth <= 0) {
            this.isFainted = true;
        } else {
            this.isFainted = false;
        }
    }

    /**
     * Gets the special attack modifier of the Pokémon.
     * 
     * @return The special attack modifier.
     */
    public double getSpecAtkMod() {
        return SpecAtkMod;
    }

    /**
     * Sets the special attack modifier of the Pokémon.
     * 
     * @param SpecAtkMod The new special attack modifier.
     */
    public void setSpecAtkMod(double SpecAtkMod) {
        this.SpecAtkMod = SpecAtkMod;
    }

    /**
     * Gets the special defense modifier of the Pokémon.
     * 
     * @return The special defense modifier.
     */
    public double getSpecDefMod() {
        return SpecDefMod;
    }

    /**
     * Sets the special defense modifier of the Pokémon.
     * 
     * @param SpecDefMod The new special defense modifier.
     */
    public void setSpecDefMod(double SpecDefMod) {
        this.SpecDefMod = SpecDefMod;
    }

    /**
     * Gets the attack modifier of the Pokémon.
     * 
     * @return The attack modifier.
     */
    public double getAtkMod() {
        return AtkMod;
    }

    /**
     * Sets the attack modifier of the Pokémon.
     * 
     * @param AtkMod The new attack modifier.
     */
    public void setAtkMod(double AtkMod) {
        this.AtkMod = AtkMod;
    }

    /**
     * Gets the defense modifier of the Pokémon.
     * 
     * @return The defense modifier.
     */
    public double getDefMod() {
        return DefMod;
    }

    /**
     * Sets the defense modifier of the Pokémon.
     * 
     * @param DefMod The new defense modifier.
     */
    public void setDefMod(double DefMod) {
        this.DefMod = DefMod;
    }

    /**
     * Gets the speed modifier of the Pokémon.
     * 
     * @return The speed modifier.
     */
    public double getSpdMod() {
        return SpdMod;
    }

    /**
     * Sets the speed modifier of the Pokémon.
     * 
     * @param SpdMod The new speed modifier.
     */
    public void setSpdMod(double SpdMod) {
        this.SpdMod = SpdMod;
    }

    /**
     * Gets the current health of the Pokémon as a percentage of its maximum health.
     * 
     * @return The current health percentage.
     */
    public double getCurrentHealth() {
        return 100 * (currentHealth / Gen1Pokemon.getPokemonInfo(getName()).getHealth());
    }

    /**
     * Sets the current health of the Pokémon.
     * Ensures that the health does not drop below 0.
     * 
     * @param health The new current health of the Pokémon.
     */
    public void setCurrentHealth(double health) {
        this.currentHealth = Math.max(0, health);
    }
}