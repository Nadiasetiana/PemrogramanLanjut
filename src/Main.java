import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int Pilih;
        String Nama = "Admin";
        String pw = "Admin123";
        String username = "Nadia403";
        String password = "Nadi4";
        Scanner sc = new Scanner(System.in);

        System.out.println("===Silahkan login=== ");
        System.out.println("1. Admin ");
        System.out.println("2. Mahasiswa ");
        System.out.print("Masukkan Pilihan : ");
        Pilih = sc.nextInt();

        if (Pilih == 1) {
            System.out.println("==Halo Admin==");
            System.out.printf("Nama : ");
            Nama = sc.next();
            System.out.printf("Password : ");
            pw = sc.next();
            if (Nama.equals("Admin") && pw.equals("Admin123")) {
                System.out.println("Login Sukses");
            } else {
                System.out.println("Login Tidak Valid");
            }

        }else if (Pilih == 2) {
            System.out.println("==Halo Mahasiswa==");
            System.out.printf("Nama : ");
            username = sc.next();
            System.out.printf("Password : ");
            password = sc.next();
            if (Nama.equals("Nadia403") && pw.equals("Nadi4")) {
                System.out.println("Login Sukses");
            } else {
                System.out.println("Login Tidak Valid");
            }
            System.out.println("Nama Mahasiswa : " + Nama);


        }
    }
}


    }
            }