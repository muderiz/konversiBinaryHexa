
import java.util.Scanner;

//import static java.lang.System.out;
class Looping {

    public static void main(String[] args) {
        KonversiHexaDecimal hexa = new KonversiHexaDecimal();
        Scanner input = new Scanner(System.in);
        
        /**
         * Untuk Memanggil Fungsi Hexadecimal to Decimal
         */
        System.out.println("\n-- Hexadecimal to Decimal --");
        System.out.print("Masukkan Bilangan Hexadesimal: ");
        String hexadecimal = input.nextLine();
        System.out.println("Nilai desimal untuk angka hexadesimal " + hexadecimal + " adalah " + hexa.konversiHexadecimal(hexadecimal.toUpperCase()));

        /**
         * Untuk Memanggil Fungsi Hexadecimal to Binary
         */
        String result;
        System.out.println("\n-- Hexadecimal to Binary --");
        System.out.print("Masukkan Bilangan Hexadesimal: ");
        String hex = input.next();
        result = hexa.hexToBinary(hex);
        System.out.println("Binary of " + hex + ":" + result);
        
        /**
         * Untuk Memanggil Fungsi Binary to Hexadecimal
         */
        System.out.println("\n-- Binary to Hexa --");
        System.out.print("Masukkan Bilangan Biner: ");
        String binerhexa = input.nextLine();
        System.out.println("Nilai Hexa untuk bilangan Biner " + binerhexa + " adalah " + hexa.BinaryToHexadecimal(binerhexa));

        
        /**
         * Untuk Memanggil Fungsi Binary to Decimal
         */
        System.out.println("\n-- Binary to Decimal --");
        System.out.print("Masukkan Bilangan Binary: ");
        int binary = input.nextInt();
        System.out.println("Nilai Decimal: "+hexa.toDecimal(binary));   
        
        /**
         * Untuk Memanggil Fungsi Binary to Octal
         */
        System.out.println("\n-- Binary to Octal --");
        System.out.print("Masukkan Bilangan Biner: ");
        int angkabiner = input.nextInt();
        System.out.printf("Nilai Octal :"+hexa.BinarytoOctal(angkabiner));
        
        
    }
}
