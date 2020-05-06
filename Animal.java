public abstract class Animal {
    //TODO: declare position as an int.
    
    private int position;
    //TODO: declare pattern as an array of int
    
    int[] movePattern = new int[];
    //TODO: declare markId as a char
    
    private char markId;
    //TODO: declare name as a string.
	
    private String name; 
    //TODO: default constructor.
    public Animal() {
        int position;
        int[] movePattern;
        char markId;
        String name;
    }
	

    //TODO: The non-default constructor is to initialize data members.
    //It cannot be used to instantiate an object from Animal,
    //since Animal is declared as abstract.
	public Animal(int position, int[] movePattern, 
			String name, char markId) {
		setPosition(position); //this.position = position;
		setMovePattern(movePattern);
		setName(name);
		setMarkId(markId);
	}
	
	//TODO: Move the animal according to movePattern.
	public void move() {
	    int index = (int)(Math.random() * movePattern.length);
	    int stepsMoved = movePattern[index];
		position += stepsMoved;
        
	}
	
	//TODO: Return the current position of the animal
	public int getPosition() {
		return position;
	}
	
	//TODO: Return markId of the animal
	public char getMarkId() {
		return markId;	
	}
	
	//TODO: Return the name of the animal
	public String getName() {
		return name;
	}
	
	//TODO: Change the position of racing animal to
	//given parameter position.
	//Change the method to be protected so that only subclasses 
	//or classes in the same package can call it.
	//This is because this method takes whatever given parameter as data member,
	//we need to make sure that caller is aware of the direct assignment
	//without checking for possible invalid parameters.
	protected void setPosition(int position) {
		this.position = position;
		//position = i; //this is wrong. We do not change give parameter position,
		//and i is not declared and defined.
	}
	
    //TODO: use given parameter movePattern to set
    //data member movePattern.
	public void setMovePattern(int[] movePattern) {
		this.movePattern = movePattern.clone();
	}
	
	//TODO: set up the mark id for an animal
	public void setMarkId(char markId) {
		this.markId = markId;
	}
	
	//TODO: set up name for an animal
	public void setName(String name) {
		this.name = name;	
	}
	
	public abstract void showExcitement();
		
}

