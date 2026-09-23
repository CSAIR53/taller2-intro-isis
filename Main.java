import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Por favor digite el salario");
        Scanner s = new Scanner(System.in);
        double salary = s.nextDouble();
        
        if (salary < 1000) {
            salary = salary + (salary * 0.45);
        }
        
        System.out.println("Su salario final es: " + salary);
        s.close();
    }
}