# Bayu-Ega-Satria_2210010249_4C_PBO1
 UAS PBO1
 Proyek ini adalah contoh sederhana aplikasi resepsionis menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi
Aplikasi ini menggunakan sistem pilihan yang mana banyak menggunakan percabangan, juga ada beberapa operasi perhitungan dalam program ini.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** 

```bash
public class Data {
    ...
}

public class Hitung extends Data {
    ...
}

public class Main {
    ...
}
```

2. **Object** 

```bash
menu[i] = new Hitung(nm,kode,item,harga,diskon);
```

3. **Atribut** 

```bash
 String nama,kode,item;
 double harga;
 String status;
 String diskon,pot;
```

4. **Constructor** 

```bash
 public Data(String nama, String kode, String item, double harga) {
        this.nama = nama;
        this.kode = kode;
        this.item = item;
        this.harga = harga;
    }
public Hitung(String nama, String kode, String item, double harga,String potong) {
        super(nama, kode, item, harga);
        this.pot = potong;
    }
```

5. **Mutator** 
```bash 

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setPot(String pot) {
        this.pot = pot;
    }
```

6. **Accessor** 

```bash
 public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }


    public String getItem() {
        return item;
    }


    public double getHarga() {
        return harga;
    }

    public String getPot() {
        return pot;
    }

```

7. **Encapsulation** 

```bash
private String nama,kode,item;
private double harga;
private String status;
private String diskon,pot;
```

8. **Inheritance** 

```bash
public class Hitung extends Data {
    ...
    }
```

9. **Polymorphism** 

```bash
public void display(){
        System.out.println("Nama        : "+getNama());
        System.out.println("Item        : "+getItem());
        System.out.println("Harga       : "+getHarga());
    }

 @Override
    public void display(){
    super.display();
        System.out.println("Bonus       : "+bonus());
        System.out.println("Diskon      : "+bonus(getPot()));
    }
```

10. **Seleksi** 

```bash
switch (c){
                case 1 :
                 diskon = "10%";
                break;
                
                case 2 :
                 diskon = "20%";
                break;
                
                default :
                 diskon = null;
                break;
            }
        
switch (b) {
            case 1 : 
                item = "Reguler";
                harga = 20000;
            break;
            
            case 2 :
                item = "Premium";
                harga = 50000;
            break;
            
            case 3 :
                item = "VVIP";
                harga = 100000;
            break;
            
            default : 
                System.out.println("Pilihan tidak tersedia");
                item = null;
            break;
        }
        
```

11. **Perulangan** 

```bash
for (int i = 0; i < menu.length; i++) {
    ...
}
    ....
 for (Hitung data:menu){
            System.out.println("##############################");
            data.display();
        }
```

12. **Input Output Sederhana** 
```bash
Scanner scanner = new Scanner(System.in);
  System.out.print("Masukan Pilihan :");
        int b = input.nextInt();

System.out.println("##############################");
            data.display();
```

13. **Array** 

```bash
menu[i] = new Hitung(nm,kode,item,harga,diskon);
```

14. **Error Handling** 

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Input Salah : " + e.getMessage());
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
