package pokemons;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Gen1Pokemon extends Pokemon {
    private static List<Gen1Pokemon> gen1PokemonList = new ArrayList<>();

    public Gen1Pokemon(String name, String type, double health, double attack, double defense, double speed, double specialAttack, double specialDefense, ArrayList<String> moves, String frontImage, String backImage) {
        super(name, type, health, attack, defense, speed, specialAttack, specialDefense, moves, frontImage, backImage);
    }

    // With the help of Copilot due the amount of data 
    public static void initializeGen1Pokemon() {
        gen1PokemonList.add(new Gen1Pokemon(
            "Bulbasaur",
            "Grass/Poison",
            45, 49, 49, 45, 65, 65,
            new ArrayList<>(Arrays.asList("Tackle", "Growl", "Leech Seed", "Vine Whip", "Poison Powder", "Razor Leaf", "Growth", "Sleep Powder", "SolarBeam")),
            "images/BulbasaurFront.png",
            "images/BulbasaurBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Ivysaur",
            "Grass/Poison",
            60, 62, 63, 60, 80, 80,
            new ArrayList<>(Arrays.asList("Tackle", "Growl", "Leech Seed", "Vine Whip", "Poison Powder", "Razor Leaf", "Growth", "Sleep Powder", "SolarBeam")),
            "images/IvysaurFront.png",
            "images/IvysaurBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Venusaur",
            "Grass/Poison",
            80, 82, 83, 80, 100, 100,
            new ArrayList<>(Arrays.asList("Tackle", "Growl", "Leech Seed", "Vine Whip", "Poison Powder", "Razor Leaf", "Growth", "Sleep Powder", "SolarBeam")),
            "images/VenusaurFront.png",
            "images/VenusaurBack.png"
        ));
        //gen1PokemonList.add(new Gen1Pokemon(
        //    "Charmander",
        //    "Fire",
        //    39, 52, 43, 65, 60, 50,
        //    new ArrayList<>(Arrays.asList("Scratch", "Growl", "Ember", "Leer", "Rage", "Slash", "Flamethrower", "Fire Spin")),
        //    "images/CharmanderFront.png",
        //    "images/CharmanderBack.png"
        //));
        gen1PokemonList.add(new Gen1Pokemon(
            "Charmeleon",
            "Fire",
            58, 64, 58, 80, 80, 65,
            new ArrayList<>(Arrays.asList("Scratch", "Growl", "Ember", "Leer", "Rage", "Slash", "Flamethrower", "Fire Spin")),
            "images/CharmeleonFront.png",
            "images/CharmeleonBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Charizard",
            "Fire/Flying",
            78, 84, 78, 100, 109, 85,
            new ArrayList<>(Arrays.asList("Scratch", "Growl", "Ember", "Leer", "Rage", "Slash", "Flamethrower", "Fire Spin", "Wing Attack")),
            "images/CharizardFront.png",
            "images/CharizardBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Squirtle",
            "Water",
            44, 48, 65, 43, 50, 64,
            new ArrayList<>(Arrays.asList("Tackle", "Tail Whip", "Bubble", "Water Gun", "Bite", "Withdraw", "Skull Bash", "Hydro Pump")),
            "images/SquirtleFront.png",
            "images/SquirtleBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Wartortle",
            "Water",
            59, 63, 80, 58, 65, 80,
            new ArrayList<>(Arrays.asList("Tackle", "Tail Whip", "Bubble", "Water Gun", "Bite", "Withdraw", "Skull Bash", "Hydro Pump")),
            "images/WartortleFront.png",
            "images/WartortleBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Blastoise",
            "Water",
            79, 83, 100, 78, 85, 105,
            new ArrayList<>(Arrays.asList("Tackle", "Tail Whip", "Bubble", "Water Gun", "Bite", "Withdraw", "Skull Bash", "Hydro Pump")),
            "images/BlastoiseFront.png",
            "images/BlastoiseBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Caterpie",
            "Bug",
            45, 30, 35, 45, 20, 20,
            new ArrayList<>(Arrays.asList("Tackle", "String Shot", "Bug Bite")),
            "images/CaterpieFront.png",
            "images/CaterpieBack.png"
         ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Metapod",
            "Bug",
            50, 20, 55, 30, 25, 25,
            new ArrayList<>(Arrays.asList("Harden")),
            "images/MetapodFront.png",
            "images/MetapodBack.png"
         ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Butterfree",
            "Bug/Flying",
            60, 45, 50, 70, 90, 80,
            new ArrayList<>(Arrays.asList("Tackle", "String Shot", "Confusion", "Poison Powder", "Stun Spore", "Sleep Powder", "Gust", "Psybeam")),
            "images/ButterfreeFront.png",
            "images/ButterfreeBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Weedle",
            "Bug/Poison",
            40, 35, 30, 50, 20, 20,
            new ArrayList<>(Arrays.asList("Poison Sting", "String Shot", "Bug Bite")),
            "images/WeedleFront.png",
            "images/WeedleBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Kakuna",
            "Bug/Poison",
            45, 25, 50, 35, 25, 25,
            new ArrayList<>(Arrays.asList("Harden")),
            "images/KakunaFront.png",
            "images/KakunaBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Beedrill",
            "Bug/Poison",
            65, 90, 40, 75, 45, 80,
            new ArrayList<>(Arrays.asList("Fury Attack", "Focus Energy", "Twineedle", "Rage", "Pin Missile", "Agility")),
            "images/BeedrillFront.png",
            "images/BeedrillBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Pidgey",
            "Normal/Flying",
            40, 45, 40, 56, 35, 35,
            new ArrayList<>(Arrays.asList("Tackle", "Sand Attack", "Gust", "Quick Attack", "Whirlwind", "Wing Attack", "Agility")),
            "images/PidgeyFront.png",
            "images/PidgeyBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Pidgeotto",
            "Normal/Flying",
            63, 60, 55, 71, 50, 50,
            new ArrayList<>(Arrays.asList("Tackle", "Sand Attack", "Gust", "Quick Attack", "Whirlwind", "Wing Attack", "Agility")),
            "images/PidgeottoFront.png",
            "images/PidgeottoBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Pidgeot",
            "Normal/Flying",
            83, 80, 75, 101, 70, 70,
            new ArrayList<>(Arrays.asList("Tackle", "Sand Attack", "Gust", "Quick Attack", "Whirlwind", "Wing Attack", "Agility")),
            "images/PidgeotFront.png",
            "images/PidgeotBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Rattata",
            "Normal",
            30, 56, 35, 72, 25, 35,
            new ArrayList<>(Arrays.asList("Tackle", "Tail Whip", "Quick Attack", "Hyper Fang", "Focus Energy", "Super Fang")),
            "images/RattataFront.png",
            "images/RattataBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Raticate",
            "Normal",
            55, 81, 60, 97, 50, 70,
            new ArrayList<>(Arrays.asList("Tackle", "Tail Whip", "Quick Attack", "Hyper Fang", "Focus Energy", "Super Fang")),
            "images/RaticateFront.png",
            "images/RaticateBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Spearow",
            "Normal/Flying",
            40, 60, 30, 70, 31, 31,
            new ArrayList<>(Arrays.asList("Peck", "Growl", "Leer", "Fury Attack", "Agility", "Drill Peck")),
            "images/SpearowFront.png",
            "images/SpearowBack.png"
         ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Fearow",
            "Normal/Flying",
            65, 90, 65, 100, 61, 61,
            new ArrayList<>(Arrays.asList("Peck", "Growl", "Leer", "Fury Attack", "Agility", "Drill Peck")),
            "images/FearowFront.png",
            "images/FearowBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Ekans",
            "Poison",
            35, 60, 44, 55, 40, 54,
            new ArrayList<>(Arrays.asList("Wrap", "Leer", "Poison Sting", "Bite", "Glare", "Screech", "Acid")),
            "images/EkansFront.png",
            "images/EkansBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Arbok",
            "Poison",
            60, 85, 69, 80, 65, 79,
            new ArrayList<>(Arrays.asList("Wrap", "Leer", "Poison Sting", "Bite", "Glare", "Screech", "Acid")),
            "images/ArbokFront.png",
            "images/ArbokBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Pikachu",
            "Electric",
            35, 55, 40, 90, 50, 50,
            new ArrayList<>(Arrays.asList("Thunder Shock", "Growl", "Quick Attack", "Thunder Wave", "Double Team", "Slam", "Thunderbolt", "Agility", "Thunder")),
            "images/PikachuFront.png",
            "images/PikachuBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Raichu",
            "Electric",
            60, 90, 55, 110, 90, 80,
            new ArrayList<>(Arrays.asList("Thunder Shock", "Growl", "Quick Attack", "Thunder Wave", "Double Team", "Slam", "Thunderbolt", "Agility", "Thunder")),
            "images/RaichuFront.png",
            "images/RaichuBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Sandshrew",
            "Ground",
            50, 75, 85, 40, 20, 30,
            new ArrayList<>(Arrays.asList("Scratch", "Defense Curl", "Sand Attack", "Slash", "Poison Sting", "Swift", "Fury Swipes")),
            "images/SandshrewFront.png",
            "images/SandshrewBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Sandslash",
            "Ground",
            75, 100, 110, 65, 45, 55,
            new ArrayList<>(Arrays.asList("Scratch", "Defense Curl", "Sand Attack", "Slash", "Poison Sting", "Swift", "Fury Swipes")),
            "images/SandslashFront.png",
            "images/SandslashBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Nidoran♀",
            "Poison",
            55, 47, 52, 41, 40, 40,
            new ArrayList<>(Arrays.asList("Growl", "Tackle", "Scratch", "Poison Sting", "Double Kick", "Fury Swipes", "Bite")),
            "images/Nidoran♀Front.png",
            "images/Nidoran♀Back.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Nidorina",
            "Poison",
            70, 62, 67, 56, 55, 55,
            new ArrayList<>(Arrays.asList("Growl", "Tackle", "Scratch", "Poison Sting", "Double Kick", "Fury Swipes", "Bite")),
            "images/NidorinaFront.png",
            "images/NidorinaBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Nidoqueen",
            "Poison/Ground",
            90, 92, 87, 76, 75, 85,
            new ArrayList<>(Arrays.asList("Growl", "Tackle", "Scratch", "Poison Sting", "Double Kick", "Fury Swipes", "Bite", "Earthquake")),
            "images/NidoqueenFront.png",
            "images/NidoqueenBack.png"
         ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Nidoran♂",
            "Poison",
            46, 57, 40, 50, 40, 40,
            new ArrayList<>(Arrays.asList("Leer", "Tackle", "Horn Attack", "Poison Sting", "Double Kick", "Fury Attack", "Focus Energy")),
            "images/Nidoran♂Front.png",
            "images/Nidoran♂Back.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Nidorino",
            "Poison",
            61, 72, 57, 65, 55, 55,
            new ArrayList<>(Arrays.asList("Leer", "Tackle", "Horn Attack", "Poison Sting", "Double Kick", "Fury Attack", "Focus Energy")),
            "images/NidorinoFront.png",
            "images/NidorinoBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Nidoking",
            "Poison/Ground",
            81, 92, 77, 85, 85, 75,
            new ArrayList<>(Arrays.asList("Leer", "Tackle", "Horn Attack", "Poison Sting", "Double Kick", "Fury Attack", "Focus Energy", "Earthquake")),
            "images/NidokingFront.png",
            "images/NidokingBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Clefairy",
            "Normal",
            70, 45, 48, 35, 60, 65,
            new ArrayList<>(Arrays.asList("Pound", "Growl", "Sing", "Double Slap", "Minimize", "Metronome", "Defense Curl", "Moonlight")),
            "images/ClefairyFront.png",
            "images/ClefairyBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Clefable",
            "Normal",
            95, 70, 73, 60, 85, 90,
            new ArrayList<>(Arrays.asList("Pound", "Growl", "Sing", "Double Slap", "Minimize", "Metronome", "Defense Curl", "Moonlight")),
            "images/ClefableFront.png",
            "images/ClefableBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Vulpix",
            "Fire",
            38, 41, 40, 65, 50, 65,
            new ArrayList<>(Arrays.asList("Ember", "Tail Whip", "Quick Attack", "Roar", "Confuse Ray", "Flamethrower")),
            "images/VulpixFront.png",
            "images/VulpixBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Ninetales",
            "Fire",
            73, 76, 75, 100, 81, 100,
            new ArrayList<>(Arrays.asList("Ember", "Tail Whip", "Quick Attack", "Roar", "Confuse Ray", "Flamethrower")),
            "images/NinetalesFront.png",
            "images/NinetalesBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Jigglypuff",
            "Normal",
            115, 45, 20, 20, 45, 25,
            new ArrayList<>(Arrays.asList("Sing", "Pound", "Disable", "Defense Curl", "Double Slap", "Rest", "Body Slam", "Double-Edge")),
            "images/JigglypuffFront.png",
            "images/JigglypuffBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Wigglytuff",
            "Normal",
            140, 70, 45, 45, 85, 50,
            new ArrayList<>(Arrays.asList("Sing", "Pound", "Disable", "Defense Curl", "Double Slap", "Rest", "Body Slam", "Double-Edge")),
            "images/WigglytuffFront.png",
            "images/WigglytuffBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Zubat",
            "Poison/Flying",
            40, 45, 35, 55, 30, 40,
            new ArrayList<>(Arrays.asList("Leech Life", "Supersonic", "Bite", "Wing Attack", "Confuse Ray", "Haze")),
            "images/ZubatFront.png",
            "images/ZubatBack.png"
         ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Golbat",
            "Poison/Flying",
            75, 80, 70, 90, 65, 75,
            new ArrayList<>(Arrays.asList("Leech Life", "Supersonic", "Bite", "Wing Attack", "Confuse Ray", "Haze")),
            "images/GolbatFront.png",
            "images/GolbatBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Oddish",
            "Grass/Poison",
            45, 50, 55, 30, 75, 65,
            new ArrayList<>(Arrays.asList("Absorb", "Sweet Scent", "Acid", "Poison Powder", "Stun Spore", "Sleep Powder", "SolarBeam")),
            "images/OddishFront.png",
            "images/OddishBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Gloom",
            "Grass/Poison",
            60, 65, 70, 40, 85, 75,
            new ArrayList<>(Arrays.asList("Absorb", "Sweet Scent", "Acid", "Poison Powder", "Stun Spore", "Sleep Powder", "SolarBeam")),
            "images/GloomFront.png",
            "images/GloomBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Vileplume",
            "Grass/Poison",
            75, 80, 85, 50, 100, 90,
            new ArrayList<>(Arrays.asList("Absorb", "Sweet Scent", "Acid", "Poison Powder", "Stun Spore", "Sleep Powder", "SolarBeam")),
            "images/VileplumeFront.png",
            "images/VileplumeBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Paras",
            "Bug/Grass",
            35, 70, 55, 25, 45, 55,
            new ArrayList<>(Arrays.asList("Scratch", "Stun Spore", "Poison Powder", "Leech Life", "Spore", "Slash", "Growth")),
            "images/ParasFront.png",
            "images/ParasBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Parasect",
            "Bug/Grass",
            60, 95, 80, 30, 60, 80,
            new ArrayList<>(Arrays.asList("Scratch", "Stun Spore", "Poison Powder", "Leech Life", "Spore", "Slash", "Growth")),
            "images/ParasectFront.png",
            "images/ParasectBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Venonat",
            "Bug/Poison",
            60, 55, 50, 45, 40, 55,
            new ArrayList<>(Arrays.asList("Tackle", "Disable", "Poison Powder", "Leech Life", "Stun Spore", "Psybeam", "Sleep Powder")),
            "images/VenonatFront.png",
            "images/VenonatBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Venomoth",
            "Bug/Poison",
            70, 65, 60, 90, 90, 75,
            new ArrayList<>(Arrays.asList("Tackle", "Disable", "Poison Powder", "Leech Life", "Stun Spore", "Psybeam", "Sleep Powder")),
            "images/VenomothFront.png",
            "images/VenomothBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Diglett",
            "Ground",
            10, 55, 25, 95, 35, 45,
            new ArrayList<>(Arrays.asList("Scratch", "Growl", "Dig", "Sand Attack", "Slash", "Earthquake")),
            "images/DiglettFront.png",
            "images/DiglettBack.png"
         ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Dugtrio",
            "Ground",
            35, 100, 50, 120, 50, 70,
            new ArrayList<>(Arrays.asList("Scratch", "Growl", "Dig", "Sand Attack", "Slash", "Earthquake")),
            "images/DugtrioFront.png",
            "images/DugtrioBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Meowth",
            "Normal",
            40, 45, 35, 90, 40, 40,
            new ArrayList<>(Arrays.asList("Scratch", "Growl", "Bite", "Pay Day", "Screech", "Fury Swipes", "Slash")),
            "images/MeowthFront.png",
            "images/MeowthBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Persian",
            "Normal",
            65, 70, 60, 115, 65, 65,
            new ArrayList<>(Arrays.asList("Scratch", "Growl", "Bite", "Pay Day", "Screech", "Fury Swipes", "Slash")),
            "images/PersianFront.png",
            "images/PersianBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Psyduck",
            "Water",
            50, 52, 48, 55, 65, 50,
            new ArrayList<>(Arrays.asList("Scratch", "Tail Whip", "Disable", "Confusion", "Fury Swipes", "Hydro Pump")),
            "images/PsyduckFront.png",
            "images/PsyduckBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Golduck",
            "Water",
            80, 82, 78, 85, 95, 80,
            new ArrayList<>(Arrays.asList("Scratch", "Tail Whip", "Disable", "Confusion", "Fury Swipes", "Hydro Pump")),
            "images/GolduckFront.png",
            "images/GolduckBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Mankey",
            "Fighting",
            40, 80, 35, 70, 35, 45,
            new ArrayList<>(Arrays.asList("Scratch", "Leer", "Low Kick", "Karate Chop", "Fury Swipes", "Focus Energy", "Seismic Toss")),
            "images/MankeyFront.png",
            "images/MankeyBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Primeape",
            "Fighting",
            65, 105, 60, 95, 60, 70,
            new ArrayList<>(Arrays.asList("Scratch", "Leer", "Low Kick", "Karate Chop", "Fury Swipes", "Focus Energy", "Seismic Toss")),
            "images/PrimeapeFront.png",
            "images/PrimeapeBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Growlithe",
            "Fire",
            55, 70, 45, 60, 70, 50,
            new ArrayList<>(Arrays.asList("Bite", "Roar", "Ember", "Leer", "Take Down", "Flamethrower", "Agility")),
            "images/GrowlitheFront.png",
            "images/GrowlitheBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Arcanine",
            "Fire",
            90, 110, 80, 95, 100, 80,
            new ArrayList<>(Arrays.asList("Bite", "Roar", "Ember", "Leer", "Take Down", "Flamethrower", "Agility")),
            "images/ArcanineFront.png",
            "images/ArcanineBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Poliwag",
            "Water",
            40, 50, 40, 90, 40, 40,
            new ArrayList<>(Arrays.asList("Bubble", "Hypnosis", "Water Gun", "Double Slap", "Body Slam", "Amnesia", "Hydro Pump")),
            "images/PoliwagFront.png",
            "images/PoliwagBack.png"
        ));
            gen1PokemonList.add(new Gen1Pokemon(
                "Poliwhirl",
                "Water",
                65, 65, 65, 90, 50, 50,
                new ArrayList<>(Arrays.asList("Bubble", "Hypnosis", "Water Gun", "Double Slap", "Body Slam", "Amnesia", "Hydro Pump")),
                "images/PoliwhirlFront.png",
                "images/PoliwhirlBack.png"
            ));
            gen1PokemonList.add(new Gen1Pokemon(
                "Poliwrath",
                "Water/Fighting",
                90, 85, 95, 70, 70, 90,
                new ArrayList<>(Arrays.asList("Bubble", "Hypnosis", "Water Gun", "Double Slap", "Body Slam", "Amnesia", "Hydro Pump")),
                "images/PoliwrathFront.png",
                "images/PoliwrathBack.png"
            ));
            gen1PokemonList.add(new Gen1Pokemon(
                "Abra",
                "Psychic",
                25, 20, 15, 90, 105, 55,
                new ArrayList<>(Arrays.asList("Teleport")),
                "images/AbraFront.png",
                "images/AbraBack.png"
            ));
            gen1PokemonList.add(new Gen1Pokemon(
                "Kadabra",
                "Psychic",
                40, 35, 30, 105, 120, 70,
                new ArrayList<>(Arrays.asList("Teleport", "Confusion", "Disable", "Psybeam", "Recover", "Psychic")),
                "images/KadabraFront.png",
                "images/KadabraBack.png"
            ));
            gen1PokemonList.add(new Gen1Pokemon(
                "Alakazam",
                "Psychic",
                55, 50, 45, 120, 135, 85,
                new ArrayList<>(Arrays.asList("Teleport", "Confusion", "Disable", "Psybeam", "Recover", "Psychic")),
                "images/AlakazamFront.png",
                "images/AlakazamBack.png"
            ));
            gen1PokemonList.add(new Gen1Pokemon(
                "Machop",
                "Fighting",
                70, 80, 50, 35, 35, 35,
                new ArrayList<>(Arrays.asList("Low Kick", "Leer", "Karate Chop", "Seismic Toss", "Focus Energy", "Submission")),
                "images/MachopFront.png",
                "images/MachopBack.png"
            ));
            gen1PokemonList.add(new Gen1Pokemon(
                "Machoke",
                "Fighting",
                80, 100, 70, 45, 50, 60,
                new ArrayList<>(Arrays.asList("Low Kick", "Leer", "Karate Chop", "Seismic Toss", "Focus Energy", "Submission")),
                "images/MachokeFront.png",
                "images/MachokeBack.png"
            ));
            gen1PokemonList.add(new Gen1Pokemon(
                "Machamp",
                "Fighting",
                90, 130, 80, 55, 65, 85,
                new ArrayList<>(Arrays.asList("Low Kick", "Leer", "Karate Chop", "Seismic Toss", "Focus Energy", "Submission")),
                "images/MachampFront.png",
                "images/MachampBack.png"
            ));
            gen1PokemonList.add(new Gen1Pokemon(
                "Bellsprout",
                "Grass/Poison",
                50, 75, 35, 40, 70, 30,
                new ArrayList<>(Arrays.asList("Vine Whip", "Growth", "Wrap", "Poison Powder", "Stun Spore", "Sleep Powder", "Acid", "Razor Leaf", "SolarBeam")),
                "images/BellsproutFront.png",
                "images/BellsproutBack.png"
            ));
            gen1PokemonList.add(new Gen1Pokemon(
            "Weepinbell",
            "Grass/Poison",
            65, 90, 50, 55, 85, 45,
            new ArrayList<>(Arrays.asList("Vine Whip", "Growth", "Wrap", "Poison Powder", "Stun Spore", "Sleep Powder", "Acid", "Razor Leaf", "SolarBeam")),
            "images/WeepinbellFront.png",
            "images/WeepinbellBack.png"
            ));
            gen1PokemonList.add(new Gen1Pokemon(
                "Victreebel",
                "Grass/Poison",
                80, 105, 65, 70, 100, 60,
                new ArrayList<>(Arrays.asList("Vine Whip", "Growth", "Wrap", "Poison Powder", "Stun Spore", "Sleep Powder", "Acid", "Razor Leaf", "SolarBeam")),
                "images/VictreebelFront.png",
                "images/VictreebelBack.png"
            ));
            gen1PokemonList.add(new Gen1Pokemon(
                "Tentacool",
                "Water/Poison",
                40, 40, 35, 70, 50, 100,
                new ArrayList<>(Arrays.asList("Poison Sting", "Supersonic", "Wrap", "Acid", "BubbleBeam", "Barrier", "Hydro Pump")),
                "images/TentacoolFront.png",
                "images/TentacoolBack.png"
            ));
            gen1PokemonList.add(new Gen1Pokemon(
                "Tentacruel",
                "Water/Poison",
                80, 70, 65, 100, 80, 120,
                new ArrayList<>(Arrays.asList("Poison Sting", "Supersonic", "Wrap", "Acid", "BubbleBeam", "Barrier", "Hydro Pump")),
                "images/TentacruelFront.png",
                "images/TentacruelBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Geodude",
            "Rock/Ground",
            40, 80, 100, 20, 30, 30,
            new ArrayList<>(Arrays.asList("Tackle", "Defense Curl", "Rock Throw", "Self-Destruct", "Harden", "Earthquake", "Explosion")),
            "images/GeodudeFront.png",
            "images/GeodudeBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Graveler",
            "Rock/Ground",
            55, 95, 115, 35, 45, 45,
            new ArrayList<>(Arrays.asList("Tackle", "Defense Curl", "Rock Throw", "Self-Destruct", "Harden", "Earthquake", "Explosion")),
            "images/GravelerFront.png",
            "images/GravelerBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Golem",
            "Rock/Ground",
            80, 120, 130, 45, 55, 65,
            new ArrayList<>(Arrays.asList("Tackle", "Defense Curl", "Rock Throw", "Self-Destruct", "Harden", "Earthquake", "Explosion")),
            "images/GolemFront.png",
            "images/GolemBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Ponyta",
            "Fire",
            50, 85, 55, 90, 65, 65,
            new ArrayList<>(Arrays.asList("Ember", "Tail Whip", "Stomp", "Growl", "Fire Spin", "Agility", "Take Down")),
            "images/PonytaFront.png",
            "images/PonytaBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Rapidash",
            "Fire",
            65, 100, 70, 105, 80, 80,
            new ArrayList<>(Arrays.asList("Ember", "Tail Whip", "Stomp", "Growl", "Fire Spin", "Agility", "Take Down")),
            "images/RapidashFront.png",
            "images/RapidashBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Slowpoke",
            "Water/Psychic",
            90, 65, 65, 15, 40, 40,
            new ArrayList<>(Arrays.asList("Tackle", "Growl", "Water Gun", "Confusion", "Disable", "Headbutt", "Amnesia", "Psychic")),
            "images/SlowpokeFront.png",
            "images/SlowpokeBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Slowbro",
            "Water/Psychic",
            95, 75, 110, 30, 100, 80,
            new ArrayList<>(Arrays.asList("Tackle", "Growl", "Water Gun", "Confusion", "Disable", "Headbutt", "Amnesia", "Psychic")),
            "images/SlowbroFront.png",
            "images/SlowbroBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Magnemite",
            "Electric/Steel",
            25, 35, 70, 45, 95, 55,
            new ArrayList<>(Arrays.asList("Tackle", "Sonic Boom", "Thunder Shock", "Supersonic", "Thunder Wave", "Swift", "Thunderbolt")),
            "images/MagnemiteFront.png",
            "images/MagnemiteBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Magneton",
            "Electric/Steel",
            50, 60, 95, 70, 120, 70,
            new ArrayList<>(Arrays.asList("Tackle", "Sonic Boom", "Thunder Shock", "Supersonic", "Thunder Wave", "Swift", "Thunderbolt")),
            "images/MagnetonFront.png",
            "images/MagnetonBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Farfetch'd",
            "Normal/Flying",
            52, 65, 55, 60, 58, 62,
            new ArrayList<>(Arrays.asList("Peck", "Sand Attack", "Leer", "Fury Attack", "Agility", "Slash", "Swords Dance")),
            "images/FarfetchdFront.png",
            "images/FarfetchdBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Doduo",
            "Normal/Flying",
            35, 85, 45, 75, 35, 35,
            new ArrayList<>(Arrays.asList("Peck", "Growl", "Quick Attack", "Rage", "Fury Attack", "Agility", "Drill Peck")),
            "images/DoduoFront.png",
            "images/DoduoBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Dodrio",
            "Normal/Flying",
            60, 110, 70, 100, 60, 60,
            new ArrayList<>(Arrays.asList("Peck", "Growl", "Quick Attack", "Rage", "Fury Attack", "Agility", "Drill Peck")),
            "images/DodrioFront.png",
            "images/DodrioBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Seel",
            "Water",
            65, 45, 55, 45, 45, 70,
            new ArrayList<>(Arrays.asList("Headbutt", "Growl", "Aurora Beam", "Rest", "Take Down", "Ice Beam")),
            "images/SeelFront.png",
            "images/SeelBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Dewgong",
            "Water/Ice",
            90, 70, 80, 70, 70, 95,
            new ArrayList<>(Arrays.asList("Headbutt", "Growl", "Aurora Beam", "Rest", "Take Down", "Ice Beam")),
            "images/DewgongFront.png",
            "images/DewgongBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Grimer",
            "Poison",
            80, 80, 50, 25, 40, 50,
            new ArrayList<>(Arrays.asList("Pound", "Disable", "Poison Gas", "Minimize", "Sludge", "Harden", "Acid Armor")),
            "images/GrimerFront.png",
            "images/GrimerBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Muk",
            "Poison",
            105, 105, 75, 50, 65, 100,
            new ArrayList<>(Arrays.asList("Pound", "Disable", "Poison Gas", "Minimize", "Sludge", "Harden", "Acid Armor")),
            "images/MukFront.png",
            "images/MukBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Shellder",
            "Water",
            30, 65, 100, 40, 45, 25,
            new ArrayList<>(Arrays.asList("Tackle", "Withdraw", "Supersonic", "Aurora Beam", "Clamp", "Ice Beam", "Take Down")),
            "images/ShellderFront.png",
            "images/ShellderBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Cloyster",
            "Water/Ice",
            50, 95, 180, 70, 85, 45,
            new ArrayList<>(Arrays.asList("Tackle", "Withdraw", "Supersonic", "Aurora Beam", "Clamp", "Ice Beam", "Take Down")),
            "images/CloysterFront.png",
            "images/CloysterBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Gastly",
            "Ghost/Poison",
            30, 35, 30, 80, 100, 35,
            new ArrayList<>(Arrays.asList("Lick", "Confuse Ray", "Night Shade", "Hypnosis", "Dream Eater")),
            "images/GastlyFront.png",
            "images/GastlyBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Haunter",
            "Ghost/Poison",
            45, 50, 45, 95, 115, 55,
            new ArrayList<>(Arrays.asList("Lick", "Confuse Ray", "Night Shade", "Hypnosis", "Dream Eater")),
            "images/HaunterFront.png",
            "images/HaunterBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Gengar",
            "Ghost/Poison",
            60, 65, 60, 110, 130, 75,
            new ArrayList<>(Arrays.asList("Lick", "Confuse Ray", "Night Shade", "Hypnosis", "Dream Eater")),
            "images/GengarFront.png",
            "images/GengarBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Onix",
            "Rock/Ground",
            35, 45, 160, 70, 30, 45,
            new ArrayList<>(Arrays.asList("Tackle", "Screech", "Bind", "Rock Throw", "Harden", "Rage", "Earthquake")),
            "images/OnixFront.png",
            "images/OnixBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Drowzee",
            "Psychic",
            60, 48, 45, 42, 43, 90,
            new ArrayList<>(Arrays.asList("Pound", "Hypnosis", "Disable", "Confusion", "Headbutt", "Poison Gas", "Psychic")),
            "images/DrowzeeFront.png",
            "images/DrowzeeBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Hypno",
            "Psychic",
            85, 73, 70, 67, 73, 115,
            new ArrayList<>(Arrays.asList("Pound", "Hypnosis", "Disable", "Confusion", "Headbutt", "Poison Gas", "Psychic")),
            "images/HypnoFront.png",
            "images/HypnoBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Krabby",
            "Water",
            30, 105, 90, 50, 25, 25,
            new ArrayList<>(Arrays.asList("Bubble", "Leer", "Vice Grip", "Harden", "Stomp", "Crabhammer", "Guillotine")),
            "images/KrabbyFront.png",
            "images/KrabbyBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Kingler",
            "Water",
            55, 130, 115, 75, 50, 50,
            new ArrayList<>(Arrays.asList("Bubble", "Leer", "Vice Grip", "Harden", "Stomp", "Crabhammer", "Guillotine")),
            "images/KinglerFront.png",
            "images/KinglerBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Voltorb",
            "Electric",
            40, 30, 50, 100, 55, 55,
            new ArrayList<>(Arrays.asList("Tackle", "Screech", "Sonic Boom", "Self-Destruct", "Light Screen", "Swift", "Explosion")),
            "images/VoltorbFront.png",
            "images/VoltorbBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Electrode",
            "Electric",
            60, 50, 70, 140, 80, 80,
            new ArrayList<>(Arrays.asList("Tackle", "Screech", "Sonic Boom", "Self-Destruct", "Light Screen", "Swift", "Explosion")),
            "images/ElectrodeFront.png",
            "images/ElectrodeBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Exeggcute",
            "Grass/Psychic",
            60, 40, 80, 40, 60, 45,
            new ArrayList<>(Arrays.asList("Barrage", "Hypnosis", "Reflect", "Leech Seed", "Stun Spore", "Poison Powder", "SolarBeam", "Sleep Powder", "Psychic")),
            "images/ExeggcuteFront.png",
            "images/ExeggcuteBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Exeggutor",
            "Grass/Psychic",
            95, 95, 85, 55, 125, 65,
            new ArrayList<>(Arrays.asList("Barrage", "Hypnosis", "Stomp", "Leech Seed", "Stun Spore", "Poison Powder", "SolarBeam", "Sleep Powder", "Psychic")),
            "images/ExeggutorFront.png",
            "images/ExeggutorBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Cubone",
            "Ground",
            50, 50, 95, 35, 40, 50,
            new ArrayList<>(Arrays.asList("Growl", "Bone Club", "Headbutt", "Leer", "Focus Energy", "Thrash", "Bonemerang", "Rage")),
            "images/CuboneFront.png",
            "images/CuboneBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Marowak",
            "Ground",
            60, 80, 110, 45, 50, 80,
            new ArrayList<>(Arrays.asList("Growl", "Bone Club", "Headbutt", "Leer", "Focus Energy", "Thrash", "Bonemerang", "Rage")),
            "images/MarowakFront.png",
            "images/MarowakBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Hitmonlee",
            "Fighting",
            50, 120, 53, 87, 35, 110,
            new ArrayList<>(Arrays.asList("Double Kick", "Meditate", "Rolling Kick", "Jump Kick", "Focus Energy", "Hi Jump Kick", "Counter", "Seismic Toss")),
            "images/HitmonleeFront.png",
            "images/HitmonleeBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Hitmonchan",
            "Fighting",
            50, 105, 79, 76, 35, 110,
            new ArrayList<>(Arrays.asList("Comet Punch", "Agility", "Fire Punch", "Ice Punch", "Thunder Punch", "Counter", "Seismic Toss", "Mega Punch")),
            "images/HitmonchanFront.png",
            "images/HitmonchanBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Lickitung",
            "Normal",
            90, 55, 75, 30, 60, 75,
            new ArrayList<>(Arrays.asList("Wrap", "Supersonic", "Stomp", "Disable", "Defense Curl", "Slam", "Screech")),
            "images/LickitungFront.png",
            "images/LickitungBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Koffing",
            "Poison",
            40, 65, 95, 35, 60, 45,
            new ArrayList<>(Arrays.asList("Tackle", "Smog", "Sludge", "SmokeScreen", "Self-Destruct", "Haze", "Explosion")),
            "images/KoffingFront.png",
            "images/KoffingBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Weezing",
            "Poison",
            65, 90, 120, 60, 85, 70,
            new ArrayList<>(Arrays.asList("Tackle", "Smog", "Sludge", "SmokeScreen", "Self-Destruct", "Haze", "Explosion")),
            "images/WeezingFront.png",
            "images/WeezingBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Rhyhorn",
            "Ground/Rock",
            80, 85, 95, 25, 30, 30,
            new ArrayList<>(Arrays.asList("Horn Attack", "Stomp", "Tail Whip", "Fury Attack", "Scary Face", "Take Down", "Earthquake")),
            "images/RhyhornFront.png",
            "images/RhyhornBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Rhydon",
            "Ground/Rock",
            105, 130, 120, 40, 45, 45,
            new ArrayList<>(Arrays.asList("Horn Attack", "Stomp", "Tail Whip", "Fury Attack", "Scary Face", "Take Down", "Earthquake")),
            "images/RhydonFront.png",
            "images/RhydonBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Chansey",
            "Normal",
            250, 5, 5, 50, 35, 105,
            new ArrayList<>(Arrays.asList("Pound", "Growl", "Sing", "Double Slap", "Minimize", "Soft-Boiled", "Egg Bomb", "Light Screen")),
            "images/ChanseyFront.png",
            "images/ChanseyBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Tangela",
            "Grass",
            65, 55, 115, 60, 100, 40,
            new ArrayList<>(Arrays.asList("Vine Whip", "Bind", "Stun Spore", "Poison Powder", "Sleep Powder", "Growth", "Slam", "SolarBeam")),
            "images/TangelaFront.png",
            "images/TangelaBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Kangaskhan",
            "Normal",
            105, 95, 80, 90, 40, 80,
            new ArrayList<>(Arrays.asList("Comet Punch", "Bite", "Tail Whip", "Mega Punch", "Rage", "Dizzy Punch", "Earthquake")),
            "images/KangaskhanFront.png",
            "images/KangaskhanBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Horsea",
            "Water",
            30, 40, 70, 60, 70, 25,
            new ArrayList<>(Arrays.asList("Bubble", "Smokescreen", "Leer", "Water Gun", "Agility", "Hydro Pump")),
            "images/HorseaFront.png",
            "images/HorseaBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Seadra",
            "Water",
            55, 65, 95, 85, 95, 45,
            new ArrayList<>(Arrays.asList("Bubble", "Smokescreen", "Leer", "Water Gun", "Agility", "Hydro Pump")),
            "images/SeadraFront.png",
            "images/SeadraBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Goldeen",
            "Water",
            45, 67, 60, 63, 35, 50,
            new ArrayList<>(Arrays.asList("Peck", "Tail Whip", "Supersonic", "Horn Attack", "Fury Attack", "Waterfall", "Agility")),
            "images/GoldeenFront.png",
            "images/GoldeenBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Seaking",
            "Water",
            80, 92, 65, 68, 65, 80,
            new ArrayList<>(Arrays.asList("Peck", "Tail Whip", "Supersonic", "Horn Attack", "Fury Attack", "Waterfall", "Agility")),
            "images/SeakingFront.png",
            "images/SeakingBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Staryu",
            "Water",
            30, 45, 55, 85, 70, 55,
            new ArrayList<>(Arrays.asList("Tackle", "Water Gun", "Harden", "Recover", "Swift", "Hydro Pump")),
            "images/StaryuFront.png",
            "images/StaryuBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Starmie",
            "Water/Psychic",
            60, 75, 85, 115, 100, 85,
            new ArrayList<>(Arrays.asList("Tackle", "Water Gun", "Harden", "Recover", "Swift", "Hydro Pump", "Psychic")),
            "images/StarmieFront.png",
            "images/StarmieBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Mr. Mime",
            "Psychic/Fairy",
            40, 45, 65, 90, 100, 120,
            new ArrayList<>(Arrays.asList("Confusion", "Barrier", "Light Screen", "Double Slap", "Meditate", "Substitute", "Psychic")),
            "images/MrMimeFront.png",
            "images/MrMimeBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Scyther",
            "Bug/Flying",
            70, 110, 80, 105, 55, 80,
            new ArrayList<>(Arrays.asList("Quick Attack", "Leer", "Focus Energy", "Double Team", "Slash", "Agility", "Wing Attack")),
            "images/ScytherFront.png",
            "images/ScytherBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Jynx",
            "Ice/Psychic",
            65, 50, 35, 95, 115, 95,
            new ArrayList<>(Arrays.asList("Pound", "Lovely Kiss", "Lick", "Double Slap", "Ice Punch", "Body Slam", "Blizzard", "Psychic")),
            "images/JynxFront.png",
            "images/JynxBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Electabuzz",
            "Electric",
            65, 83, 57, 105, 95, 85,
            new ArrayList<>(Arrays.asList("Quick Attack", "Leer", "Thunder Punch", "Light Screen", "Swift", "Thunderbolt", "Thunder")),
            "images/ElectabuzzFront.png",
            "images/ElectabuzzBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Magmar",
            "Fire",
            65, 95, 57, 93, 100, 85,
            new ArrayList<>(Arrays.asList("Ember", "Leer", "Smog", "Fire Punch", "SmokeScreen", "Confuse Ray", "Flamethrower")),
            "images/MagmarFront.png",
            "images/MagmarBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Pinsir",
            "Bug",
            65, 125, 100, 85, 55, 70,
            new ArrayList<>(Arrays.asList("Vice Grip", "Seismic Toss", "Guillotine", "Focus Energy", "Harden", "Slash", "Swords Dance")),
            "images/PinsirFront.png",
            "images/PinsirBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Tauros",
            "Normal",
            75, 100, 95, 110, 40, 70,
            new ArrayList<>(Arrays.asList("Tackle", "Stomp", "Tail Whip", "Leer", "Rage", "Take Down", "Earthquake")),
            "images/TaurosFront.png",
            "images/TaurosBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Magikarp",
            "Water",
            20, 10, 55, 80, 15, 20,
            new ArrayList<>(Arrays.asList("Splash", "Tackle", "Flail")),
            "images/MagikarpFront.png",
            "images/MagikarpBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Gyarados",
            "Water/Flying",
            95, 125, 79, 81, 60, 100,
            new ArrayList<>(Arrays.asList("Bite", "Dragon Rage", "Leer", "Hydro Pump", "Hyper Beam")),
            "images/GyaradosFront.png",
            "images/GyaradosBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Lapras",
            "Water/Ice",
            130, 85, 80, 60, 85, 95,
            new ArrayList<>(Arrays.asList("Water Gun", "Growl", "Sing", "Mist", "Body Slam", "Confuse Ray", "Ice Beam", "Hydro Pump")),
            "images/LaprasFront.png",
            "images/LaprasBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Ditto",
            "Normal",
            48, 48, 48, 48, 48, 48,
            new ArrayList<>(Arrays.asList("Transform")),
            "images/DittoFront.png",
            "images/DittoBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Eevee",
            "Normal",
            55, 55, 50, 55, 45, 65,
            new ArrayList<>(Arrays.asList("Tackle", "Tail Whip", "Sand Attack", "Quick Attack", "Bite", "Focus Energy", "Take Down")),
            "images/EeveeFront.png",
            "images/EeveeBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Vaporeon",
            "Water",
            130, 65, 60, 65, 110, 95,
            new ArrayList<>(Arrays.asList("Tackle", "Tail Whip", "Sand Attack", "Quick Attack", "Water Gun", "Aurora Beam", "Hydro Pump")),
            "images/VaporeonFront.png",
            "images/VaporeonBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Jolteon",
            "Electric",
            65, 65, 60, 130, 110, 95,
            new ArrayList<>(Arrays.asList("Tackle", "Tail Whip", "Sand Attack", "Quick Attack", "Thunder Shock", "Double Kick", "Thunderbolt", "Thunder")),
            "images/JolteonFront.png",
            "images/JolteonBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Flareon",
            "Fire",
            65, 130, 60, 65, 95, 110,
            new ArrayList<>(Arrays.asList("Tackle", "Tail Whip", "Sand Attack", "Quick Attack", "Ember", "Fire Spin", "Flamethrower")),
            "images/FlareonFront.png",
            "images/FlareonBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Porygon",
            "Normal",
            65, 60, 70, 40, 85, 75,
            new ArrayList<>(Arrays.asList("Tackle", "Conversion", "Sharpen", "Psybeam", "Recover", "Agility", "Tri Attack")),
            "images/PorygonFront.png",
            "images/PorygonBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Omanyte",
            "Rock/Water",
            35, 40, 100, 35, 90, 55,
            new ArrayList<>(Arrays.asList("Constrict", "Withdraw", "Water Gun", "Horn Attack", "Leer", "Spike Cannon", "Hydro Pump")),
            "images/OmanyteFront.png",
            "images/OmanyteBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Omastar",
            "Rock/Water",
            70, 60, 125, 55, 115, 70,
            new ArrayList<>(Arrays.asList("Constrict", "Withdraw", "Water Gun", "Horn Attack", "Leer", "Spike Cannon", "Hydro Pump")),
            "images/OmastarFront.png",
            "images/OmastarBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Kabuto",
            "Rock/Water",
            30, 80, 90, 55, 45, 45,
            new ArrayList<>(Arrays.asList("Scratch", "Harden", "Absorb", "Leer", "Slash", "Hydro Pump")),
            "images/KabutoFront.png",
            "images/KabutoBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Kabutops",
            "Rock/Water",
            60, 115, 105, 80, 65, 70,
            new ArrayList<>(Arrays.asList("Scratch", "Harden", "Absorb", "Leer", "Slash", "Hydro Pump")),
            "images/KabutopsFront.png",
            "images/KabutopsBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Aerodactyl",
            "Rock/Flying",
            80, 105, 65, 130, 60, 75,
            new ArrayList<>(Arrays.asList("Wing Attack", "Agility", "Bite", "Supersonic", "Hyper Beam")),
            "images/AerodactylFront.png",
            "images/AerodactylBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Snorlax",
            "Normal",
            160, 110, 65, 30, 65, 110,
            new ArrayList<>(Arrays.asList("Headbutt", "Amnesia", "Rest", "Body Slam", "Harden", "Hyper Beam")),
            "images/SnorlaxFront.png",
            "images/SnorlaxBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Articuno",
            "Ice/Flying",
            90, 85, 100, 85, 95, 125,
            new ArrayList<>(Arrays.asList("Peck", "Ice Beam", "Blizzard", "Agility", "Mist", "Sky Attack")),
            "images/ArticunoFront.png",
            "images/ArticunoBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Zapdos",
            "Electric/Flying",
            90, 90, 85, 100, 125, 90,
            new ArrayList<>(Arrays.asList("Peck", "Thunder Shock", "Drill Peck", "Thunderbolt", "Agility", "Thunder")),
            "images/ZapdosFront.png",
            "images/ZapdosBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Moltres",
            "Fire/Flying",
            90, 100, 90, 90, 125, 85,
            new ArrayList<>(Arrays.asList("Peck", "Ember", "Fire Spin", "Agility", "Flamethrower", "Sky Attack")),
            "images/MoltresFront.png",
            "images/MoltresBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Dratini",
            "Dragon",
            41, 64, 45, 50, 50, 50,
            new ArrayList<>(Arrays.asList("Wrap", "Leer", "Thunder Wave", "Agility", "Slam", "Dragon Rage", "Hyper Beam")),
            "images/DratiniFront.png",
            "images/DratiniBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Dragonair",
            "Dragon",
            61, 84, 65, 70, 70, 70,
            new ArrayList<>(Arrays.asList("Wrap", "Leer", "Thunder Wave", "Agility", "Slam", "Dragon Rage", "Hyper Beam")),
            "images/DragonairFront.png",
            "images/DragonairBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Dragonite",
            "Dragon/Flying",
            91, 134, 95, 80, 100, 100,
            new ArrayList<>(Arrays.asList("Wrap", "Leer", "Thunder Wave", "Agility", "Slam", "Dragon Rage", "Hyper Beam")),
            "images/DragoniteFront.png",
            "images/DragoniteBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Mewtwo",
            "Psychic",
            106, 110, 90, 130, 154, 90,
            new ArrayList<>(Arrays.asList("Confusion", "Disable", "Swift", "Psychic", "Recover", "Barrier", "Amnesia", "Mist")),
            "images/MewtwoFront.png",
            "images/MewtwoBack.png"
        ));
        gen1PokemonList.add(new Gen1Pokemon(
            "Mew",
            "Psychic",
            100, 100, 100, 100, 100, 100,
            new ArrayList<>(Arrays.asList("Pound", "Transform", "Mega Punch", "Metronome", "Psychic", "Barrier", "Ancient Power")),
            "images/MewFront.png",
            "images/MewBack.png"
        ));
    }

    public static void verifyPokemonList() {
        List<String> officialGen1Pokemon = Arrays.asList(
            "Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard",
            "Squirtle", "Wartortle", "Blastoise", "Caterpie", "Metapod", "Butterfree",
            "Weedle", "Kakuna", "Beedrill", "Pidgey", "Pidgeotto", "Pidgeot", "Rattata",
            "Raticate", "Spearow", "Fearow", "Ekans", "Arbok", "Pikachu", "Raichu",
            "Sandshrew", "Sandslash", "Nidoran♀", "Nidorina", "Nidoqueen", "Nidoran♂",
            "Nidorino", "Nidoking", "Clefairy", "Clefable", "Vulpix", "Ninetales",
            "Jigglypuff", "Wigglytuff", "Zubat", "Golbat", "Oddish", "Gloom", "Vileplume",
            "Paras", "Parasect", "Venonat", "Venomoth", "Diglett", "Dugtrio", "Meowth",
            "Persian", "Psyduck", "Golduck", "Mankey", "Primeape", "Growlithe", "Arcanine",
            "Poliwag", "Poliwhirl", "Poliwrath", "Abra", "Kadabra", "Alakazam", "Machop",
            "Machoke", "Machamp", "Bellsprout", "Weepinbell", "Victreebel", "Tentacool",
            "Tentacruel", "Geodude", "Graveler", "Golem", "Ponyta", "Rapidash", "Slowpoke",
            "Slowbro", "Magnemite", "Magneton", "Farfetch'd", "Doduo", "Dodrio", "Seel",
            "Dewgong", "Grimer", "Muk", "Shellder", "Cloyster", "Gastly", "Haunter",
            "Gengar", "Onix", "Drowzee", "Hypno", "Krabby", "Kingler", "Voltorb",
            "Electrode", "Exeggcute", "Exeggutor", "Cubone", "Marowak", "Hitmonlee",
            "Hitmonchan", "Lickitung", "Koffing", "Weezing", "Rhyhorn", "Rhydon",
            "Chansey", "Tangela", "Kangaskhan", "Horsea", "Seadra", "Goldeen", "Seaking",
            "Staryu", "Starmie", "Mr. Mime", "Scyther", "Jynx", "Electabuzz", "Magmar",
            "Pinsir", "Tauros", "Magikarp", "Gyarados", "Lapras", "Ditto", "Eevee",
            "Vaporeon", "Jolteon", "Flareon", "Porygon", "Omanyte", "Omastar", "Kabuto",
            "Kabutops", "Aerodactyl", "Snorlax", "Articuno", "Zapdos", "Moltres", "Dratini",
            "Dragonair", "Dragonite", "Mewtwo", "Mew"
        );
    }

    public static List<Gen1Pokemon> getGen1PokemonList() {
        return gen1PokemonList;
    }

    public static void displayGen1Pokemon() {
        for (Gen1Pokemon pokemon : gen1PokemonList) {
            System.out.println(pokemon);
        }
    }
}