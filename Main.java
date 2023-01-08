import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  z=0 , a, ;
        Buku[] data = new Buku[20000];
        data[z] = new Buku();

        while (true) {
            System.out.println();
            System.out.print("menu...\n1.input\t\t2.view\n3.search\t4.update\n5.delete\t6.exit\n");
            System.out.print("Masukkan Pilihan: ");
            int menu = in.nextInt();
            if (menu == 1) {
                z++;
                data[z] = new Buku();
                data[z].setData();
            } else if (menu == 2) {
                if (z < 1)
                    System.out.println("data kosong");
                else {
                    a =0;
                    while (a < z) {
                        a++;
                        System.out.println("---" + a + "---");
                        data[a].tampil();
                    }
                }
            } else if (menu == 3 || menu == 4 || menu == 5) {
                System.out.print("masukkan id buku : ");
                cari = in.nextInt();
                a = 1;
                while (a <= z) {
                    if (data[a].getId() == cari)
                        break;
                    a++;
                }
                if (a <= z) {
                    if (menu == 3)
                        data[a].tampil();
                    else if (menu == 4) {
                        data[a].tampil();
                        data[a].setData();
                    } else {
                        while (a < z) {
                            data[a] = data[a + 1];
                            a++;
                        }
                        z--;
                        System.out.println("data " + cari + " berhasil dihapus");
                    }
                } else
                    System.out.println("data tidak ditemukan");
            } else if (menu == 6) {
                System.out.println("keluar...");
                System.exit(4);
            }
            else
                System.out.println("menu ilegal");
        }
    }
}