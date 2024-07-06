# Bayu-Ega-Satria_2210010249_4C_PBO1
 UAS PBO1
 # Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi resepsionis menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menggunakan sistem pilihan, yang dimana sebagian besar proses dari aplikasi ini adalah percabangan, aplikasi ini menerima inputan yang akan di seleksi dan di keluarkan hasil nya sebagai output data yang sudah di proses;

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Data`, `Proses`, dan `Main` adalah contoh dari class.

```bash
public class Data {
    ...
}

public class Proses extends Data {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `menu[i] = new Proses (diskon,nama,item,kode,harga); ` adalah contoh pembuatan object.

```bash
menu[i] = new Proses (diskon,nama,item,kode,harga); 
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`,`item`,`kode`,`harga`,`potongan` adalah contoh atribut.

```bash
String nama,item,kode;
private double harga;
private String potongan;
private String status;
private String diskon;
private double total;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Data` dan `Proses`.

```bash
public Data(String nama, String item, String kode, double harga) {
  this.nama = nama;
  this.item = item;
  this.kode = kode;
  this.harga = harga;
    }

 public Proses(String potongan, String nama, String item, String kode, double harga) {
        super(nama, item, kode, harga);
        this.potongan = potongan;
    }

```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setHarga` adalah contoh method mutator.

```bash
  public void setNama(String nama) {
        this.nama = nama;
    }
 public void setItem(String item) {
        this.item = item;
    }
 public void setKode(String kode) {
        this.kode = kode;
    }
 public void setHarga(double harga) {
        this.harga = harga;
    }
 public void setPotongan(String potongan) {
        this.potongan = potongan;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getHarga`, `getKode`, `getItem`, `getPotongan` adalah contoh method accessor.

```bash

    public String getNama() {
        return nama;
    }
    public String getItem() {
        return item;
    }
    public String getKode() {
        return kode;
    }
    public double getHarga() {
        return harga;
    }
    public String getPotongan() {
        return potongan;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`,`item`,`kode`,`harga` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private String nama,item,kode;
    private double harga;
    private String potongan;
    private String status;
    private String diskon;
    private double total;

```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Proses` mewarisi `Data` dengan sintaks `extends`.

```bash
    public Proses(String potongan, String nama, String item, String kode, double harga) {
   .....
    }
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `bonus(String)` di `Proses` merupakan overloading method `bonus()` dan `display()` di `Proses` merupakan override dari method `display()` di `Data`.

```bash
public void display(){
 System.out.println("Nama        : " +getNama());
 System.out.println("Item        : " +getItem());
 System.out.println("Harga       : " +getHarga());
 System.out.println("Kode        : " +getKode());
    }
@Override
public void display(){
 super.display();
 System.out.println("Bonus Kode      : "+bonus());
 System.out.println("Bonus Diskon    : "+bonus(getPotongan()));
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `bonus(string)`,`bonus()` dan juga pada class `Main`.

```bash

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

```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < menu.length; i++) {
    ...
}

for (Proses data : menu){
   ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);
 System.out.print("Masukan Pilihan :");
 int a =input.nextInt();
 System.out.print("Masukan pilihan :");
 int b = input.nextInt();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Proses[] menu = new Proses[2];` adalah contoh penggunaan array.

```bash
Proses[] menu = new Proses[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Bayu Ega Satria
NPM: 2210010249
