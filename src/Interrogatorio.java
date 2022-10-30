import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interrogatorio {

    public static void main(String[] args) {
        try (Scanner resposta = new Scanner(System.in)) {
        
        List<String> perguntas = new ArrayList<String>();
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalho com a vítima?");

        System.out.println("Nós iremos apresentar algumas perguntas para apurar o acontecido. Responda com 1, para Sim e 2, para não. Ok?");
        int s = 0;
        int varAux=0;
        System.out.println(perguntas.get(0));    
        varAux = resposta.nextInt();
            if(varAux == 1){
                s = s + 1;
                varAux = 0;
            }
        System.out.println(perguntas.get(1));    
        varAux = resposta.nextInt();
            if(varAux == 1){
                s = s + 1;
                varAux = 0;
                }
        System.out.println(perguntas.get(2));    
        varAux = resposta.nextInt();
            if(varAux == 1){
                s = s + 1;
                varAux = 0;
                }
        System.out.println(perguntas.get(3));    
        varAux = resposta.nextInt();
            if(varAux == 1){
                s = s + 1;
                varAux = 0;
                }
        System.out.println(perguntas.get(4));    
        varAux = resposta.nextInt();
            if(varAux == 1){
                s = s + 1;
                varAux = 0;
        }
        
        if(s==2){
            System.out.println("Você é SUSPEITO(a)");}
        else
            if(s<=4){
                System.out.println("Você é CÚMPLICE");}
            else
                if(s==5){
                    System.out.println("Você é CULPADO(a)");}
                
            
        
        }
    }
}
