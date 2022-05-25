	import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                
                //Değişken oluşturma
                int mat, kimya, fizik, turkce, resim, muzik;
                double ortlama;

                //Scanner tanımlama
                Scanner dersler = new Scanner(System.in);

                //Konsoldan çıktı alma
                System.out.print("Matematik notunuzu giriniz: " );
                mat = dersler.nextInt();

                System.out.print("Kimya notunuzu giriniz: " );
                kimya = dersler.nextInt();

                System.out.print("Fizik notunuzu giriniz: " );
                fizik = dersler.nextInt();

                System.out.print("Türkçe notunuzu giriniz: " );
                turkce = dersler.nextInt();

                System.out.print("Resim notunuzu giriniz: " );
                resim = dersler.nextInt();

                System.out.print("Müzik notunuzu giriniz: " );
                muzik = dersler.nextInt();

                int toplam = (mat+kimya+fizik+turkce+resim+muzik);
                ortlama = (toplam/6);
                System.out.println("Ortalamanız :"+ortlama);

                //Koşul belirtme ve sonuc çıkarma
                String sonuc = (ortlama>=60) ? "Tebrikler Geçtiniz..." : "Kaldınız...";
                System.out.println(sonuc);


            }
        }



