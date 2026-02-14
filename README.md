# 🛒 Analisis Design Pattern - E-Commerce Marketplace System

Proyek ini merupakan implementasi dan analisis mendalam terhadap **12 Design Pattern** yang diterapkan pada domain kasus **E-Commerce**. Proyek ini dikembangkan menggunakan **Pure Java** tanpa bantuan framework untuk menunjukkan pemahaman fundamental terhadap arsitektur perangkat lunak yang *scalable*, *maintainable*, dan *flexible*.

---

## 📝 Deskripsi Domain Kasus
Sistem yang dikembangkan mensimulasikan ekosistem **Marketplace digital**. Fokus utama analisis mencakup:
* **Manajemen Katalog**: Pengelolaan hirarki kategori dan efisiensi pembuatan varian produk.
* **Sistem Transaksi**: Integrasi pembayaran pihak ketiga (Payment Gateway) dan manajemen status pesanan.
* **Logika Bisnis**: Penerapan strategi diskon yang dinamis dan sistem pemberitahuan stok atau promo kepada pelanggan.

---

## 👥 Struktur Kelompok & Pembagian Pattern
Proyek ini dikerjakan oleh **Kelompok Perpusdimari (CCDP-1)** dengan pembagian tanggung jawab sebagai berikut:

| Anggota | NIM | Pattern yang Diimplementasikan |
| :--- | :--- | :--- |
| **Raditya Nalendra Utomo**  | 10122119 | Prototype, Composite, State |
| **Salman Faris Alhaitami**  | 10122145 | Singleton, Adapter, Strategy  |
| **Muhammad Febriansyah**    | 10122152 | Abstract Factory, Facade, Chain of Responsibility |
| **Salem Abdulah Al Oraifi** | 10122153 | Builder, Decorator, Observer |

---

## 🛠️ Design Pattern yang Diimplementasikan

### 1. Creational Patterns (Inisialisasi Objek)
* **Singleton**: Menjamin hanya ada satu instance untuk manajemen koneksi database e-commerce.
* **Builder**: Mempermudah pembuatan objek Produk yang memiliki banyak atribut opsional.
* **Prototype**: Efisiensi pembuatan varian produk (warna/ukuran) melalui kloning objek master.
* **Abstract Factory**: Menyediakan interface untuk menciptakan keluarga objek (misal: UI Theme Marketplace).

### 2. Structural Patterns (Struktur & Hubungan Objek)
* **Adapter**: Menghubungkan sistem internal dengan API Payment Gateway pihak ketiga (misal: Midtrans).
* **Decorator**: Menambahkan fitur tambahan pada produk (misal: bungkus kado atau asuransi) secara dinamis.
* **Composite**: Mengelola hirarki katalog dari Kategori Utama, Sub-Kategori, hingga Produk Tunggal.
* **Facade**: Menyederhanakan alur proses Checkout yang kompleks menjadi satu interface sederhana.

### 3. Behavioral Patterns (Interaksi & Tanggung Jawab)
* **Strategy**: Menerapkan berbagai metode perhitungan diskon (Member, Promo Musiman, Flash Sale).
* **Observer**: Mengirim notifikasi otomatis kepada pelanggan saat stok barang tersedia atau ada promo.
* **State**: Mengelola transisi status pesanan (Pending -> Paid -> Shipped) secara terenkapsulasi.
* **Chain of Responsibility**: Menangani alur validasi pesanan (Cek Stok -> Cek Saldo -> Validasi Alamat).

---

## 📂 Struktur Proyek
```text
📦 TugasBesar-DesignPattern
 ┣ 📂 docs                   # Laporan PDF & Diagram Mermaid (PNG)
 ┣ 📂 src                    # Kode Sumber Utama Java
 ┃ ┣ 📂 creational           # Singleton, Builder, Prototype, Abstract Factory
 ┃ ┣ 📂 structural           # Adapter, Decorator, Composite, Facade
 ┃ ┗ 📂 behavioral           # Strategy, Observer, State, Chain of Responsibility
 ┗ 📜 README.md              # Dokumentasi Proyek