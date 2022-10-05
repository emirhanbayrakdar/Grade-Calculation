import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, tur, kim, muz;
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Matematik Notunuz : ");
        mat = scanner.nextInt();

        System.out.println("Fizik Notunuz : ");
        fiz = scanner.nextInt();

        System.out.println("Türkçe Notunuz : ");
        tur = scanner.nextInt();

        System.out.println("Kimya Notunuz : ");
        kim = scanner.nextInt();

        System.out.println("Müzik Notunuz : ");
        muz = scanner.nextInt();

        double average = (mat + fiz + kim + muz + tur) / 5;

        if (average <= 55) {
            System.out.println("Sınıfta kaldınız. Tekrar görüşmek üzere.");
        } else {
            System.out.println("Dersi başarıyla geçtiniz");
        }

        System.out.println("Ortalamanız : " + average);

    }
}