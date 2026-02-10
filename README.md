# Tugas_Analisis_Design_Pattern_Domain_Kasus_E-Commerce_Kelompok_Perpusdimari_CCDP1

Analisis Design Pattern: Domain E-Commerce 🛒Kelompok Perpusdimari - CCDP1Proyek ini bertujuan untuk melakukan analisis dan implementasi berbagai Design Patterns pada domain sistem E-Commerce. Proyek ini merupakan bagian dari Tugas Besar mata kuliah Pattern-Oriented Software Design.🚀 Panduan Penggunaan Git & KolaborasiAgar kerja kelompok berjalan lancar tanpa conflict, berikut adalah panduan perintah Git yang perlu kita gunakan:1. Inisialisasi & RemoteJika kamu baru pertama kali mengambil proyek ini ke lokal:Bash

# Clone repositori
git clone https://github.com/RadityaNalendraU/Tugas_Analisis_Design_Pattern_Domain_Kasus_E-Commerce_Kelompok_Perpusdimari_CCDP1.git

# Masuk ke folder proyek
cd Tugas_Analisis_Design_Pattern_Domain_Kasus_E-Commerce_Kelompok_Perpusdimari_CCDP1
2. Manajemen Branch (PENTING!)Jangan langsung push ke branch main! Buatlah branch baru untuk setiap fitur atau pola yang kamu kerjakan.Bash# Membuat branch baru (Contoh: fitur-abstract-factory)
git checkout -b fitur/nama-pola-kamu

# Melihat daftar branch yang ada
git branch

# Berpindah antar branch
git checkout nama-branch
3. Mengambil Perubahan Terbaru (Pull)Sebelum mulai ngoding, pastikan kodemu adalah yang paling update dari pusat.Bash# Mengambil update dari branch main
git pull origin main
4. Menyimpan & Mengirim Perubahan (Push)Setelah selesai mengerjakan tugasmu:Bash# Menambahkan file yang diubah ke area staging
git add .

# Memberikan pesan commit (Jelas dan singkat)
git commit -m "Add: Implementasi Structural Pattern - Bridge untuk Sistem Pembayaran"

# Mengirim kode ke GitHub
git push origin fitur/nama-pola-kamu
🛠️ Daftar Design Pattern yang DianalisisBerdasarkan pembagian kelompok, berikut adalah pola yang diimplementasikan:KategoriDesign PatternAnggota Penanggung JawabCreationalTulis di siniNamaStructuralTulis di siniNamaBehavioralTulis di siniNama📁 Struktur Folder/src: Source code implementasi pola./docs: Laporan analisis, class diagram, dan hasil testing./assets: Gambar diagram atau screenshot hasil aplikasi.📝 Catatan PentingGunakan VS Code sebagai editor standar agar format kode konsisten.Pastikan setiap pola disertai dengan Class Diagram di folder /docs.Jika ada kendala merge conflict, segera kabari anggota tim lainnya di grup!
