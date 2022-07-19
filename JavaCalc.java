import java.util.Scanner;

class JavaCalc{
    public static void main(String[] args) {
        String operator;
        double num1;
        double num2;
        double result;

        Scanner sc = new Scanner(System.in);

        System.out.println("What kind of Calculation would you like to perform => ");
        System.out.println("Choose from below options.");
        System.out.println("For Addition       use ' add ' ");
        System.out.println("For Subtraction    use ' sub ' ");
        System.out.println("For Multiplication use ' mul ' ");
        System.out.println("For Division       use ' div ' ");
        System.out.println("For Percentage     use ' per ' ");

        operator = sc.nextLine();
        
        if(!(operator == "per")){
            System.out.println("Enter Obatined total => ");
            num1 = sc.nextInt();
            System.out.println("Enter Actual total => ");
            num2 = sc.nextInt();

        }else{
            System.out.println("Enter your 1st number => ");
            num1 = sc.nextInt();
            System.out.println("Enter your 2nd number => ");
            num2 = sc.nextInt();
        }

        switch (operator){

            case "add": result = num1 + num2 ;
                System.out.println(num1+" + "+num2+" = "+result);
                break;
            
            case "sub": result = num1 - num2;
                System.out.println(num1+" - "+num2+" = "+result);
                break;

            case "mul": result = num1 * num2;
                System.out.println(num1+" * "+num2+" = "+result);
                break;
            
            case "div": result = num1 / num2;
                System.out.println(num1+" / "+num2+" = "+result);
                break;
            
            case "per": result = (num1 / num2) * 100;
                System.out.println(num1+" % "+num2+" = "+result+ "% ");
                break;


            default:
                System.out.println("Please enter valid Operator");
        }sc.close();
        System.out.println("thank you for using our calculator");
    }
    
}