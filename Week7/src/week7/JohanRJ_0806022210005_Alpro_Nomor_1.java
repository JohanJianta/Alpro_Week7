package week7;
import java.util.Scanner;

public class JohanRJ_0806022210005_Alpro_Nomor_1 {

    public static void main(String[] args) {
        int i;
        int j;
        int pilihan, sisi, perkalian;
        boolean aktif = true;
        String nama;
        char ulang;
        Scanner input = new Scanner (System.in);
        
        while (aktif) {
            boolean kerja = true;
            System.out.println("===============================================");
            System.out.println("                 MOST BASIC APP                ");
            System.out.println("===============================================");
            System.out.println("1. Perkalian");
            System.out.println("2. Shape Generator");
            System.out.println("3. Name Spelling");
            System.out.println("4. Close App");
            System.out.println("");
            System.out.print("Choose: ");
            pilihan = input.nextInt();
        
            switch (pilihan) {
                case 1 :
                    while (kerja) {
                        System.out.println("");
                        int hasil = 1;
                        System.out.println("===============================================");
                        System.out.println("                   Perkalian                   ");
                        System.out.println("===============================================");
                        System.out.println("1. Normal");
                        System.out.println("2. Ganjil");
                        System.out.println("3. Genap");
                        System.out.println("");
                        System.out.print("Pilih: ");
                        pilihan = input.nextInt();
                        System.out.println("");
                        
                        switch (pilihan){
                            case 1 :
                                System.out.println("===============================================");
                                System.out.println("                     Normal                    ");
                                System.out.println("===============================================");
                                System.out.println("");
                                System.out.print("Banyak perkalian: ");
                                perkalian = input.nextInt();
                                
                                for (i = 1; i <= perkalian; i++){
                                    hasil = hasil * i;
                                    System.out.print(i);
                                    if(i < perkalian){
                                        System.out.print(" X ");
                                    }
                                }
                                
                                System.out.println("");
                                System.out.println("Hasil: "+hasil);
                                
                                break;
                                
                            case 2 :
                                j = 1;
                                System.out.println("===============================================");
                                System.out.println("                     Ganjil                    ");
                                System.out.println("===============================================");
                                System.out.println("");
                                System.out.print("Banyak perkalian: ");
                                perkalian = input.nextInt();
                                
                                for (i = 1; i <= perkalian; i++){
                                    hasil = hasil * j;
                                    System.out.print(j);
                                    if(i < perkalian){
                                        System.out.print(" X ");
                                    }
                                    j+=2;
                                }
                                
                                System.out.println("");
                                System.out.println("Hasil: "+hasil);
                                
                                break;
                                
                            case 3 :
                                j = 2;
                                System.out.println("===============================================");
                                System.out.println("                     Genap                     ");
                                System.out.println("===============================================");
                                System.out.println("");
                                System.out.print("Banyak perkalian: ");
                                perkalian = input.nextInt();
                                
                                for (i = 1; i <= perkalian; i++){
                                    hasil = hasil * j;
                                    System.out.print(j);
                                    if(i < perkalian){
                                        System.out.print(" X ");
                                    }
                                    j+=2;
                                }
                                
                                System.out.println("");
                                System.out.println("Hasil: "+hasil);
                                break;
                                
                            default :
                                System.out.println("Pilihan anda tidak valid.");
                        }
                        
                        System.out.println("");
                        System.out.print("Gunakan Perkalian lagi (Y/N)? ");
                        ulang = input.next().charAt(0);
                        
                        if (ulang == 'N' || ulang == 'n'){
                            kerja = false;
                        }
                    }

                    break;

                case 2 :
                    while (kerja) {
                        System.out.println("");
                        System.out.println("===============================================");
                        System.out.println("                SHAPE GENERATOR                ");
                        System.out.println("===============================================");
                        System.out.println("1. Persegi");
                        System.out.println("2. Segitiga");
                        System.out.println("");
                        System.out.print("Pilih: ");
                        pilihan = input.nextInt();
                        System.out.println("===============================================");

                        switch (pilihan) {
                            case 1 :
                                System.out.print("Panjang sisi: ");
                                sisi = input.nextInt();
                                System.out.println("");

                                for (i = 1; i <= sisi; i++){
                                    for (j = 1; j <= sisi; j++){
                                        if (i == 1 || i == sisi || j == 1 || j == sisi) {
                                            System.out.print("# ");
                                        } else {
                                            System.out.print("0 ");
                                        }
                                    }
                                    System.out.println("");
                                }
                                
                                break;

                            case 2 :
                                System.out.print("Alas & Tinggi: ");
                                sisi = input.nextInt();
                                System.out.println("");
                                int k = sisi;
                                
                                for (i = 1; i <= sisi; i++){
                                    for(j = 1; j <= sisi; j++){
                                        if(j < k){
                                            System.out.print("+ ");
                                        } else {
                                            System.out.print("# ");
                                        }
                                    }
                                    k--;
                                    System.out.println("");
                                }
                                System.out.println("");
                                
                                break;

                            default :
                                System.out.println("Pilihan anda tidak valid.");
                        }
                        
                        System.out.println("");
                        System.out.print("Gunakan Shape lagi (Y/N)? ");
                        ulang = input.next().charAt(0);
                        
                        if (ulang == 'N' || ulang == 'n'){
                            kerja = false;
                        }
                    }

                    break;

                case 3 :
                    while (kerja) {
                        System.out.println("");
                        System.out.println("===============================================");
                        System.out.println("                 Name Spelling                 ");
                        System.out.println("===============================================");
                        System.out.println("");
                        System.out.print("Masukkan nama: ");
                        input.nextLine();
                        nama = input.nextLine();
                        String[] huruf = nama.split("");
                        System.out.println("");

                        for (i = 0; i < huruf.length; i++){
                            for(j = 0; j <= i; j++){
                                System.out.print(huruf [j] + " ");
                            }
                            System.out.println("");
                        }
                        
                        System.out.println("");
                        System.out.print("Gunakan Name Spelling lagi (Y/N)? ");
                        ulang = input.next().charAt(0);
                        
                        if (ulang == 'N' || ulang == 'n'){
                            kerja = false;
                        }
                    }
                    
                    break;
                    
                case 4 :
                    System.out.println("");
                    System.out.println("!!! Terima Kasih Sudah Menggunakan Aplikasi Ini !!!");
                    
                    return;

                default :
                    System.out.println("Pilihan anda tidak valid.");
            }
            
            System.out.println("");
            System.out.print("Kembali ke Menu Perhitungan (Y/N)? ");
            ulang = input.next().charAt(0);
        
            if (ulang == 'N' || ulang == 'n'){
                aktif = false;
            }
            
            System.out.println("");
        }
        
        System.out.println("!!! Terima Kasih Sudah Menggunakan Aplikasi Ini !!!");
    }
}