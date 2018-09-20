
public class KonversiHexaDecimal {

    /**
     * Konversi Hexadecimal to Decimal
     *
     * @param hex untuk program akan mengembalikan nilai integer.
     * @return nilaidesimal untuk menampilkan nilai desimal, ch - '0' untuk -
     * mengembalikan nilai desimal untuk hex character. Character dapat sebagai
     * uppercase ataupun lowercase.
     */
    public int konversiHexadecimal(String hex) {
        int nilaiDesimal = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            nilaiDesimal = nilaiDesimal * 16 + hexCharKeDesimal(hexChar);
        }
        return nilaiDesimal;
    }

    /**
     * Konversi String Hex ke Decimal hexCharkeDesimal ini akan di gunakan oleh
     * konversiHexadecimal nantinya
     *
     * @param ch sebagai menanda batas angka
     * @return untuk mengembalikan nilai decimal untuk hex character
     */
    public static int hexCharKeDesimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else // ch adalah '0', '1', ..., atau '9'  
        {
            return ch - '0';
        }
    }

    /**
     * Konversi Hexadecimal to Binary
     *
     * @param hex untuk mengambil data Hexa untuk di convertkan ke binary
     * @return mengembalikan data hasil dari binary value
     */
    public String hexToBinary(String hex) {
        String result = "";
        String binVal;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);

            switch (hexChar) {
                case ('0'):
                    binVal = "0000";
                    break;
                case ('1'):
                    binVal = "0001";
                    break;
                case ('2'):
                    binVal = "0010";
                    break;
                case ('3'):
                    binVal = "0011";
                    break;
                case ('4'):
                    binVal = "0100";
                    break;
                case ('5'):
                    binVal = "0101";
                    break;
                case ('6'):
                    binVal = "0110";
                    break;
                case ('7'):
                    binVal = "0111";
                    break;
                case ('8'):
                    binVal = "1000";
                    break;
                case ('9'):
                    binVal = "1001";
                    break;
                case ('A'):
                    binVal = "1010";
                    break;
                case ('B'):
                    binVal = "1011";
                    break;
                case ('C'):
                    binVal = "1100";
                    break;
                case ('D'):
                    binVal = "1101";
                    break;
                case ('E'):
                    binVal = "1110";
                    break;
                case ('F'):
                    binVal = "1111";
                    break;
                default:
                    binVal = "invalid input";
                    break;
            }
            result += binVal;
        }
        return result;
    }

    /**
     * Konversi dari Binary ke Hexadecimal
     * @param number berisi bilangan yang akan di konversikan
     * @return mengembalikan nilai hexa 
     */
    public String BinaryToHexadecimal(String number) {
        String hexa = "";
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a',
            'b', 'c', 'd', 'e', 'f'};
        if (number != null && !number.isEmpty()) {
            int decimal = BinaryToDecimal(number);
            while (decimal > 0) {
                hexa = hex[decimal % 16] + hexa;
                decimal /= 16;
            }
        }
        return hexa;
    }
    /**
     * Konversi Biner ke Decimal
     * @param number Isi dari Bilangan Biner
     * @return Mengembalikan hasil konversi biner ke decimal
     */
    public int BinaryToDecimal(String number) {
        int length = number.length() - 1;
        int decimal = 0;
        if (isBinary(number)) {
            char[] digits = number.toCharArray();
            for (char digit : digits) {
                if (String.valueOf(digit).equals("1")) {
                    decimal += Math.pow(2, length);
                }
                --length;
            }
        }
        return decimal;
    }
    /**
     * Untuk kondisi apakah Bilangan yang di input merupakan bilangan Biner/Binary
     * @param number berisi bilangan yang di input
     * @return mengembalikan data biner
     */
    public boolean isBinary(String number) {
        boolean isBinary = false;
        if (number != null && !number.isEmpty()) {
            long num = Long.parseLong(number);
            while (num > 0) {
                if (num % 10 <= 1) {
                    isBinary = true;
                } else {
                    isBinary = false;
                    break;
                }
                num /= 10;
            }
        }
        return isBinary;
    }

    /**
     * Konversi Binary to Decimal
     *
     * @param binary mengambil data Binary
     * @return untuk mengembalikan data decimal
     */
    public int toDecimal(int binary) {
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }
        return decimal;
    }

    /**
     * Untuk Mengkonversikan Binary ke Octal
     *
     * @param angkabiner di isi oleh bilangan biner yang akan di konversikan
     * @return mengembalikan data bilangan octal
     */
    public int BinarytoOctal(int angkabiner) {
        int angkaoctal = 0, angkadecimal = 0, i = 0;
        while (angkabiner != 0) {
            angkadecimal += (angkabiner % 10) * Math.pow(2, i);
            ++i;
            angkabiner /= 10;
        }
        i = 1;
        while (angkadecimal != 0) {
            angkaoctal += (angkadecimal % 8) * i;
            angkadecimal /= 8;
            i *= 10;
        }
        return angkaoctal;
    }

}
