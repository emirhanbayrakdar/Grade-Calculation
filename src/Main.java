import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, tur, kim, muz;
        Scanner scanner = new Scanner(System.in);


        System.out.print("Matematik Notunuz : ");
        mat = scanner.nextInt();
        if(mat<0 || mat>100){
            System.out.print("Geçersiz not girdiniz");
            return;
        }

        System.out.print("Fizik Notunuz : ");
        fiz = scanner.nextInt();
        if(fiz<0 || fiz>100){
            System.out.print("Geçersiz not girdiniz");
            return;
        }

        System.out.print("Türkçe Notunuz : ");
        tur = scanner.nextInt();
        if(tur<0 || tur>100){
            System.out.print("Geçersiz not girdiniz");
            return;
        }

        System.out.print("Kimya Notunuz : ");
        kim = scanner.nextInt();
        if(kim<0 || kim>100){
            System.out.print("Geçersiz not girdiniz");
            return;
        }

        System.out.print("Müzik Notunuz : ");
        muz = scanner.nextInt();
        if(muz<0 || muz>100){
            System.out.print("Geçersiz not girdiniz");
            return;
        }

        double average = (mat + fiz + kim + muz + tur) / 5;

        if (average <= 55) {
            System.out.println("Sınıfta kaldınız. Tekrar görüşmek üzere.");
        } else {
            System.out.println("Dersi başarıyla geçtiniz");
        }

        System.out.println("Ortalamanız : " + average);

    }
}
