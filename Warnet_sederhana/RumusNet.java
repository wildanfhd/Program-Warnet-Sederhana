// ! Soal No.4 - Quiz PBO 

import java.util.ArrayList;
import java.util.Collections;

public class RumusNet extends Warnet{
  private ArrayList<String> listPakai = new ArrayList<String>();

  public void setInternet(String inet){
    this.jenis = inet;
    this.listPakai.add(this.jenis);
  }

  public void setPengetikan(String ketik){
    this.jenis = ketik;
    this.listPakai.add(this.jenis);
  }

  public void setGameOnline(String game){
    this.jenis = game;
    this.listPakai.add(this.jenis);
  }

  public void setScan(String scan){
    this.jenis = scan;
    this.listPakai.add(this.jenis);
  }

  public void setPrint(String print){
    this.jenis = print;
    this.listPakai.add(this.jenis);
  }

  public void setTehBotol(String teh){
    this.jenis = teh;
    this.listPakai.add(this.jenis);
  }
  
  public void setLembarWarna(String warna){
    this.jenis = warna;
    this.listPakai.add(this.jenis);
  }

  public void setLembarMono(String mono){
    this.jenis = mono;
    this.listPakai.add(this.jenis);
  }

  public float getTarifInet(){
    return this.tarifInet;
  }

  public float getTarifKetik(){
    return this.tarifKetik;
  }

  public float getTarifGame(){
    return this.tarifGame;
  }

  public float getTarifScan(){
    return this.tarifScan;
  }

  public float getTarifWarna(){
    return this.totalWarna;
  }

  public float getTarifMono(){
    return this.totalMono;
  }

  public float getTarifTeh(){
    return this.tarifTeh;
  }

  public float getTotalTarif(){
    return this.totalTarif;
  }

  public ArrayList<String> getList(){
    return this.listPakai;
  }
  
  public float hitungInet(){
    this.tarifInet = (this.durasi/60)*4000;
    System.out.println("Tarif Internet : Rp. " + this.tarifInet);
    this.totalTarif = this.totalTarif + this.tarifInet;
    return this.tarifInet;
  }

  public float hitungKetik(){
    this.tarifKetik = (this.durasi/60)*2000;
    System.out.println("Tarif Pengetikan : Rp. " + this.tarifKetik);
    this.totalTarif = this.totalTarif + this.tarifKetik;
    return this.tarifKetik;
  }

  public float hitungGame(){
    this.tarifGame = (this.durasi/60)*5000;
    System.out.println("Tarif Game Online : Rp. " + this.tarifGame);
    this.totalTarif = this.totalTarif + this.tarifGame;
    return this.tarifGame;
  }

  public float hitungScan(){
    this.tarifScan = this.lembarScan*1000;
    System.out.println("Tarif Scan : Rp. " + this.tarifScan);
    this.totalTarif = this.totalTarif + this.tarifScan;
    return this.tarifScan;
  }

  public float hitungWarna(){
    this.tarifWarna = 500F;
    this.totalWarna = this.tarifWarna * this.lembarWarna;
    System.out.println("Tarif Print Warna : Rp. " + this.totalWarna);
    this.totalTarif = this.totalTarif + this.totalWarna;
    return this.totalWarna;
  }

  public float hitungMono(){
    this.tarifMono = 300F;
    this.totalMono = this.tarifMono * this.lembarMono;
    System.out.println("Tarif Print Hitam Putih : Rp. " + this.totalMono);
    this.totalTarif = this.totalTarif + this.totalMono;
    return this.totalMono;
  }

  public float hitungTeh(){
    this.tarifTeh = this.jml * 3000;
    System.out.println("Tarif Teh Botol : Rp. " + this.tarifTeh);
    this.totalTarif = this.totalTarif + this.tarifTeh;
    return this.tarifTeh;
  }

  public void internet(){
    this.setInternet("Internet");
    System.out.println("Anda memilih Internet [4000/jam]");
    System.out.print("Masukkan waktu pemakaian [dalam menit] : ");
    this.durasi= userInput.nextFloat();
    this.hitungInet();
  }

  public void pengetikan(){
    this.setPengetikan("Pengetikan");
    System.out.println("Anda memilih Pengetikan [2000/jam]");
    System.out.print("Masukkan waktu pemakaian [dalam menit] : ");
    this.durasi= userInput.nextFloat();
    this.hitungKetik();
  }

  public void gameOnline(){
    this.setGameOnline("Game Online");
    System.out.println("Anda memilih Game Online [5000/jam]");
    System.out.print("Masukkan waktu pemakaian [dalam menit] : ");
    this.durasi= userInput.nextFloat();
    this.hitungGame();
  }

  public void scan(){
    this.setScan("Scan");
    System.out.println("Anda memilih Scan");
    System.out.print("Masukkan banyaknya lembar yang discan : ");
    this.lembarScan = userInput.nextInt();
    this.hitungScan();
  }

  public void print(){
    this.setPrint("Print");
    System.out.println("Anda memilih Print, silahkan pilih jenisnya");
    System.out.println("1. Print Warna        [Rp.500/lbr]");
    System.out.println("2. Print Hitam  Putih [Rp.300/lbr]");
    System.out.print("Pilih jenis : ");
    this.pil = userInput.nextInt();
    if(this.pil == 1){
      this.setLembarWarna("Print Warna");
      System.out.println("Anda memilih print warna, tarif 500/lembar");
      System.out.print("Masukkan banyaknya lembar print warna : ");
      this.lembarWarna = userInput.nextInt();
      this.hitungWarna();
    } else if(this.pil == 2){
      this.setLembarMono("Print Hitam Putih");
      System.out.println("Anda memilih print Hitam-putih, tarif 300/lembar");
      System.out.print("Masukkan banyaknya lembar print Hitam-putih : ");
      this.lembarMono = userInput.nextInt();
      this.hitungMono();
    }
  }

  public void tehBotol(){
    this.setTehBotol("Teh Botol");
    System.out.println("Anda memilih Teh Botol [3000/botol]");
    System.out.print("Berapa yang dibeli? : ");
    this.jml = userInput.nextInt();
    this.hitungTeh();
  }

  public void listBill(){
    System.out.print("\n");
    System.out.println("====Connect NET Bill====");
    System.out.println("List yang anda pakai : ");
    Collections.sort(this.listPakai); // Sortir sesuai alfabet
    for(int i = 0; i < this.listPakai.size(); i++) {
      if(this.listPakai.get(i) == "Print"){
        this.listPakai.remove(i);
      }
        System.out.println("-" + this.listPakai.get(i));
      }
  }
}