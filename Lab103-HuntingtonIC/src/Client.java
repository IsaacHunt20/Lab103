/**
 * A test class for the LinkedBag, ArrayBag, and SinglyLinkedList
 * @author isaac huntington
 * @version 20230206
 */
public class Client 
{
    public static void main(String[] args) 
    {
        //Create a new instance of an ArrayBag with Player type
        ArrayBag<Player> mensTeam = new ArrayBag<>(2);
        
        //Hard coded addition 
        mensTeam.add(new Player("Zach Mathis", "Wideout", 0));
        mensTeam.add(new Player("Courtney Eubanks", "Cornerback", 1));
        mensTeam.add(new Player("Kellen Entz", "Wideout", 2));
        mensTeam.add(new Player("Dawson Weber", "Safety", 2));
        mensTeam.add(new Player("Kobe Johnson", "Runningback", 4));
        mensTeam.add(new Player("Bryce Lane", "Wideout", 5));
        mensTeam.add(new Player("Destin Talbert", "Cornerback", 6));
        mensTeam.add(new Player("Cedric Wall", "Wideout", 6));
        
        //Output the list
        System.out.println(mensTeam.toString());
        //randomly remove an Object
        mensTeam.remove();
        //output
        System.out.println(mensTeam.toString());
        //get the 5th index 
        System.out.println("Player at index 5: " + mensTeam.get(5));
        //add new player 
        mensTeam.add(new Player("Cam Miller", "Quarterback", 7));
        //print the list  
        System.out.println(mensTeam.toString());
        //remove the fith element 
        mensTeam.remove(mensTeam.get(5));
        //Output again
        System.out.println(mensTeam.toString());
        
        //Using a different type of object
        ArrayBag<Course> courses = new ArrayBag<>(2);
        courses.add(new Course("CSCI 161"));
        courses.add(new Course("MUSC 108"));
        courses.add(new Course("ATHL 323"));
        courses.add(new Course("STAT 368"));
        courses.add(new Course("MAT 129"));
        courses.add(new Course("ENGR 321"));
        
        //print
        System.out.println(courses.toString());
        //randomly remove
        courses.remove();
        //print again
        System.out.println(courses.toString());
        
        //perform same actions with a LinkedBag instead of ArrayBag
        LinkedBag<Player> womensTeam = new LinkedBag<>(2);
        womensTeam.add(new Player("Abbie Draper", "Forward", 2));
        womensTeam.add(new Player("Leah Mackenzie", "Guard", 3));
        womensTeam.add(new Player("Georgia Baldwin", "Forward", 4));
        womensTeam.add(new Player("Marwa Bedziri", "Forward", 5));
        womensTeam.add(new Player("Abby Graham", "Guard", 10));
        womensTeam.add(new Player("Heaven Hamling", "Guard", 11));
        womensTeam.add(new Player("Rachel Novak", "Guard", 13));
        womensTeam.add(new Player("Taylor Brown", "Forward", 14));
        
        //Since they both implement the bag interface we only need to change the 
        //object reference but the mehtod calls remain the same as with the ArrayBag
        System.out.println(womensTeam.toString());
        womensTeam.remove();
        System.out.println(womensTeam.toString());
        System.out.println("Player at index 5: " + womensTeam.get(5));
        womensTeam.add(new Player("Cam Miller", "Quarterback", 7));
        System.out.println(womensTeam.toString());
        womensTeam.remove(womensTeam.get(5));
        System.out.println(womensTeam.toString());
        
 
        
        
    }
    
}
