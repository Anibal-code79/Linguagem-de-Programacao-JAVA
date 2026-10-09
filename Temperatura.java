import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);

        System.out.print("Digite a temperatura");
        int c= ler.nextInt();

        int F=(c* 9/5)+32;
        System.out.print("A temperatura em Faranheit e: " + F);

    } 
    
}
