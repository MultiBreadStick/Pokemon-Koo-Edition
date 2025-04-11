package moves;

import java.util.ArrayList;
import java.util.List;

public class Moves {
    private static List<Move> moveList = new ArrayList<>();

    // Added with Copilot
    public static void initializeMoves() {
        moveList.add(new Move("Tackle", "Normal", 40, 100, 0, "Physical", "No additional effect."));
        moveList.add(new Move("Growl", "Normal", 0, 100, 0, "Status", "Lowers the target's Attack by 1 stage."));
        moveList.add(new Move("Leech Seed", "Grass", 0, 90, 0, "Status", "Drains 1/8 of the target's HP each turn."));
        moveList.add(new Move("Vine Whip", "Grass", 45, 100, 0, "Physical", "No additional effect."));
        moveList.add(new Move("Poison Powder", "Poison", 0, 75, 0, "Status", "Poisons the target."));
        moveList.add(new Move("Razor Leaf", "Grass", 55, 95, 0, "Physical", "High critical hit ratio."));
        moveList.add(new Move("Growth", "Normal", 0, 100, 0, "Status", "Raises the user's Special Attack by 1 stage."));
        moveList.add(new Move("Sleep Powder", "Grass", 0, 75, 0, "Status", "Puts the target to sleep."));
        moveList.add(new Move("SolarBeam", "Grass", 120, 100, 0, "Special", "Charges on the first turn, attacks on the second."));
        moveList.add(new Move("Scratch", "Normal", 40, 100, 0, "Physical", "No additional effect."));
        moveList.add(new Move("Ember", "Fire", 40, 100, 0, "Special", "10% chance to burn the target."));
        moveList.add(new Move("Leer", "Normal", 0, 100, 0, "Status", "Lowers the target's Defense by 1 stage."));
        moveList.add(new Move("Rage", "Normal", 20, 100, 0, "Physical", "Increases the user's Attack when hit."));
        moveList.add(new Move("Slash", "Normal", 70, 100, 0, "Physical", "High critical hit ratio."));
        moveList.add(new Move("Flamethrower", "Fire", 90, 100, 0, "Special", "10% chance to burn the target."));
        moveList.add(new Move("Hydro Pump", "Water", 110, 80, 0, "Special", "No additional effect."));
        moveList.add(new Move("Thunderbolt", "Electric", 90, 100, 0, "Special", "10% chance to paralyze the target."));
        moveList.add(new Move("Thunder Wave", "Electric", 0, 90, 0, "Status", "Paralyzes the target."));
        moveList.add(new Move("Thunder", "Electric", 110, 70, 0, "Special", "30% chance to paralyze the target."));
        moveList.add(new Move("Quick Attack", "Normal", 40, 100, 1, "Physical", "No additional effect."));
        moveList.add(new Move("Agility", "Psychic", 0, 100, 0, "Status", "Raises the user's Speed by 2 stages."));
        moveList.add(new Move("Confusion", "Psychic", 50, 100, 0, "Special", "10% chance to confuse the target."));
        moveList.add(new Move("Psychic", "Psychic", 90, 100, 0, "Special", "10% chance to lower the target's Special Defense by 1 stage."));
        moveList.add(new Move("Hypnosis", "Psychic", 0, 60, 0, "Status", "Puts the target to sleep."));
        moveList.add(new Move("Psybeam", "Psychic", 65, 100, 0, "Special", "10% chance to confuse the target."));
        moveList.add(new Move("Earthquake", "Ground", 100, 100, 0, "Physical", "No additional effect."));
        moveList.add(new Move("Fissure", "Ground", 0, 30, 0, "Physical", "One-hit KO if it hits."));
        moveList.add(new Move("Dig", "Ground", 80, 100, 0, "Physical", "Digs underground on the first turn, attacks on the second."));
        moveList.add(new Move("Toxic", "Poison", 0, 90, 0, "Status", "Badly poisons the target."));
        moveList.add(new Move("Double Team", "Normal", 0, 100, 0, "Status", "Raises the user's Evasion by 1 stage."));
        moveList.add(new Move("Reflect", "Psychic", 0, 100, 0, "Status", "Halves damage from Physical moves for 5 turns."));
        moveList.add(new Move("Bide", "Normal", 0, 100, 0, "Physical", "Stores damage for 2 turns, then deals double damage."));
        moveList.add(new Move("Self-Destruct", "Normal", 200, 100, 0, "Physical", "User faints after using this move."));
        moveList.add(new Move("Egg Bomb", "Normal", 100, 75, 0, "Physical", "No additional effect."));
        moveList.add(new Move("Fire Blast", "Fire", 110, 85, 0, "Special", "10% chance to burn the target."));
        moveList.add(new Move("Waterfall", "Water", 80, 100, 0, "Physical", "No additional effect."));
        moveList.add(new Move("Clamp", "Water", 35, 85, 0, "Physical", "Traps the target for 4-5 turns."));
        moveList.add(new Move("Swift", "Normal", 60, 100, 0, "Special", "Never misses."));
        moveList.add(new Move("Skull Bash", "Normal", 130, 100, 0, "Physical", "Raises Defense on the first turn, attacks on the second."));
        moveList.add(new Move("Spike Cannon", "Normal", 20, 100, 0, "Physical", "Hits 2-5 times in one turn."));
        moveList.add(new Move("Constrict", "Normal", 10, 100, 0, "Physical", "10% chance to lower the target's Speed by 1 stage."));
        moveList.add(new Move("Amnesia", "Psychic", 0, 100, 0, "Status", "Raises the user's Special Defense by 2 stages."));
        moveList.add(new Move("Soft-Boiled", "Normal", 0, 100, 0, "Status", "Restores up to 50% of the user's max HP."));
        moveList.add(new Move("Rest", "Psychic", 0, 100, 0, "Status", "User sleeps for 2 turns and restores all HP."));
        moveList.add(new Move("Rock Slide", "Rock", 75, 90, 0, "Physical", "30% chance to make the target flinch."));
        moveList.add(new Move("Hyper Beam", "Normal", 150, 90, 0, "Special", "User must recharge on the next turn."));
        moveList.add(new Move("Dragon Rage", "Dragon", 0, 100, 0, "Special", "Always deals 40 HP damage."));
       
    }

}
