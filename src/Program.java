import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        double num = in.nextDouble();
        System.out.print("Input percent: ");
        int percent = in.nextInt();
        double result=num*percent/100;
        System.out.print("Number: "+num+";\n"+"Percent: "+ percent+";\n"+"Result: "+ result);
        in.close();

    }
}
