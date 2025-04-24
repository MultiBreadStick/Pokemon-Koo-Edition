package Players;

import pokemons.Pokemon;
import pokemons.Gen1Pokemon;

public class PlayerPokemon extends Pokemon {
    String status = null; 
    Boolean isFainted = false;
    double SpecAtkMod = 1; 
    double SpecDefMod = 1;
    double AtkMod = 1;
    double DefMod = 1;
    double SpdMod = 1;
    double currentHealth = 0; 
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
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Boolean getIsFainted() {
        return isFainted;
    }
    public void setIsFainted(Boolean isFainted) {
        if (currentHealth <= 0) {
            this.isFainted = true;
        } else {
            this.isFainted = false;
        }
    }
    public double getSpecAtkMod() {
        return SpecAtkMod;
    }
    public void setSpecAtkMod(double SpecAtkMod) {
        this.SpecAtkMod = SpecAtkMod;
    }
    public double getSpecDefMod() {
        return SpecDefMod;
    }
    public void setSpecDefMod(double SpecDefMod) {
        this.SpecDefMod = SpecDefMod;
    }   
    public double getAtkMod() {
        return AtkMod;
    }
    public void setAtkMod(double AtkMod) {
        this.AtkMod = AtkMod;
    }
    public double getDefMod() {
        return DefMod;
    }
    public void setDefMod(double DefMod) {
        this.DefMod = DefMod;
    }
    public double getSpdMod() {
        return SpdMod;
    }
    public void setSpdMod(double SpdMod) {
        this.SpdMod = SpdMod;
    }
    public double getCurrentHealth() {
        return 100*(currentHealth/Gen1Pokemon.getPokemonInfo(getName()).getHealth());
    }
    
}
