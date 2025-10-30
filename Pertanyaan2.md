1. Jika inisialisasi iOuter = 1 diubah menjadi iOuter = 0, apa akibatnya? Mengapa bisa demikian?
 Akibatnya:
Program akan mencetak baris bintang lebih banyak satu.
Penjelasan:
Loop for (int iOuter = 0; iOuter <= N; iOuter++) dimulai dari 0 dan berhenti saat iOuter = N, sehingga jumlah perulangannya menjadi N + 1 kali (karena menghitung dari 0 sampai N).
2. Jika inisialisasi i = 1 diubah menjadi i = 0, apa akibatnya? Mengapa bisa demikian?
Akibatnya:
Program akan mencetak kolom bintang lebih banyak satu pada setiap baris.
Penjelasan:
Loop for (int i = 0; i <= N; i++) berjalan N + 1 kali (dari 0 sampai N), sehingga menambah satu bintang lagi di setiap baris.
3. Apa perbedaan kegunaan antara perulangan luar dengan perulangan dalam?
Jawaban:
-Perulangan luar (outer loop) berfungsi untuk mengatur jumlah baris bintang yang akan dicetak.
-Perulangan dalam (inner loop) berfungsi untuk mengatur jumlah bintang dalam satu baris (kolom)
4. Mengapa perlu ditambahkan System.out.println(); di bawah perulangan dalam? Apa akibatnya jika dihapus?
Jawaban:
Baris System.out.println(); berfungsi untuk pindah ke baris berikutnya setelah satu baris bintang selesai dicetak.
-Jika dihapus, maka semua bintang akan dicetak dalam satu baris panjang tanpa berpindah ke baris baru.
