import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
public class Main{
    public static void main(String[] args) {
        String a = "y";
        Scanner ss = new Scanner(System.in);
        while(a.equalsIgnoreCase("y")){        
            try{

                String fname,data;
                System.out.println("Operations Possible: \n1. Write in file. \n2. Read through a file. \n3. Append data to a file.\n4. Buffered Read. \n5. Buffered Write. \n6. Buffered Append");
                System.out.print("Enter Your Choice: ");
                int choice = ss.nextInt();
                ss.nextLine();
                if (choice==1){
                    System.out.print("Enter the name of the file with extension to Write in it: ");
                    fname = ss.nextLine();
                    FileWriter fw = new FileWriter(fname);
                    System.out.print("Enter the data which need to be written in the file: ");
                    data = ss.nextLine();
                    fw.write(data);
                    fw.close();
                    System.out.println("Data Written in the file successfully!");
                }
                else if(choice==2){
                    System.out.print("Enter the name of the file with extension to Read in it: ");
                    fname = ss.nextLine();
                    FileReader fr = new FileReader(fname);
                    int c = fr.read();
                    System.out.println("The Data present in the file is: \n");
                    while(c!=-1){
                        System.out.print((char)c);
                        c = fr.read();
                    }
                    System.out.println();
                    fr.close();
                }
                else if(choice==3){
                    System.out.print("Enter the name of the file with extension to Append in it: ");
                    fname = ss.nextLine();
                    FileWriter fw = new FileWriter(fname,true);
                    System.out.print("Enter the data which need to be appended in the file: ");
                    data = ss.nextLine();
                    fw.append(data);
                    fw.close();
                    System.out.println("Data Appended in the file successfully!");
                }
                else if(choice==4){
                    System.out.print("Enter the name of the file with extension to Read in it: ");
                    fname = ss.nextLine();
                    FileReader fr = new FileReader(fname);
                    BufferedReader br = new BufferedReader(fr);
                    String line = br.readLine();
                    System.out.println("The Data present in the file is: \n");
                    while(line != null){
                        System.out.println(line);
                        line = br.readLine();
                    }
                    System.out.println();
                }
                else if(choice==5){
                    System.out.print("Enter the name of the file with extension to write in it using BufferedWriter: ");
                    fname = ss.nextLine();
                    FileWriter fw = new FileWriter(fname);
                    BufferedWriter bw = new BufferedWriter(fw);
                    System.out.print("Enter the data which need to be written in the file: ");
                    data = ss.nextLine();
                    bw.write(data);
                    bw.close();
                    System.out.println("Data Written in the file successfully!");
                }
                else if(choice==6){
                    System.out.print("Enter the name of the file with extension to Append in it using BufferedWriter: ");
                    fname = ss.nextLine();
                    FileWriter fw = new FileWriter(fname,true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    System.out.print("Enter the data which need to be appended in the file: ");
                    data = ss.nextLine();
                    bw.write(data);
                    bw.close();
                    System.out.println("Data Appended in the file successfully!");
                }
                else{
                    System.out.println("Invalid Input, try again !");
                }
                if (choice>0 && choice<=6){
                    System.out.print("Do you want to continue (y/n)?: ");
                    a = ss.next();
                }
                else{
                    a = "y";
                }
            }catch(Exception e){
                System.out.println("Some issue has happened!");
            }
        }
    }
}