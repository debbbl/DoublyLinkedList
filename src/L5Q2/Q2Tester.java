package L5Q2;
import java.util.Scanner;
public class Q2Tester {
    public static void main(String[] args){
        List<String> list1=new List<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your student name list. Enter 'n' to end......");
        String studentName=sc.nextLine();
        while(!studentName.equals("n")){
            list1.add(studentName);
            studentName=sc.nextLine();
        }
        System.out.println("You have entered the following students' name: ");
        list1.printList();
        System.out.println("The number of students entered is: "+list1.getSize());
        System.out.println("All the name entered are correct? Enter 'r' to rename the student name, 'n' to proceed");
        String temp=sc.nextLine();
        while(true){
            System.out.println("Enter the existing student name that u want to rename: ");
            String oldname=sc.nextLine();
            System.out.println("Enter the new name: ");
            String newName=sc.nextLine();
            list1.replace(oldname,newName);
            temp=sc.nextLine();
            if(temp.equals("n"))
                break;
        }
        System.out.println("The new student list is: ");
        list1.printList();

        System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed");
        temp= sc.nextLine();
        while(true){
            System.out.println("Enter a student name to remove:");
            String remove= sc.nextLine();
            list1.removeElement(remove);
            temp=sc.nextLine();
            if(temp.equals("n"))
                break;
        }

        System.out.println("The number of updated student is "+list1.getSize());
        System.out.println("The updated student list is: ");
        list1.printList();
        System.out.println("All students data captured complete. Thank you!");

    }
}
