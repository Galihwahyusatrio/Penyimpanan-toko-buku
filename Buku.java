import java.util.Scanner;

public class Buku extends RakBuku{
    int idBuku,harga,jumlah;
    String nama, kategoriRak;
    Scanner in = new Scanner(System.in);
    Scanner str = new Scanner(System.in);

    @Override
    public void setData(){
        System.out.print("Masukkan ID Buku : ");
        this.idBuku=in.nextInt();
        System.out.print("Masukkan Nama Buku  : ");
        this.nama=str.nextLine();
        System.out.print("Masukkan Harga Buku : ");
        this.harga=in.nextInt();
        System.out.print("Masukkan Jumlah Buku : ");
        this.jumlah=in.nextInt();
        System.out.print("Masukkan Nama Kategori Rak : ");
        this.kategoriRak =str.nextLine();
    }

    @Override
    public void tampil(){
        System.out.println("Id Buku    : "+this.idBuku);
        System.out.println("Nama Buku  : "+this.nama);
        System.out.println("Harga Buku : "+this.harga);
        System.out.println("Jumlah Buku : "+this.jumlah);
        System.out.println("Kategori Rak Buku : "+this.kategoriRak);
    }
    @Override
    public int getId(){
        return this.idBuku;
    }
}
