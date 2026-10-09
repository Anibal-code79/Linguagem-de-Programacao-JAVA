import java.util.Scanner;
public class Funcionario {
   private double salario=1500;
   private String nome;
   public Funcionario(String nome, double salario){
    this.nome= nome;
    this.salario= salario;
   }
   public void setaumentarSalario(int percentagem){
    salario += salario * (percentagem / 100);
   }
   public void getexibirSalario(){
    System.out.println("O teu salario: "+ salario);
    System.out.print("O teu nome: "+ nome);
   }
   public static void main(String[] args) {
    Funcionario funcionario1= new Funcionario("Anibal Mutevui", 50.000);
    funcionario1.setaumentarSalario(20);
    funcionario1.getexibirSalario();
   }

}
