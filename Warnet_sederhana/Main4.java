// ! Program Utama No.4 - Quiz PBO 

import java.util.Scanner;
import java.io.IOException;

public class Main4{

  protected static Scanner userInput = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    try{
      // membuat Object
      RumusNet cust1 = new RumusNet();
      
      // Menu Awal
      do{
        System.out.println("====Selamat Datang di Connect NET====");
        System.out.println("====\tMenu\t====");
        System.out.println("1. Internet    [4000/jam]");
        System.out.println("2. Pengetikan  [2000/jam]");
        System.out.println("3. Game Online [5000/jam]");
        System.out.println("====Fasilitas Tambahan==== ");
        System.out.println("4. Scan        [1000/file]");
        System.out.println("5. Print       [Warna = 500/lbr, Hitam-putih = 300/lbr]");
        System.out.println("6. Teh Botol   [3000/botol]");
        System.out.print("Pilih Menu : ");
        cust1.pil = userInput.nextInt();
        System.out.print("\n");

        // Mengambil pilihan Customer
        switch(cust1.pil){
          case 1:
            cust1.internet();
            break;
          case 2:
            cust1.pengetikan();
            break;
          case 3:
            cust1.gameOnline();
            break;
          case 4:
            cust1.scan();
            break;
          case 5:
            cust1.print();
            break;
          case 6:
            cust1.tehBotol();
            break;
          default:
            System.out.println("Maaf, menu yang anda pilih tidak ada, silahkan kembali lain kali");
            break;
        }

        System.out.print("Ingin menambahkan lagi? [y/t] : ");
        cust1.pilMenu = userInput.next().charAt(0);
      } while((cust1.pilMenu == 'y') || (cust1.pilMenu == 'Y'));

      // !Mendapatkan list/bill
      cust1.listBill();

      // !Mendapatkan Tarif Total
      System.out.print("Total tarif yang harus dibayar adalah : Rp. " + cust1.totalTarif);
    }catch(Exception e){
      System.err.println("Silahkan cek kembali program anda, there's something wrong : " + e.getMessage());
    }
  }
}