import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat, fiz, tur, kim, muz, totalders = 0, total = 0;
        double ort=0;
        Scanner intscanner = new Scanner(System.in);


        System.out.print("Matematik Notunuzu giriniz: ");
        mat = intscanner.nextInt();
        System.out.print("Türkçe Notunuzu giriniz: ");
        tur = intscanner.nextInt();
        System.out.print("Fizik Notunuzu giriniz: ");
        fiz = intscanner.nextInt();
        System.out.print("Kimya Notunuzu giriniz: ");
        kim = intscanner.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muz = intscanner.nextInt();

        if (0 <= mat && mat <= 100) {
            totalders++;
            total = total + mat;
        }
        if (0 <= fiz && fiz <= 100) {
            totalders++;
            total = total + fiz;
        }
        if (0 <= kim && kim <= 100) {
            totalders++;
            total = total + kim;
        }
        if (0 <= tur && tur <= 100) {
            totalders++;
            total = total + tur;
        }
        if (0 <= muz && muz <= 100) {
            totalders++;
            total = total + muz;
        }
        if(totalders!=0){
        ort = total / totalders;}

        switch(totalders){
            case 1: System.out.println("4 değeri hatalı girdiniz.");
                    System.out.println("Doğru değerlere göre ortalamanız: "+ort);
                break;
            case 2: System.out.println("3 değeri hatalı girdiniz.");
                    System.out.println("Doğru değerlere göre ortalamanız: "+ort);
                break;
            case 3: System.out.println("2 değeri hatalı girdiniz.");
                    System.out.println("Doğru değerlere göre ortalamanız: "+ort);
                break;
            case 4: System.out.println("1 değeri hatalı girdiniz.");
                    System.out.println("Doğru değerlere göre ortalamanız: "+ort);
                break;
            case 5: System.out.println("Ortalamanız: "+ort);
                break;
            default:System.out.println("Girilen değerler 0-100 arasında olmalıdır.");
        }


    }

}




