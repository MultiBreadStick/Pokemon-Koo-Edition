package Players;

import java.util.ArrayList;
import java.util.List;

public class ZacharyKoo extends Players {
    public ZacharyKoo(ArrayList<PlayerPokemon> pokemonTeam) {
        super("Zachary Koo", pokemonTeam);
    }
    public int getMove() {
        return (int)(Math.random() * 4); 
    }
}
