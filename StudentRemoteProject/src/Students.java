//The parent class
public abstract class Students <T extends Number>{
    protected T studentID;
    protected String name, type;


    //Constructor: set up the Students class with id, name and type
    public Students(T ID, String n, String t){
        this.studentID = ID;
        this.name = n;
        this.type = t;
    }

    //Generic abstract method score()
    public abstract double score();

    //method to display students information
    public String toString(){
        return "\nName: "+ name +
                "\nID: " + studentID +
                "\nType: " + type;
    }

}
