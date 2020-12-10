public class Tarefa0301 {

    public static void main(String[] args)
    {
        int i;
        Double[] argsDouble = {0.0, 0.0, 0.0, 0.0, 0.0};
        for (i = 0; i < args.length; i++)
        {
            argsDouble[i] = Double.parseDouble(args[i]);
        }
        Double[] k = {argsDouble[0], argsDouble[1], argsDouble[2], argsDouble[3], argsDouble[4]};
        String[] a = ((conj(k)));
        System.out.print("Conjunto: ");
        for (i = 0; i < k.length; i++)
        {
            System.out.print(a[i]);
        }
        System.out.println("");
        System.out.print("Média: ");
        System.out.println(media(k));
        System.out.print("Maior valor: ");
        System.out.println(maior(k));
        System.out.print("Menor valor: ");
        System.out.println(menor(k));
    }

    static String[] conj(Double[] x)
    {
        int i;
        String[] str = new String[x.length];
        for(i = 0; i < x.length; i ++)
        {
            if(i < x.length - 1){
                str[i] = x[i].toString() + ", ";
            } else{
                str[i] = x[i].toString();
            }
        }
        return str;
    }


    static double media(Double[] x)
    {
        int i;
        double soma = 0.0;
        for(i = 0; i < x.length; i ++)
        {
            soma = soma + x[i];
        }
        return soma / x.length;
    }

    static double maior(Double[] x)
    {
        int i;
        double maior = 0;
        for(i = 0; i < x.length; i ++)
        {
            if (i == 0)
            {
                maior = x[i];
            } else
                {
                    if (x[i] > maior)
                    {
                        maior = x[i];
                    }
                }
        }
        return maior;
    }

    static double menor(Double[] x)
    {
        int i;
        double menor = 0;
        for(i = 0; i < x.length; i ++)
        {
            if (i == 0)
            {
                menor = x[i];
            } else
            {
                if (x[i] < menor)
                {
                    menor = x[i];
                }
            }
        }
        return menor;
    }
}
