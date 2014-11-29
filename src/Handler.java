/**
 * @author Lauren Moore
 * @version 1.0
 * Project 4
 * Handler class for Project 4
 */
public class Handler {
    
    private String url;
    private String server = "";
    private String characterName = "";
    private String race = "";
    private String characterClass = "";
    private boolean gender = false;
    private int level;
    private int achievementPoints;
    private String guildName = "";
    private String battlegroup = "";
    private int kills;
    
    /**
     * Constructor method.
     */
    public Handler() {
    }
    
    /**
     * Generates the URL based on the inputted server and character name.
     * @param server The server to search.
     * @param character The character name to search for.
     * @return Returns the full URL.
     */
    public String setUrl(String server, String character) {
        url = "http://us.battle.net/api/wow/character/" + server + "/" + character + "?fields=guild";
        
        return url;
    }
    
    /**
     * Gets the URL to search/
     * @return Returns the URL.
     */
    public String getUrl() {
        return url;
    }
    
    /**
     * Sets the server.
     * @param toSet The String to set server to.
     * @return Returns the server.
     */
    public String setServer(String toSet) {
        server = toSet;
        
        return server;
    }
    
    /**
     * Gets the server.
     * @return Returns the server.
     */
    public String getServer() {
        return server;
    }
    
    /**
     * Sets the character name.
     * @param toSet String to set the character name to.
     * @return Returns the character name.
     */
    public String setCharacterName(String toSet) {
        characterName = toSet;
        
        return characterName;
    }
    
    /**
     * Gets the character name.
     * @return Returns the character name.
     */
    public String getCharacterName() {
        return characterName;
    }
    
    /**
     * Sets the race as a String via the integer representation of race given by the API.
     * @param toSet The integer representation of the race.
     * @return Returns the String representation of the race.
     */
    public String setRace(int toSet) {
        switch (toSet) {
            case 1:
                race = "Human";
                break;
            case 2:
                race = "Orc";
                break;
            case 3:
                race = "Dwarf";
                break;
            case 4:
                race = "Night Elf";
                break;
            case 5:
                race = "Undead";
                break;
            case 6:
                race = "Tauren";
                break;
            case 7:
                race = "Gnome";
                break;
            case 8:
                race = "Troll";
                break;
            case 9:
                race = " Goblin";
                break;
            case 10:
                race = "Blood Elf";
                break;
            case 11:
                race = "Draenei";
                break;
            case 22:
                race = "Worgen";
                break;
            case 24:
                race = "Pandaren";
                break;
            case 25:
                race = "Pandaren - Alliance";
                break;
            case 26:
                race = "Pandaren - Horde";
                break;
        }
        
        return race;
    }
    
    /**
     * Gets the String representation of the race.
     * @return Returns the String representation of the race.
     */
    public String getRace() {
        return race;
    }
    
    /**
     * Sets the class as a String via the integer representation of class given by the API.
     * @param toSet The integer representation of the class.
     * @return Returns the String representation of the class.
     */
    public String setCharacterClass(String toSet) {
        switch (toSet) {
            case "z":
            case "Z":
                characterClass = "Warrior";
                break;
            case "B":
            case "b":
                characterClass = "Paladin";
                break;
            case "y":
            case "Y":
                characterClass = "Hunter";
                break;
            case "C":
            case "c":
                characterClass = "Rogue";
                break;
            case "x":
            case "X":
                characterClass = "Priest";
                break;
            case "D":
            case "d":
                characterClass = "Death Knight";
                break;
            case "w":
            case "W":
                characterClass = "Shaman";
                break;
            case "E":
            case "e":
                characterClass = "Mage";
                break;
            case "v":
            case "V":
                characterClass = "Warlock";
                break;
            case "F":
            case "f":
                characterClass = "Monk";
                break;
            case "u":
            case "U":
                characterClass = "Druid";
                break;
        }
        
        return characterClass;
    }
    
    /**
     * Gets the String representation of the class.
     * @return Returns the String representation of the class.
     */
    public String getCharacterClass() {
        return characterClass;
    }
    
    /**
     * Represents the gender of the character as a boolean based off of the integer representation of gender given by the API.
     * @param toSet The integer representation of gender given by the API.
     * @return Returns the boolean representation of gender.
     */
    public boolean setGender(int toSet) {
        switch (toSet) {
            case 0:
                gender = false;
                break;
            case 1:
                gender = true;
                break;
        }
        
        return gender;
    }
    
    /**
     * Gets the boolean representation of gender.
     * @return Returns the boolean representation of gender.
     */
    public boolean getGender() {
        return gender;
    }
    
    /**
     * Sets the level.
     * @param toSet The integer to set the level to.
     * @return Returns the level.
     */
    public int setLevel(int toSet) {
        level = toSet;
        
        return level;
    }
    
    /**
     * Gets the level.
     * @return Returns the level.
     */
    public int getLevel() {
        return level;
    }
    
    /**
     * Sets the number of Achievement Points.
     * @param toSet The integer to set the Achievement Points to.
     * @return Returns the number of Achievement Points.
     */
    public int setAchievementPoints(int toSet) {
        achievementPoints = toSet;
        
        return achievementPoints;
    }
    
    /**
     * Gets the number of Achievement Points.
     * @return Returns the number of Achievement Points.
     */
    public int getAchievementPoints() {
        return achievementPoints;
    }
    
    /**
     * Sets the guild name.
     * @param toSet The String to set the guild name to.
     * @return Returns the guild name.
     */
    public String setGuildName(String toSet) {
        guildName = toSet;
        
        return guildName;
    }
    
    /**
     * Gets the guild name.
     * @return Returns the guild name.
     */
    public String getGuildName() {
        return guildName;
    }
    
    /**
     * Sets the name of the Battlegroup.
     * @param toSet The String to set the Battlegroup to.
     * @return Returns the Battlegroup.
     */
    public String setBattlegroup(String toSet) {
        battlegroup = toSet;
        
        return battlegroup;
    }
    
    /**
     * Gets the Battlegroup.
     * @return Returns the Battlegroup.
     */
    public String getBattlegroup() {
        return battlegroup;
    }
    
    /**
     * Sets the number of lifetime honorable kills.
     * @param toSet The integer to set kills to.
     * @return Returns the number of lifetime honorable kills.
     */
    public int setKills(int toSet) {
        kills = toSet;
        
        return kills;
    }
    
    /**
     * Gets the number of lifetime honorable kills.
     * @return Returns the number of lifetime honorable kills.
     */
    public int getKills() {
        return kills;
    }
}
