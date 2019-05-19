package _01_intro_to_static;

import java.util.ArrayList;
import java.util.List;

public class Athlete {
	 static int nextBibNumber;
     static String raceLocation = "New York";
     static String raceStartTime = "9.00am";

     String name;
     int speed;
     int bibNumber;

     Athlete (String name, int speed){
	     this.name = name;
	     this.speed = speed;
	     bibNumber = nextBibNumber;
	     nextBibNumber++;
     }

	public static void main(String[] args) {
     //create two athletes      //print their names, bibNumbers, and the location of their race. }
		Athlete bolt = new Athlete("Bolt", 20);
		Athlete silver = new Athlete("Silver", 19);
		List<Athlete> athlete = new ArrayList<>();
		athlete.add(bolt);
		athlete.add(silver);
		for(Athlete st: athlete) {
			System.out.println(st.name);
			System.out.println(st.bibNumber);
			System.out.println(st.raceLocation);
		}
		
	}
}
