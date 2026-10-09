
public class Pessoa {
    String nome;
    int idade;
    String cidade;

public Pessoa(String nome, int idade, String cidade){
    this.nome=nome;
    this.idade=idade;
    this.cidade=cidade;
}
  @Override 
public String toString(){
    return "Nome: " + nome +
            " Idade: "+ idade +
            " Cidade: "+ cidade;
} 
public static void main(String[] args){
    Pessoa pessoa1= new Pessoa("Anibal Mutevui", 19,"Maputo");
    Pessoa pessoa2= new Pessoa("Vasco Massingue", 20,"Gaza");
    Pessoa pessoa3= new Pessoa("Miena Maldjw", 16,"Inhambane");
    System.out.println(pessoa1);
    System.out.println(pessoa2);
    System.out.println(pessoa3);
}
}


