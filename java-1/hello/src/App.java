import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numberUser = scanner.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(numberUser + " x " + i + " = " + numberUser * i);
        }
        
        

    }
}
