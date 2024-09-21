import java.util.Scanner;

public class JavaProgramming {
    public static void main(String[] args) {

        //Creating a Scanner holder to hold values for RemoteStudents
        Scanner KB = new Scanner(System.in);
        //Polymorphism of a RemoteStudents object
        RemoteStudents S1 = new RemoteStudents(3245,"Jane", "Remote", 95.7);
        //RemoteStudents discussion score
        System.out.println("Enter Discussion score (for Remote Students): ");
        double discussionScore1 = KB.nextDouble();
        S1.setDiscussion(discussionScore1);
        //RemoteStudents midterm score
        System.out.println("Enter Midterm score: ");
        double midterm1 = KB.nextDouble();
        S1.setMidterm(midterm1);
        //RemoteStudents finals score
        System.out.println("Enter Finals score: ");
        double fin1 = KB.nextDouble();
        S1.setFinals(fin1);
        //RemoteStudents Assignment score
        System.out.println("Enter Assignments score: ");
        double assignments1 = KB.nextDouble();
        S1.setAssign(assignments1);

        System.out.println(S1.toString());


        //Polymorphism of a InPersonStudents object
        InPersonStudents S2 = new InPersonStudents(2872, "John", "In-person");
        //Print a new line
        System.out.println(" ");

        //InPersonStudent midterm score
        System.out.println("Enter Midterm score for InPerson Student: ");
        double midterm2= KB.nextDouble();
        S2.setMidterm(midterm2);
        //InPersonStudent final score
        System.out.println("Enter Finals score for InPerson Student: ");
        double fin2 = KB.nextDouble();
        S2.setFinals(fin2);
        //InpersonStudent assignments score
        System.out.println("Enter Assignments score for InPerson Student: ");
        double assignments2 = KB.nextDouble();
        S2.setAssign(assignments2);

        System.out.println(S2.toString());
        KB.close();

    }
}