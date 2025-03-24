import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("| CALCULATOR APP |");
        System.out.println("------------------");
        System.out.println();
        System.out.println("+===========================+");
        System.out.println("Menu");
        System.out.println("A -> Addition");
        System.out.println("S -> Subtraction");
        System.out.println("M -> Multiplication");
        System.out.println("D -> Division");
        System.out.println("R -> Modulus");
        System.out.println("E -> to quit");
        System.out.println("+===========================+");
        System.out.println();
        while(true){
            System.out.println("choose one operation from above menu :)");
            char input = in.next().toUpperCase().charAt(0);
            switch (input) {
                case 'A':
                    System.out.print("Enter total numbers to add : ");
                    int n = in.nextInt();
                    int sum = 0;
                    for(int i = 1; i <= n; i++){
                        System.out.print(i + " : ");
                        sum += in.nextInt();
                    }
                    System.out.println("Result : " + sum);
                    System.out.println();
                    break;
                case 'S':
                    System.out.println("Enter Two numbers to Subtract");
                    System.out.print("First : ");
                    int first = in.nextInt();
                    System.out.print("Second : ");
                    int second = in.nextInt();
                    System.out.println("Result : " + (first-second));
                    System.out.println();
                    break;
                case 'M':
                    System.out.print("Enter total numbers to Multipy : ");
                    int l = in.nextInt();
                    int multiply = 1;
                    for(int i = 1; i <= l; i++){
                        System.out.print(i + " : ");
                        multiply *= in.nextInt();
                    }
                    System.out.println("Result : " + multiply);
                    System.out.println();
                    break;
                case 'D':
                    System.out.println("Enter Two numbers to Divide");
                    System.out.print("First : ");
                    int a = in.nextInt();
                    System.out.print("Second : ");
                    int b = in.nextInt(); 
                    if(b == 0){
                        System.out.println("Division by Zero is not allowed!");
                    }else{
                        System.out.println("Result : " + a/b);
                    }                  
                    System.out.println();
                    break;
                case 'R':
                    System.out.println("Enter Two numbers to Modulo");
                    System.out.print("First : ");
                    int num1 = in.nextInt();
                    System.out.print("Second : ");
                    int num2 = in.nextInt();
                    if(num2 == 0){
                        System.out.println("Modulo by zero is not allowed!");
                    }else{
                        System.out.println("Result : " + (num1%num2));
                    }
                    System.out.println();
                    break;
                case 'E':
                    in.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter A, S, M, D, or E.");
                    System.out.println();
            }

        }
    }
}
