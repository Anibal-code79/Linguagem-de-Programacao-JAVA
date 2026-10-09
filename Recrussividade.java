public class Recrussividade {
    public static void conta(int n){
        if(n==0){
            return;
        }
        System.out.println();
        conta(n-1);
    }
    public static void main(String[] args) {
        System.out.println(conta(10));
    }
}
