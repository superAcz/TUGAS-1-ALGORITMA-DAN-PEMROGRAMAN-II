//NAMA   : JAKSA SETIA ALAM
//NPM    : 227064516051
//MATKUL : Algoritma dan Pemrograman II
//DOSEN  : Dhieka Avrilia Lantana, S.Kom., M.Kom.

package tugas1;

//Library input
import java.util.Scanner;
public class Tugas1Nomor2 {
    
    public static void main(String[] args) {
        
        //Membuat objek Scanner untuk membaca input dari user
        Scanner inputan = new Scanner(System.in);
        
        //Deklarasi variabel
        int jumlahData;
        String namaMahasiswa[];
        int nilaiUts[];
        int nilaiUas[];
        int totalNilai = 0;
        double rataRata = 0;
        int x;
        
        //Menginput jumlahData dari user
        System.out.print("Masukan jumlah data\t: ");
        jumlahData = inputan.nextInt();
        System.out.println("");
        
        //Membuat array dengan ukuran jumlahData
        namaMahasiswa = new String[jumlahData];
        nilaiUts = new int[jumlahData];
        nilaiUas = new int[jumlahData];
        
        //Membuat sintak pengulangan sesuai dengan jumlahData
        for (x=0; x<jumlahData; x++) {
            
            //Menginput nama, nilai uts dan uas
            System.out.println("Masukan data ke-"+(x+1));
            System.out.print("Masukan nama\t\t: ");
            namaMahasiswa[x] = inputan.next();
            System.out.print("Masukan nilai uts\t: ");
            nilaiUts[x] = inputan.nextInt();
            System.out.print("Masukan nilai uas\t: ");
            nilaiUas[x] = inputan.nextInt();
            inputan.nextLine();
            System.out.println("");
    }
        
        //Menampilkan output tabel
        System.out.println("================================================");
        System.out.println("No.\tNama\tUTS\tUAS\tTotal\tRata-Rata");
        System.out.println("================================================");
        
        //Membuat sintak pengulangan untuk menampilkan output
        for (x=0; x<jumlahData; x++) {
            
            //Menghitung total nilai dengan rumus nilaiUts ditambah nilaiUas
            totalNilai = nilaiUts[x] + nilaiUas[x];
            
            //Menghitung rata-rata nilai dengan rumus totalNiilai dibagi dua
            rataRata = totalNilai / 2;
            
            //Menampilkan output nama, nilai uts, nilai uas, total nilai, dan rata-rata nilai
            System.out.println((x+1)+"\t"+namaMahasiswa[x]+"\t"+nilaiUts[x]+"\t"+nilaiUas[x]+"\t"+totalNilai+"\t"+rataRata);
            
        }
        System.out.println("================================================");
    }
}