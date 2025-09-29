# Koleksi Alat Makeup

| Nama                      | NIM           | Kelas             |
|---------------------------|---------------|-------------------|
| Indah Maramin Al Inayah   | 2409116086    | Sistem Informasi C |

## 📄Deskripsi Program

Program ini adalah sistem manajemen koleksi alat makeup berbasis Java yang dikembangkan dengan menerapkan konsep Object-Oriented Programming (OOP) tingkat lanjut. Sistem menyediakan satu role yaitu pengguna, yang dapat melakukan operasi CRUD (Create, Read, Update, Delete) terhadap data koleksi makeup.

Program ini menerapkan konsep OOP:

* Encapsulation: Menggunakan access modifier (private, public, protected) serta getter-setter untuk melindungi data.

* Inheritance: Class AlatMakeup menurunkan sifatnya ke Foundation dan Lipstick.

* Polymorphism: Method info() dan tampilDetail() dioverride agar setiap jenis makeup menampilkan detail berbeda sesuai objeknya.

* Interface: Detail digunakan agar setiap objek wajib mengimplementasikan method tampilDetail().

* Constructor: Untuk inisialisasi data objek saat dibuat.

* Validasi input: Mencegah pengguna memasukkan data kosong atau tidak sesuai.

Fitur Utama:

1. **Tambah Koleksi**: Pengguna dapat menambahkan data alat damakeup baru.
2. **Lihat Koleksi**: Menampilkan seluruh daftar koleksi yang sudah tersimpan.
3. **Ubah Koleksi**: Memperbarui data koleksi yang dipilih
4. **Hapus Koleksi**: Menghapus data koleksi dari daftar
5. **Cari Koleksi**: Mencari data koleksi berdasarkan nama alat.
6. **Keluar Program**: Menghentikan jalannya program

## Struktur Packages

<img width="555" height="294" alt="image" src="https://github.com/user-attachments/assets/f27a7e78-1a5f-407c-a657-cf2cc99eca5e" />

Program ini menggunakan pola MVC (Model-View-Controller) agar kode lebih terstruktur, mudah dipelihara, dan jelas pembagian fungsinya.

* main: Berisi Main.java sebagai titik masuk program yang menampilkan menu interaktif dan menerima input pengguna.

* model: Berisi class-class utama seperti ItemMakeup, AlatMakeup, Foudation dan Lipstick

* interfaces: Berisi interface Detail yang mendefinisikan kontrak method tampilDetail(). Semua class makeup yang mengimplement interface ini wajib menyediakan cara menampilkan detail datanya

* service: Berisi KoleksiService.java yang mengatur logika CRUD, validasi input, serta fitur pencarian koleksi makeup.

## Menerapkan Abstraction (minimal 1 abstract class atau 1 interface).

Abstraction dalam OOP (Object-Oriented Programming) digunakan untuk menyembunyikan detail implementasi dan hanya menampilkan hal-hal penting yang perlu digunakan. Dalam program ini, abstraction diterapkan dengan abstract class dan interface

1. Abstract Class

<img width="809" height="326" alt="image" src="https://github.com/user-attachments/assets/97aee781-dcd6-45ba-b540-7be90e033ff7" />

* ItemMakeup dijadikan abstract class karena berfungsi sebagai blueprint untuk semua alat makeup.

* Class ini menyimpan atribut umum seperti nama, jenis, merk, dan jumlah, yang pasti dimiliki semua alat makeup.

* Dengan abstract class, kita tidak bisa membuat objek ItemMakeup secara langsung, tapi harus melalui subclass seperti AlatMakeup, Lipstick, atau Foudation.

2. Interface

<img width="393" height="111" alt="image" src="https://github.com/user-attachments/assets/f3858201-6501-4658-8ed2-584da909ab4b" />

* Interface Detail berisi method abstrak tampilDetail().

* Interface ini memastikan semua class yang mengimplementasikannya wajib punya cara untuk menampilkan detail objek.

