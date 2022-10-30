import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MediaTemperatura {

    public static void main(String[] args) {
    try (Scanner anotar = new Scanner(System.in)) {
        List<Double> temperaturas = new ArrayList<Double>();
        System.out.println("Digite a temperatura média de Janeiro: ");
            temperaturas.add(anotar.nextDouble());
        System.out.println("Digite a temperatura média de Fevereiro: ");
            temperaturas.add(anotar.nextDouble());
        System.out.println("Digite a temperatura média de Março: ");
            temperaturas.add(anotar.nextDouble());
        System.out.println("Digite a temperatura média de Abril: ");
            temperaturas.add(anotar.nextDouble());
        System.out.println("Digite a temperatura média de Maio: ");
            temperaturas.add(anotar.nextDouble());
        System.out.println("Digite a temperatura média de Junho: ");
            temperaturas.add(anotar.nextDouble());
        
        System.out.println("Janeiro: " + temperaturas.get(0));
        System.out.println("Fevereiro: " + temperaturas.get(1));
        System.out.println("Março: " + temperaturas.get(2));
        System.out.println("Abril: " + temperaturas.get(3));
        System.out.println("Maio: " + temperaturas.get(4));
        System.out.println("Junho: " + temperaturas.get(5));

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A temperatura média do semestre é " + (soma/temperaturas.size()));
    }

    }

}