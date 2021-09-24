import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido = true;

        do{
            System.out.print("Informe o salário:");
            Double salario = Double.parseDouble(sc.nextLine());
            if(salario <= 0){
                System.out.print("Salário inferior ou igual a zero! \n Digite novamente:");
                salario = Double.parseDouble(sc.nextLine());
            }
            else{
                valido = false;
                if (salario > 1997.58 && salario < 5399.99){
                    System.out.println("O salário é maior que R$ 1997,58");
               }
                else if(salario >= 5399.99){
                    System.out.println("O salário é maior que R$ 5399,99 ");
                }
            }
        }while(valido);

    }
}