* Misalnya, di class AlatMakeup, method tampilDetail() menampilkan informasi lengkap alat makeup sesuai data yang dimasukkan.

## Menerapkan Polymorphism (minimal menggunakan 1 Overloading dan 1 Overriding).

Polymorphism artinya satu method bisa memiliki banyak bentuk. Dalam program ini sudah ada 2 penerapan polymorphism, yaitu Overloading dan Overrding.

1. Overriding

<img width="449" height="174" alt="image" src="https://github.com/user-attachments/assets/9fadc30b-5f63-4a0f-94ba-0abeb34b0297" />

<img width="500" height="100" alt="image" src="https://github.com/user-attachments/assets/276fd76c-7980-4a76-bd31-71a9d340a98b" />

<img width="509" height="75" alt="image" src="https://github.com/user-attachments/assets/1163f86b-370d-4bfe-b8fc-d329fe1ca4e2" />

Di sini, Foundation dan Lipstick menimpa (override) method toString() untuk menambahkan atribut khusus (shade/warna). Hasilnya, output jadi lebih spesifik sesuai jenis makeup.

2. Overloading

<img width="1070" height="491" alt="image" src="https://github.com/user-attachments/assets/caa8bede-b91c-4b34-840f-d022f9e1878d" />

Overloading terjadi pada method cariKoleksi, di mana ada dua versi method dengan nama yang sama tetapi berbeda parameter. Versi pertama cariKoleksi() digunakan untuk meminta input keyword pencarian langsung dari pengguna lewat Scanner, sedangkan versi kedua cariKoleksi(String keyword) digunakan untuk melakukan pencarian berdasarkan keyword yang dikirim sebagai parameter. Hal ini menunjukkan konsep method overloading, yaitu penggunaan nama method yang sama dengan perbedaan jumlah atau tipe parameter.

# Penggunaan Program

<details>
<summary><h3>Menu Koleksi Alat Makeup</h3></summary>

<img width="318" height="178" alt="image" src="https://github.com/user-attachments/assets/0f447f12-3ad8-47d9-907e-63f4739b898e" />

Saat program pertama kali dijalankan, sistem akan langsung menampilkan menu utama yang berisi daftar pilihan menu. Pengguna diminta untuk memasukkan nomor menu sesuai dengan pilihan yang diinginkan. Setelah itu, program akan menjalankan perintah sesuai input pengguna dan kemudian kembali menampilkan menu utama, hingga pengguna memilih opsi Keluar untuk menghentikan program.

## 1. Tambah Koleksi

<img width="403" height="308" alt="image" src="https://github.com/user-attachments/assets/64260f4b-e4ca-4be4-b076-ea633ed55d63" />

Jika pengguna memilih opsi 1. Tambah Koleksi, maka program akan menampilkan pilihan jenis koleksi alat makeup yang tersedia, yaitu Alat Makeup Umum, Lipstick, dan Foundation.

<img width="502" height="414" alt="Screenshot 2025-09-22 193040" src="https://github.com/user-attachments/assets/e9b18c34-a335-4052-9868-035a143cd10c" />

Opsi 1. Alat Makeup Umum, program akan meminta input data berupa nama alat makeup, jenis alat, merk, dan jumlah. Data yang sudah dimasukkan akan disimpan ke dalam koleksi sesuai kategori yang dipilih. Setelah itu, program memberikan notifikasi bahwa koleksi berhasil ditambahkan.

<img width="474" height="246" alt="Screenshot 2025-09-22 194734" src="https://github.com/user-attachments/assets/7c5c0aed-5069-4048-bc9f-9959da13aa13" />

Opsi 2. Lipstick, maka program akan meminta pengguna untuk memasukkan beberapa data yang lebih spesifik, yaitu nama alat makeup, jenis alat makeup, merk, jumlah, serta warna lipstick. Setelah semua data dimasukkan dengan lengkap, program akan menyimpan data tersebut ke dalam koleksi kategori lipstick. Selanjutnya, program memberikan notifikasi bahwa koleksi lipstick berhasil ditambahkan.

