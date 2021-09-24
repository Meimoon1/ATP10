//Exercicio 1- Programa pra idade
import java.util.Scanner;
public class exercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a idade: ");
        byte idade = Byte.parseByte(sc.nextLine());

        if(idade>25){
            System.out.println("Idade superior a 25 anos");
        }
        else if(idade <25){
            System.out.println("Idade inferior a 25 anos");
        }
        else {
            System.out.println("Idade igual a 25 anos");
        }

    }

}