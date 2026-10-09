import java.util.Scanner;
public class PerfilEstudante {
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);
        System.out.print("Nome do Estudante: ");
        String nome= ler.nextLine();

        System.out.print("Idade do Estudante: ");
        int idade= ler.nextInt();

        System.out.print("Altura do Estudante: ");
        float altura= ler.nextFloat();

        System.out.print("Estudante Participante: ");
        boolean participante= ler.nextBoolean();

        System.out.println("Perfil Estudante: ");
        System.out.println("Nome do Estudante: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Altura: "+ altura);
        System.out.println("Participante: "+ participante);
    }
}
