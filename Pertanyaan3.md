1. Tidak sesuai
2. Bagian yang harus diperbaiki:
-Bagian yang Error:
Inisialisasi variabel i
Kode sekarang: int i = 0;
Masalah: Dimulai dari 0, sehingga baris pertama kosong (tidak ada bintang)
-Kondisi loop i
Kode sekarang: while (i <= N)
Masalah: Menghasilkan 6 baris (0,1,2,3,4,5) padahal seharusnya 5 baris
-Yang Diubah:
int i = 0; → int i = 1;
-Alasan:
Dengan i = 1, loop pertama akan langsung mencetak 1 bintang (bukan baris kosong)
Loop berjalan dari 1 sampai 5, menghasilkan 5 baris dengan pola yang benar