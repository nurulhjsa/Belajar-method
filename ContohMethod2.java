public class ContohMethod2
{
    public static void Persegi(Integer sisi){
        System.out.println("Mencari Nilai Luas Persegi :");
        System.out.println("Nilai sisi adalah "+sisi);
        System.out.println("Luas Persegi adalah "+(sisi*sisi));
        System.out.println(" ");
    }

    public static void PersegiPanjang(Integer panjang, Integer lebar){
        System.out.println("Mencari Nilai Luas Persegi Panjang :");
        System.out.println("Nilai Panjang persegi adalah "+panjang);
        System.out.println("Nilai Lebar persegi adalah "+lebar);
        System.out.println("Luas Persegi Panjang adalah "+(panjang*lebar));
        System.out.println(" ");
    }

    public static void Lingkaran(Integer jariJari, double pi){
        System.out.println("Mencari Nilai Luas Lingkaran:");
        System.out.println("Nilai jari-jari lingkaran adalah "+jariJari);
        System.out.println("Luas Lingkaran adalah "+(pi*jariJari*jariJari));
    }
}