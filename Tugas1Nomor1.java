//NAMA   : JAKSA SETIA ALAM
//NPM    : 227064516051
//MATKUL : Algoritma dan Pemrograman II
//DOSEN  : Dhieka Avrilia Lantana, S.Kom., M.Kom.

package tugas1;

//Library input
import java.util.Scanner;
public class Tugas1Nomor1 {

    public static void main(String[] args) {
        
        //Membuat objek Scanner untuk membaca input dari user
        Scanner inputan = new Scanner(System.in);
        
        //Deklarasi variabel
        int jumlahMahasiswa;
        String namaMahasiswa[];
        int nilaiMahasiswa[];
        int totalNilai = 0;
        double rataRataNilai;
        int x;
        
        //Menginput jumlahMahasiswa dari user
        System.out.print("Berapa masukan nilai mahasiswa = ");
        jumlahMahasiswa = inputan.nextInt(); 
        inputan.nextLine();
        
        //Membuat array dengan ukuran jumlahMahasiswa
        namaMahasiswa = new String[jumlahMahasiswa];
        nilaiMahasiswa = new int[jumlahMahasiswa];
        
        //Membuat sintak pengulangan sesuai dengan jumlahMahasiswa
        for (x=0; x<jumlahMahasiswa; x++) {
            
            //Menginput nama dan nilai mahasiswa
            System.out.print("masukan nama mahasiswa = ");
            namaMahasiswa[x] = inputan.nextLine();
            System.out.print("masukan nilai mahasiswa = ");
            nilaiMahasiswa[x] = inputan.nextInt();
            inputan.nextLine();
            
            //Menghitung total nilai dengan menjumlahkan nilaiMahasiswa
            totalNilai += nilaiMahasiswa[x];
        }
        
        //Menghitung nilai rata-rata mahasiswa dengan rumus totalNilai dibagi jumlahMahasiswa
        rataRataNilai = totalNilai / jumlahMahasiswa;
        
        //Menampilkan output total dan rata-rata nilai mahasiswa
        System.out.println("total nilai mahasiswa = "+totalNilai);
        System.out.println("rata-rata nilai mahasiswa = "+rataRataNilai);
        
    }
    
}
