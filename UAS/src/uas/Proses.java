
package uas;


public class Proses extends Data {
   private String potongan;
   private String status;
   private String diskon;
   private double total;

    public Proses(String potongan, String nama, String item, String kode, double harga) {
        super(nama, item, kode, harga);
        this.potongan = potongan;
    }

    public String getPotongan() {
        return potongan;
    }

    public void setPotongan(String potongan) {
        this.potongan = potongan;
    }
    
    public String bonus(){
        switch (getKode()) {            
            case "a" : this.status ="Bonus Brakfast dan Dinner";
            break;
            
            case "b" : this.status="Bonus 1 Hari Penginapan";    
            break;
            
            default :
                this.status ="Tidak ada bonus";
               break;
    }
        return this.status;
    }
    
    public String bonus(String pot){
        String a = pot;
            
            switch (a) {
                case "10%" :
                    this.diskon = String.valueOf(getHarga()*0.1);
                break;
                case "20%" : 
                    this.diskon = String.valueOf(getHarga()*0.2);
                break;
                default :
                    this.diskon = "Tidak Ada Potongan";
            }            
        return this.diskon;
    }
    
    
   @Override
    public void display(){
        super.display();
        System.out.println("Bonus Kode      : "+bonus());
        System.out.println("Bonus Diskon    : "+bonus(getPotongan()));
    }
}
