import java.util.Scanner;
import java.util.ArrayList;

class Student{
    int choice;
    ArrayList<Integer> ID;
    ArrayList<String> Name;
    ArrayList<Double> Marks;
    Student(int choice,ArrayList<Integer> ID,ArrayList<String> Name,ArrayList<Double> Marks){
        this.choice = choice;
        this.ID = ID;
        this.Name = Name;
        this.Marks = Marks;
        Scanner ss = new Scanner(System.in);
        if (choice==1){
            System.out.print("Enter student ID: ");
            ID.add(ss.nextInt());
            System.out.print("Enter student Name: ");
            ss.nextLine();
            Name.add(ss.nextLine());
            System.out.print("Enter student Marks: ");
            Marks.add(ss.nextDouble());
            System.out.println("Details added Successfully!");
        }
        else if(choice==2){
            int length = ID.size();
            if (length==0){
                System.out.println("No record is available!");
            }
            else{
                System.out.println("Records Available are: ");
                for(int i=0;i<length;i++){
                    System.out.println("Name: "+Name.get(i)+"\nID: "+ID.get(i)+"\nMarks: "+Marks.get(i)+"\n");
                }
            }
        }
        else if(choice==3){
            System.out.print("Enter the record ID which need to be UPDATED: ");
            int tempID = ss.nextInt();
            int ArrayIndex = ID.indexOf(tempID);
            if(ArrayIndex>=0 && ArrayIndex<=ID.size()){
                System.out.print("Enter the updated ID: ");
                int newID = ss.nextInt();
                System.out.print("Enter the updated Name: ");
                ss.nextLine();
                String newName = ss.nextLine();
                System.out.print("Enter the updated marks: ");
                double newMarks = ss.nextDouble();
                ID.set(ArrayIndex,newID);
                Name.set(ArrayIndex,newName);
                Marks.set(ArrayIndex,newMarks);
                System.out.println("Records details have been updated Sucessfully");
            }
            else{
                System.out.println("ID not Found!");
            }
        }
        else{
            System.out.print("Enter the record ID which need to be DELETED: ");
            int tempID = ss.nextInt();
            int ArrayIndex = ID.indexOf(tempID);
            if(ArrayIndex>=0 && ArrayIndex<=ID.size()){
                ID.remove(ArrayIndex);
                Name.remove(ArrayIndex);
                Marks.remove(ArrayIndex);
                System.out.println("Records have been Successfully deleted!");
            }
            else{
                System.out.println("ID not Found!");
            }
        }
    }
}

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> ID = new ArrayList<Integer>();
        ArrayList<String> Name = new ArrayList<String>();
        ArrayList<Double> Marks = new ArrayList<Double>();
        String a = "Y";
        while (a.equalsIgnoreCase("y")){
            Scanner ss = new Scanner(System.in);
            System.out.println("Choose an Option to Perform:");
            System.out.println("1. Add Details");
            System.out.println("2. View Records");
            System.out.println("3. Update Records");
            System.out.println("4. Delete Records");
            System.out.print("Enter your choice: ");
            int choice = ss.nextInt();
            if (choice>0 && choice<=4){
                Student obj = new Student(choice,ID,Name,Marks);
                ss.nextLine();
                System.out.print("Do you want to continue (y/n)?: ");
                a = ss.nextLine();
                System.out.println();
            }
            else{
                System.out.println("Invalid Input !");
                System.out.println();
            }
        }
    }
}