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
        System.out.println("For Square         use ' sqr ' ");
        System.out.println("For Cube           use ' cub ' ");
        System.out.println("For Percentage     use ' per ' ");

        operator = sc.nextLine();
        
        if(operator=="add"||operator=="sub"||operator=="mul"||operator=="div") {
            
        }

        switch (operator){

            case "add": 
            System.out.println("Enter your 1st number => ");
            num1 = sc.nextInt();
            System.out.println("Enter your 2nd number => ");
            num2 = sc.nextInt();
                result = num1 + num2 ;
                System.out.println(num1+" + "+num2+" = "+result);
                break;
            
            case "sub": 
            System.out.println("Enter your 1st number => ");
            num1 = sc.nextInt();
            System.out.println("Enter your 2nd number => ");
            num2 = sc.nextInt();
            result = num1 - num2;
                System.out.println(num1+" - "+num2+" = "+result);
                break;

            case "mul": 
            System.out.println("Enter your 1st number => ");
            num1 = sc.nextInt();
            System.out.println("Enter your 2nd number => ");
            num2 = sc.nextInt();
            result = num1 * num2;
                System.out.println(num1+" * "+num2+" = "+result);
                break;
            
            case "div": 
            System.out.println("Enter your 1st number => ");
            num1 = sc.nextInt();
            System.out.println("Enter your 2nd number => ");
            num2 = sc.nextInt();
            result = num1 / num2;
                System.out.println(num1+" / "+num2+" = "+result);
                break;
            
            case "per": 
            System.out.println("Enter Obatined total => ");
            num1 = sc.nextInt();
            System.out.println("Enter Actual total => ");
            num2 = sc.nextInt();
                result = (num1 / num2) * 100;
                System.out.println(num1+" % "+num2+" = "+result+ "% ");
                break;

            case "cub": 
                System.out.println("Enter the number => ");
                num1 = sc.nextInt();
                result = (num1 / num1) * 100;
                System.out.println(num1+" % "+num1+" = "+result+ "% ");
                break;

            case "sqr": 
                System.out.println("Enter the number => ");
                num1 = sc.nextInt();
                result = (num1 / num1) * 100;
                System.out.println(num1+" % "+num1+" = "+result+ "% ");
                break;


            default:
                System.out.println("Please enter valid Operator");
        }sc.close();
        System.out.println("thank you for using our calculator");
    }
    
    
}