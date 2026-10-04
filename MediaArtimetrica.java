import java.util.Scanner;
public class MediaArtimetrica {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double numero1= ler.nextDouble();
        System.out.print("Digite a primeira nota: ");
        double numero2= ler.nextDouble();
        System.out.print("Digite a primeira nota: ");
        double numero3= ler.nextDouble();

        double media= (numero1+numero2+numero3)/3;
        if(media>=10){
            System.out.println("Aluno aprovado com: " + media + "Valores");
        } else{
            System.out.println("Aluno Reprovado por ser muito burro");
        }
        
    }

    
}
