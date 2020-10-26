package ba.unsa.rpr.tutorijal1;
import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n){
        int suma = 0;
        while(true){
            suma = suma + n % 10;
            n = n / 10;
            if(n == 0)break;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Unesite broj n: ");
        Scanner unos = new Scanner(System.in);
        int n = unos.nextInt();
        System.out.println("Brojevi koji su djeljivi sa svojom sumom cifara su:");
        for(int i = 1;i <= n;i++)
            if(i % sumaCifara(i) == 0) System.out.println(i);
    }
}
