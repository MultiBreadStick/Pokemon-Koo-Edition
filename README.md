# Pokemon: Koo Edition

## Project Description
**Pokemon: Koo Edition** is a text-based Pokémon simulation game where players can battle opponents, manage their Pokémon team, and experience the thrill of Pokémon battles in a console environment. The game dynamically assigns Pokémon teams, calculates battle outcomes using stats and moves, and provides an engaging turn-based battle system.

### Key Highlights:
- **Goal**: Pokemon Simulator with 
- **User Experience**: Players can:
  - Randomly generates a team of 6 Pokémon.
  - Battle against the AI opponent, **Zachary Koo**
  - View detailed stats for their Pokémon.
- **Uniqueness**: The game integrates Pokémon stats, moves, and mechanics into a seamless text-based experience, offering a nostalgic yet strategic gameplay.

---

## Features
- **Pokémon Teams**:
  - Players and opponents are randomly assigned random teams of 6 Pokémon from the original 151 Pokémon.
- **Battle System**:
  - Turn-based battles with move selection and damage based on Pokémon stats.
  - Opponent AI (Zachary Koo) selects moves.
- **Move Mechanics**:
  - Moves have types, categories, power, and accuracy.
  - Damage is calculated using Pokémon stats and move properties.
- **Stat Management**:
  - Pokémon stats include health, attack, defense, speed, special attack, and special defense.
  - Health updates after every move.
- **Player Interaction**:
  - Players can view their Pokémon stats and choose moves during battles.

---

## How the Code Works
### Main Classes:
1. **`Main`**:
   - Handles the game loop and user interaction.
   - Manages battles, move selection, and game flow.
2. **`Player`**:
   - Represents the player and their Pokémon team.
3. **`PlayerPokemon`**:
   - Extends the `Pokemon` class to include health and battle-specific behavior.
4. **`PokemonAssigner`**:
   - Assigns random teams of 6 Pokémon to players and opponents.
5. **`Gen1Pokemon`**:
   - Stores data for all 151 Pokémon, including stats, types, and moves.
6. **`Moves`**:
   - Stores all available moves and provides methods to retrieve moves by name or randomly.
7. **`Move`**:
   - Represents individual moves with properties like power, type, and category.
8. **`ZacharyKoo`**:
   - Represents the AI opponent with its own Pokémon team and move selection logic.

### Data Storage:
- **Pokémon Data**:
  - Stored in `Gen1Pokemon` as a list of Pokémon objects.
- **Move Data**:
  - Stored in `Moves` as a list of move objects.
- **Teams**:
  - Stored as `ArrayList<PlayerPokemon>` for both players and opponents.

### Inheritance:
- The `PlayerPokemon` class extends the `Pokemon` class to add heealth and battle-specific behavior.
- Shared behavior across Pokémon is implemented using inheritance, reducing redundancy.

---

## How to Run the Program
### Step-by-Step Instructions:
1. **CRunning**:
   - Press run in the main method in Main.java. 
2. **Gameplay**:
   - Follow the on-screen instructions to:
     - Enter your name.
     - View your Pokémon team.
     - Battle against **Zachary Koo**.
     - Exit the game when finished.

---

## Development Process
- **Sprint Goals**:
  - Implement core game mechanics (team assignment, battles, and move selection).
  - Ensure dynamic health and damage calculation.
- **Challenges Overcome**:
  - Designing a system for Pokémon and move data storage.
  - Implementing realistic damage calculation using stats and move properties.
- **Future Improvements**:
  - Use JFrame to make a GUI. 
  - Overall better battle mechanics. 
  - Remember to push code at school to work at home.

---

## Author Info
**Author**: Brad nguyen 
**What I Learned**:
- How to design a game from scratch with complicated features. 

---
