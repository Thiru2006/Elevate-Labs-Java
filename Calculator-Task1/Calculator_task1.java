import java.util.Scanner;
public class Calculator_task1{
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        String a = "y";
        while(a.equalsIgnoreCase("y")){
            int choice;
            double num1,num2,result=0;
            System.out.print("\nCalculator\n\nChoose an Operation to perform\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n\nEnter your choice: ");
            choice = ss.nextInt();
            if (choice>0 && choice<5){
                System.out.print("Enter first number: ");
                num1 = ss.nextDouble();
                System.out.print("Enter second number: ");
                num2 = ss.nextDouble();
                if (choice==1){
                    result=num1+num2;
                    System.out.println("Answer is:"+result);
                }
                else if(choice==2){
                    result=num1-num2;
                    System.out.println("Answer is:"+result);
                }
                else if(choice==3){
                    result=num1*num2;
                    System.out.println("Answer is:"+result);
                }
                else{
                    if (num2!=0){
                        result=num1/num2;
                        System.out.println("Answer is:"+result);
                    }
                    else{
                        System.out.println("Answer is not defined.");
                    }
                }
                System.out.print("Do you want to continue (y/n)?: ");
                a = ss.next();
            }
            else{
                System.out.println("Invalid Input");
            }
            
        }       
    }
}