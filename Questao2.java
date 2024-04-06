import java.util.Scanner;
public class Questao2
{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int i = 1;
        
        System.out.println("Escreva um numero inteiro");
        int n1 = ler.nextInt();
        System.out.println("Tabuada");
        while(i<=10){
            int resultado = n1*i;
            System.out.println(n1+"x"+i+":"+resultado);
            i++;
        }
    }
}

