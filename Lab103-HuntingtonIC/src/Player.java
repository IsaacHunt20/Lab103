/**
 * A simple player class
 * @author isaac huntington
 * @version 20230206
 */
public class Player 
{
    private String name;
    private String positionPlayed;
    private int jerseyNumber;
    
    /**
     *
     * @param name
     * @param position
     * @param number
     */
    public Player(String name, String position, int number)
    {
        this.name = name;
        this.positionPlayed = position;
        this.jerseyNumber = number;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the positionPlayed
     */
    public String getPositionPlayed() {
        return positionPlayed;
    }

    /**
     * @return the jerseyNumber
     */
    public int getJerseyNumber() {
        return jerseyNumber;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param positionPlayed the positionPlayed to set
     */
    public void setPositionPlayed(String positionPlayed) {
        this.positionPlayed = positionPlayed;
    }

    /**
     * @param jerseyNumber the jerseyNumber to set
     */
    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
    
    /**
     *
     * @param o
     * @return
     */
    public boolean equals(Object o)
    {
        if ( !( o instanceof Player ) )
            return false;
        Player p = ( Player ) o;
        
        return name.equals( p.name )
            && positionPlayed.equals(p.getPositionPlayed())
            && jerseyNumber == p.getJerseyNumber();
    }
    
    /**
     *
     * @return the instances in a string
     */
    public String toString(){
        return getClass().getName() + "@" + name + ":" + positionPlayed + ":" + 
                jerseyNumber;
    }
    
}
