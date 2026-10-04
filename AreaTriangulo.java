import java.util.Scanner;
public class AreaTriangulo {
    public  static void main(String[] args){
        Scanner ler= new Scanner(System.in);
        System.out.print("Digite a comprimento: ");
        int comprimento= ler.nextInt();
        System.out.print("Digite a largura: ");
        int largura= ler.nextInt();

        int area= (largura*comprimento);
        
        System.out.println("A area do retangulo dos teus dados e: "+ area);

    }
    
}
