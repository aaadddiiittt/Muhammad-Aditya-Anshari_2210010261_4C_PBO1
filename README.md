# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kendaraan`, `Mobil`, dan `ManajemenBengkel` adalah contoh dari class.

```bash
public class Kendaraan {
    ...
}

public class Mobil extends Kendaraan {
    ...
}

public class ManajemenBengkel {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `  Kendaraan[] kendaraan = new Kendaraan[jumlahKendaraan];` adalah contoh pembuatan object.

```bash
  Kendaraan[] kendaraan = new Kendaraan[jumlahKendaraan];
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merk` , `model` , 'tahun' adalah contoh atribut.

```bash
String merk;
String model;
int tahun;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Kendaraan' dan 'Mobil'.

```bash
public Kendaraan(String merk, String model, int tahun) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
}

public Mobil(String merk, String model, int tahun, int jumlahPintu) {
        super(merk, model, tahun);
        this.jumlahPintu = jumlahPintu;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMerk` , `setModel` , 'setTahun' adalah contoh method mutator.

```bash
public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerk`, `getModel`, `getTahun` adalah contoh method accessor.

```bash
public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public int getTahun() {
        return tahun;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `merk` , `model` , 'tahun' dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String merk;
private String model;
private int tahun;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Mobil` mewarisi `Kendaraan` dengan sintaks `extends`.

```bash
public class Mobil extends Kendaraan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method toString() untuk memberikan representasi teks dari objek Mobil. Ini adalah contoh dari polymorphism di mana method toString() yang berasal dari kelas Object di-override untuk memberikan informasi yang lebih spesifik..

```bash
@Override
    public String toString() {
        return "Mobil{merk='" + getMerk() + "', model='" + getModel() + "', tahun=" + getTahun() + ", jumlahPintu=" + jumlahPintu + "}";
    }
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, Kondisi if: Jika pengguna menjawab "ya", program akan melanjutkan .

```bash
System.out.print("Apakah ini mobil? (ya/tidak): ");
            String pilihan = scanner.nextLine().toLowerCase();

            if (pilihan.equals("ya")) {
                System.out.print("Jumlah pintu: ");
                int jumlahPintu = Integer.parseInt(scanner.nextLine());
                kendaraan[i] = new Mobil(merk, model, tahun, jumlahPintu);
            } else {
                
                System.out.println("Maaf, hanya mobil yang didukung dalam contoh ini.");
                i--; 
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk mengulang proses input data kendaraan sebanyak jumlahKendaraan yang dimasukkan pengguna.

```bash
for (int i = 0; i < jumlahKendaraan; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
 Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Sistem Manajemen Bengkel");

        System.out.print("Masukkan jumlah kendaraan: ");
        int jumlahKendaraan = Integer.parseInt(scanner.nextLine());
        Kendaraan[] kendaraan = new Kendaraan[jumlahKendaraan];
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Kendaraan[] kendaraan = new Kendaraan[jumlahKendaraan];` adalah contoh penggunaan array.

```bash
Kendaraan[] kendaraan = new Kendaraan[jumlahKendaraan];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
  System.out.print("Tahun: ");
  tahun = Integer.parseInt(scanner.nextLine());
  inputValid = true;
} catch (NumberFormatException e) {
  System.out.println("Masukkan tahun dalam bentuk bilangan bulat.");
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

Nama: Muhammad Aditya Anshari
NPM: 2210010261
