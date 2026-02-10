🏁 Panduan Kerja Kolaborasi: GitHub + VS Code + Git
Pastikan kamu sudah menginstal Git di komputer masing-masing. Jika belum, unduh di git-scm.com.

1. Inisialisasi Repositori (Dilakukan oleh Ketua Kelompok)
Cukup satu orang yang membuat "rumah" proyek di GitHub:

Buka GitHub dan buat New Repository.

Beri nama (contoh: TugasBesar-DesignPattern).

Pilih Public dan centang Add a README file.

Klik Create repository.

Masuk ke menu Settings > Collaborators dan undang 3 temanmu menggunakan username GitHub mereka.

2. Menghubungkan GitHub ke Komputer (Clone)
Setelah diundang, setiap anggota (termasuk kamu) melakukan ini:

Buka halaman GitHub proyek tersebut.

Klik tombol hijau Code, lalu salin link HTTPS-nya.

Buka VS Code di komputermu.

Buka Terminal di VS Code (Ctrl + atauTerminal > New Terminal`).

Ketik perintah berikut dan tekan Enter:


git clone https://github.com/username/TugasBesar-DesignPattern.git
Masuk ke folder tersebut: cd TugasBesar-DesignPattern.

Buka folder di VS Code: code . -r.

3. Alur Kerja Harian (Siklus Kerja Git)
Agar kode antar anggota tidak tertukar atau hilang, gunakan alur Add-Commit-Push.

Step 1: Ambil update terbaru (PENTING!)
Sebelum mulai menulis kode, pastikan kamu mengambil perubahan terbaru yang mungkin sudah diupload temanmu:

git pull origin main

Step 2: Buat Folder & Tulis Kode
Sesuai tugasmu (Anggota 3), buatlah folder:

src/creational/prototype/

src/structural/composite/

src/behavioral/state/

Step 3: Simpan Perubahan ke GitHub
Setelah koding selesai, lakukan "setoran" ke GitHub dengan 3 perintah sakti ini:

Marking file (menandai file mana saja yang mau dikirim):

git add .
Beri Label (menjelaskan apa yang kamu kerjakan):

git commit -m "Anggota 3: Menambahkan implementasi State Pattern untuk Order"
Kirim ke Server:

git push origin main

4. Tips Kerja Tanpa Framework di VS Code

Karena kamu tidak pakai framework, kamu mungkin butuh menjalankan Java atau Python langsung.

Java: Instal ekstensi "Extension Pack for Java" di VS Code. Kamu cukup klik tombol "Run" di atas method public static void main.

Diagram Mermaid: Instal ekstensi "Mermaid Editor" agar kamu bisa melihat preview diagram yang kamu buat sebelum di-copy ke laporan.

5. Cara Menghindari "Conflict"

Conflict terjadi jika dua orang mengedit file yang sama di baris yang sama.

Solusi Terbaik: Karena folder sudah dibagi per anggota (seperti skema folder yang saya buat sebelumnya), jangan pernah menyentuh folder milik anggota lain.

Jika Anggota 3 hanya bekerja di foldernya sendiri, conflict hampir tidak mungkin terjadi.

Template Struktur README untuk GitHub Kalian
Kamu bisa copy-paste ini ke file README.md di GitHub agar terlihat keren:

Markdown
# 🛒 Analisis Design Pattern - E-Commerce System

Tugas Besar Mata Kuliah Design Pattern. Analisis dan implementasi 12 Design Pattern pada domain E-Commerce tanpa framework.

## 👥 Kelompok
- Member 1 (NIM) - Singleton, Adapter, Strategy
- Member 2 (NIM) - Builder, Decorator, Observer
- Member 3 (NIM) - Prototype, Composite, State
- Member 4 (NIM) - Abstract Factory, Facade, Chain of Responsibility

## 📂 Struktur Folder
Diorganisir berdasarkan jenis pattern untuk memudahkan pengecekan.

## 🚀 Cara Menjalankan (Java)
1. Masuk ke folder pattern: `cd src/behavioral/state`
2. Compile: `javac *.java`
3. Run: `java StateDemo`