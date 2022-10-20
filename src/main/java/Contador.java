import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        System.out.println("Contador");
        Scanner terminal = new Scanner(System.in);
        try {
            System.out.println("Digite valor inicial: ");
            int param1 = terminal.nextInt();
            System.out.println("Digite valor final: ");
            int param2 = terminal.nextInt();

//        System.out.println(param1);
//        System.out.println(param2);


            contar(param1,param2);
        }catch (ParametrosInvalidos parametrosInvalidos){
            System.out.println("ERRO - Favor informar valor inicial menor que valor final");
        } catch (InputMismatchException e){
            System.out.println("ERRO - Favor informar valores inteiros");
        }

    }

    static void contar(int param1, int param2) throws ParametrosInvalidos {
        if (param1 >= param2){
            ParametrosInvalidos parametrosInvalidos = new ParametrosInvalidos();
            throw parametrosInvalidos;
        }
        int contagem = param2 - param1;
        for (int i = 1; i <= contagem;i++){
            System.out.println(i);

        }


    }
}
