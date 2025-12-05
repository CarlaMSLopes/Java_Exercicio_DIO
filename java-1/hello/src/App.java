import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite um número: ");
        int numberUser = scanner.nextInt();
        for(int i = 1; i <= 10; i++)
            {
                System.out.println(numberUser + " x " + i + " = " + numberUser * i);
            }
        
        System.out.println("Digite sua altura: ");
        float altura = scanner.nextFloat();
        System.out.println("Digite seu peso: ");
        float peso = scanner.nextFloat();
        float imc = peso / (altura * altura);

        if(imc <= 18.5)
            {
                System.out.println("Abaixo do Peso");
            }
        else if(imc >= 18.6 && imc <= 24.9)
            {
                System.out.println("Peso Ideal");
            }
        else if(imc >= 25 && imc <= 29.9)
            {
                System.out.println("Levemente acima do peso");
            }
        else if(imc >= 30 && imc <= 34.9)
            {
                System.out.println("Obesidade Grau I");
            }
        else if(imc >= 35 && imc <= 39.9)
            {
                System.out.println("Obesidade Grau II (Severa)");
            }    
        else 
            {
                System.out.println("Obesidade III (Mórbida)");
            }
            

        System.out.println("Digite um número:");
        int number1 = scanner.nextInt();
        System.out.println("Digite um segundo número que seja maior que o primeiro: ");
        int number2 = scanner.nextInt();        
            
        while (number2 < number1 || number2 == number1)
            {
                System.out.println("O segundo número que você digitou não é maior que o primeiro! Digite novamente o segundo, lembre-se tem que ser maior que o primeiro!");
                number2 = scanner.nextInt();
            }        
        
            System.out.println("Digite 0 - Par e 1 - Impar");
            int parOuImpar = scanner.nextInt();
            switch (parOuImpar) 
            {
                case 0:
                for(int i = number1 + 1; i < number2; i++ ){
                    number1++;
                    if (number1%2 == 0) {
                        System.out.println(number1);
                    }
                }                
                break;
                case 1:
                for(int i = number1 + 1; i < number2; i++ ){
                    number1++;
                    if (number1%2 != 0) {
                        System.out.println(number1);
                    }
                } 
                break;
                default:
                System.out.println("Digitou número errado, digite 0 ou 1");
                ;
                break;
            }

        System.out.println("Digite um número:");
        int number = scanner.nextInt();
        System.out.println("Digite outro número:");
        int numberTeste = scanner.nextInt();
        while (numberTeste < number || numberTeste%2 !=0) 
            {
                System.out.println("O segundo número que você digitou é menor que o primeiro que você digitou. Digite outro:");
               numberTeste = scanner.nextInt();
            }
        
            System.out.println("Esse número é divisor do " + number);
        
        scanner.close(); 
    }
}
        

        
    
    


