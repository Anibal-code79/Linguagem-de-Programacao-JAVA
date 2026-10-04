import java.util.Scanner;
public class Algoritmo{
    public static String verNumeroPar(double numero){
        if(numero%2==0){
            return "Numero par";
        } else{
            return "Numero Impar";
        }
    }
    public static void main(String[] args) {
    System.out.println(verNumeroPar(40));
}
}