<img width="488" height="236" alt="image" src="https://github.com/user-attachments/assets/ae716e14-b97c-421b-8722-c9f01fdba170" />

opsi 3. Foundation, maka program akan meminta pengguna untuk mengisi beberapa informasi penting, yaitu nama alat makeup, jenis alat makeup, merk, jumlah, serta shade foundation. Setelah data tersebut dimasukkan dengan benar, program akan menyimpannya ke dalam koleksi kategori foundation. Program kemudian menampilkan pesan bahwa koleksi foundation berhasil ditambahkan.

<img width="387" height="257" alt="image" src="https://github.com/user-attachments/assets/a0fb64c5-fb49-4dcc-920a-224b6e19b3d6" />

Saat pengguna diminta memasukkan Nama Alat Makeup, pengguna menekan enter tanpa mengetikkan apapun sehingga program akan menampilkan pesan "Nama tidak boleh kosong!" dan berlaku untuk memasukkan jenis makeup, merk, dan jumlah.

## 2. Lihat Koleksi

<img width="907" height="330" alt="image" src="https://github.com/user-attachments/assets/2a59c7ba-ce42-4f24-baec-a6787671d765" />

Jika pengguna memilih opsi 2. Lihat Koleksi, program akan menampilkan seluruh daftar alat makeup yang sudah tersimpan.

## 3. Ubah Koleksi

<img width="721" height="502" alt="image" src="https://github.com/user-attachments/assets/09e0ea09-786d-48f6-ad8e-98439884953b" />

Jika pengguna memilih opsi 3. Ubah Koleksi, maka program akan meminta nomor koleksi yang ingin diubah. Setelah itu, pengguna dapat memasukkan data baru untuk mengganti data lama. Setelah sudah memasukkan data baru, pengguna bisa mengecek kembali dengan opsi 2. Lihat Koleksi.

<img width="649" height="325" alt="image" src="https://github.com/user-attachments/assets/f171e1a5-256e-49fc-89fc-b6135c31b6fd" />

Apabila pengguna memasukkan nomor koleksi yang tidak tersedia, program akan menampilkan pesan "Nomor tidak valid!" sebagai bentuk validasi agar pengguna tidak bisa mengubah koleksi yang tidak ada.

## 4. Hapus Koleksi

<img width="658" height="563" alt="image" src="https://github.com/user-attachments/assets/7219cd8a-7727-4abd-96cb-1011147df63e" />

Jika pengguna memilih opsi 4. Hapus Koleksi, maka program akan meminta nomor koleksi yang ingin dihapus. Setelah itu, data koleksi akan dihapus dari daftar

<img width="689" height="340" alt="image" src="https://github.com/user-attachments/assets/fad4e55f-c038-4ad6-aef7-98e5e77b38f0" />

Apabila pengguna memasukkan nomor koleksi yang tidak tersedia, program akan menampilkan pesan "Nomor tidak valid!" sebagai bentuk validasi agar pengguna tidak bisa mengubah koleksi yang tidak ada.

## 5. Cari Koleksi

<img width="688" height="257" alt="image" src="https://github.com/user-attachments/assets/b1842f83-d03a-4824-b310-b656420faffd" />

Jika pengguna memilih opsi 5, maka program akan meminta kata kunci pencarian dari nama atau merk alat makeup. Setelah itu, program akan menampilkan daftar alat makeup yang sesuai kata kunci.

<img width="523" height="245" alt="image" src="https://github.com/user-attachments/assets/3b610936-5e2b-453e-b22d-616a7b452ed8" />

Apabila pengguna memasukkan kata kunci koleksi yang tidak tersedia, program akan menampilkan pesan "Koleksi tidak ditemukan!" sebagai bentuk validasi agar pengguna tidak bisa mengubah koleksi yang tidak ada.

## 6. Keluar

<img width="415" height="225" alt="image" src="https://github.com/user-attachments/assets/e3ed6f06-f3c8-4947-b2bc-315f2362d2a9" />

Jika pengguna memilih opsi 6, maka program telah selesai

