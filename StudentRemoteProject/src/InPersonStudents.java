public class InPersonStudents extends Students {
    private double Midterm, Fin, Assignments;
    private double weightedScore;

    //Constructor for RemoteStudents class and
    //the use from parent class Students
    public InPersonStudents(int studentID, String name, String type) {
        super(studentID, name, type);
    }

    //Implementation of the abstract method score() from Students class
    public double score(){
        weightedScore = (this.getMidterm() * 0.3) +
                (this.getFinals() *0.3) +
                (this.getAssignments() * 0.4);
        return weightedScore;
    }

    //Accessor and Mutators methods for all data points

    public void setMidterm(double midterm) {
        this.Midterm = midterm;
    }

    public double getMidterm() {
        return Midterm;
    }

    public void setFinals(double fin) {
        this.Fin = fin;
    }

    public double getFinals() {
        return Fin;
    }

    public void setAssign(double assignments) {
        this.Assignments = assignments;
    }

    public double getAssignments() {
        return Assignments;
    }

    //the toString method to disply the details of a student
    public String toString(){
        return super.toString()+
                "\nMidterm - " + getMidterm() +
                "\nFinals - " + getFinals() +
                "\nAssginments - " + getAssignments() +
                "\nThe weighted score for " + name + " is: " + score();
    }
}

