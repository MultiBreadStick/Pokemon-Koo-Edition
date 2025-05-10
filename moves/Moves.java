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
        moveList.add(new Move("Fire Spin", "Fire", 35, 85, 0, "Special", "Traps the target for 4-5 turns."));
        moveList.add(new Move("Rock Throw", "Rock", 50, 90, 0, "Physical", "No additional effect."));
        moveList.add(new Move("Rock Slide", "Rock", 75, 90, 0, "Physical", "30% chance to make the target flinch."));
        moveList.add(new Move("Explosion", "Normal", 250, 100, 0, "Physical", "User faints after using this move."));
        moveList.add(new Move("Self-Destruct", "Normal", 200, 100, 0, "Physical", "User faints after using this move."));
        moveList.add(new Move("Horn Attack", "Normal", 65, 100, 0, "Physical", "No additional effect."));
        moveList.add(new Move("Stomp", "Normal", 65, 100, 0, "Physical", "30% chance to make the target flinch."));
        moveList.add(new Move("Take Down", "Normal", 90, 85, 0, "Physical", "User takes recoil damage equal to 1/4 of the damage dealt."));
        moveList.add(new Move("Double-Edge", "Normal", 120, 100, 0, "Physical", "User takes recoil damage equal to 1/3 of the damage dealt."));
        moveList.add(new Move("Hyper Fang", "Normal", 80, 90, 0, "Physical", "10% chance to make the target flinch."));
        moveList.add(new Move("Super Fang", "Normal", 0, 90, 0, "Physical", "Reduces the target's HP by half."));
        moveList.add(new Move("Peck", "Flying", 35, 100, 0, "Physical", "No additional effect."));
        moveList.add(new Move("Drill Peck", "Flying", 80, 100, 0, "Physical", "No additional effect."));
        moveList.add(new Move("Wing Attack", "Flying", 60, 100, 0, "Physical", "No additional effect."));
        moveList.add(new Move("Fly", "Flying", 90, 95, 0, "Physical", "Flies up on the first turn, attacks on the second."));
        moveList.add(new Move("Whirlwind", "Normal", 0, 100, 0, "Status", "Forces the target to switch out."));
        moveList.add(new Move("Sand Attack", "Ground", 0, 100, 0, "Status", "Lowers the target's accuracy by 1 stage."));
        moveList.add(new Move("Swift", "Normal", 60, 100, 0, "Special", "Never misses."));
        moveList.add(new Move("Sonic Boom", "Normal", 0, 90, 0, "Special", "Always deals 20 HP damage."));
        moveList.add(new Move("Aurora Beam", "Ice", 65, 100, 0, "Special", "10% chance to lower the target's Attack by 1 stage."));
        moveList.add(new Move("Ice Beam", "Ice", 90, 100, 0, "Special", "10% chance to freeze the target."));
        moveList.add(new Move("Blizzard", "Ice", 110, 70, 0, "Special", "10% chance to freeze the target."));
        moveList.add(new Move("Body Slam", "Normal", 85, 100, 0, "Physical", "30% chance to paralyze the target."));
        moveList.add(new Move("Double-Edge", "Normal", 120, 100, 0, "Physical", "User takes recoil damage equal to 1/3 of the damage dealt."));
        moveList.add(new Move("Stomp", "Normal", 65, 100, 0, "Physical", "30% chance to make the target flinch."));
        moveList.add(new Move("Take Down", "Normal", 90, 85, 0, "Physical", "User takes recoil damage equal to 1/4 of the damage dealt."));
        moveList.add(new Move("Submission", "Fighting", 80, 80, 0, "Physical", "User takes recoil damage equal to 1/4 of the damage dealt."));
        moveList.add(new Move("Counter", "Fighting", 0, 100, -5, "Physical", "Deals double the damage taken from a Physical move."));
        moveList.add(new Move("Seismic Toss", "Fighting", 0, 100, 0, "Physical", "Deals damage equal to the user's level."));
        moveList.add(new Move("Mega Punch", "Normal", 80, 85, 0, "Physical", "No additional effect."));
        moveList.add(new Move("Mega Kick", "Normal", 120, 75, 0, "Physical", "No additional effect."));
        moveList.add(new Move("Slam", "Normal", 80, 75, 0, "Physical", "No additional effect."));
        moveList.add(new Move("Horn Drill", "Normal", 0, 30, 0, "Physical", "One-hit KO if it hits."));
        moveList.add(new Move("Guillotine", "Normal", 0, 30, 0, "Physical", "One-hit KO if it hits."));
        moveList.add(new Move("Barrage", "Normal", 15, 85, 0, "Physical", "Hits 2-5 times in one turn."));
        moveList.add(new Move("Lick", "Ghost", 30, 100, 0, "Physical", "30% chance to paralyze the target."));
        moveList.add(new Move("Night Shade", "Ghost", 0, 100, 0, "Special", "Deals damage equal to the user's level."));
        moveList.add(new Move("Dream Eater", "Psychic", 100, 100, 0, "Special", "Only works on sleeping targets. Restores HP equal to half the damage dealt."));
        moveList.add(new Move("Bind", "Normal", 15, 85, 0, "Physical", "Traps the target for 4-5 turns."));
        moveList.add(new Move("Wrap", "Normal", 15, 90, 0, "Physical", "Traps the target for 4-5 turns."));
        moveList.add(new Move("Screech", "Normal", 0, 85, 0, "Status", "Lowers the target's Defense by 2 stages."));
        moveList.add(new Move("Harden", "Normal", 0, 100, 0, "Status", "Raises the user's Defense by 1 stage."));
        moveList.add(new Move("Defense Curl", "Normal", 0, 100, 0, "Status", "Raises the user's Defense by 1 stage."));
        moveList.add(new Move("Light Screen", "Psychic", 0, 100, 0, "Status", "Halves damage from Special moves for 5 turns."));
        moveList.add(new Move("Barrier", "Psychic", 0, 100, 0, "Status", "Raises the user's Defense by 2 stages."));
        moveList.add(new Move("Recover", "Normal", 0, 100, 0, "Status", "Restores up to 50% of the user's max HP."));
        moveList.add(new Move("Soft-Boiled", "Normal", 0, 100, 0, "Status", "Restores up to 50% of the user's max HP."));
        moveList.add(new Move("Rest", "Psychic", 0, 100, 0, "Status", "User sleeps for 2 turns and restores all HP."));
        moveList.add(new Move("Substitute", "Normal", 0, 100, 0, "Status", "Uses 25% of the user's max HP to create a substitute that takes damage for the user."));
        moveList.add(new Move("Hyper Beam", "Normal", 150, 90, 0, "Special", "User must recharge on the next turn."));
    }
    public static Move getMoveByName(String name) {
        for (Move move : moveList) {
            if (move.getName().equalsIgnoreCase(name)) {
                return move;
            }
        }
        return null; 
    }
    public static Move getRandomMove(ArrayList<String> moveNames) {
        if (moveNames.isEmpty()) {
            return null; // Return null if no moves are available
        }
        String randomMoveName = moveNames.get((int) (Math.random() * moveNames.size()));
        return getMoveByName(randomMoveName);
    }
}
