import java.util.Scanner;

public class Tarefa0201 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a operação você deseja realizar? ");
        String operation = scanner.nextLine();
        System.out.println("Entre com o primeiro número: ");
        float x = scanner.nextFloat();
        System.out.println("Entre com o segundo número: ");
        float y = scanner.nextFloat();
        if(operation.equals("soma"))
        {
            sum(x, y);
        }else if(operation.equals("subtração"))
        {
            sub(x, y);
        }else if (operation.equals("multiplicação"))
        {
            mult(x, y);
        }else if (operation.equals("divisão"))
        {
            div(x, y);
        }else
        {
            System.out.println("Opção Inválida.");
        }
    }

    static void sum(float x, float y)
    {
        System.out.println("O resultado da soma é:\n" + (x + y));
    }
    static void sub(float x, float y)
    {
        System.out.println("O resultado da subtração é:\n" + (x - y));
    }
    static void mult(float x, float y)
    {
        System.out.println("O resultado da multiplicação é:\n" + (x * y));
    }
    static void div(float x, float y)
    {
        System.out.println("O resultado da divisão é:\n" + (x / y));
    }
}
