package eleven;

import java.util.ArrayList;

class GetActors {
	int i =0;
	ArrayList<String> actors = new ArrayList<String>();
	GetActors(){
		actors.add("Robert Downy");
		actors.add("Cap Am");
		actors.add("Hulk");
	}
	
	String next(){
		if(actors.size() > i)
			return actors.get(i++);
		else {
			i = 0;
			return actors.get(i);
		}
	}
}

public class Actors {
	public static void main(String[] args) {
		GetActors ga = new GetActors();
		System.out.println(ga.next() + ga.next() + ga.next() + ga.next());
	}
}
