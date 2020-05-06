import java.util.ArrayList;

public class Competition {
    //a competition involves a road and an array of animals.
    
    //TODO: declare data member road, which is a Road object.
	roadLength obj = new roadLength;
    //TODO: declare data member animals, which is an array of Animal
	super(Animal[] animals);
	animals.add(Hare);
	animals.add(Bear);
	animals.add(Monkey);
	
    //TODO: write non-default constructor
	public Competition(Animal[] animals, int roadLength) {
		Animal[] animals = new Animal;
		roadLength = 70;
	}
	
	public void start() {
        //TODO: assign end line of road to endLine variable.
		int endLine = roadLength-1;
		
		//Declare a winner list
        //There can be a tie, where several animals win.
		ArrayList<Animal> winners = new ArrayList<Animal>();

	//	if (Animal.getPosition() == endLine && Animal.getPosition() == endLine)
	//		System.out.println("It's a tie");
		int timeStamp = 1;
        
        //As long as winners is not empty
        //begin
        //    for each animal in animals array
        //    begin
        //         move that animal
        //         if that animal's position too left or too right
        //            adjust it
        //         mark the road
        //
        //         if that animal reaches the end line
        //             add the animal to the winner list
        //     end
        //
        //     print the road with time stamp.
        //     clear the corresponding location of the road
        //     increase time stamp
        //end
        while (winners[] != ' '){
        	for (int i = 0; i < animals.length; i++){
        		Animal[i].move();
        		timestamp++;
        		if (Animal.getPosition() < 0)
        			Animal.setPosition(0);
        			else if  (Animal.getPosition() > roadLength)
        				Animal.setPosition(endLine);
        		Animal[i].setMarkId();
        		
        		if (Animal.getPosition() == roadLength-1)
        			winners.add(Animal.getName());
        	}
        	System.out.printf("%3d: %s\n", timeStamp, road);
			timeStamp = timeStamp + 1;
			clear(Road);
			
        }
		//TODO: print out each winner's name and its way of showing excitement.
        for (int i = 0; i < winners; i++)
        	System.out.println(Animal.getName());
        	Animal.showExcitement();
		
	}
}
