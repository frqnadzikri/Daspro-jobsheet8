1.  Jika inisialisasi i = 1 diubah menjadi i = 0, apa akibatnya?
Akibat:
Program akan mencetak 1 bintang lebih banyak dari seharusnya.
Penjelasan:
Karena perulangan dimulai dari i = 0 dan berjalan hingga i <= N, maka total perulangan menjadi N + 1 kali (karena menghitung dari 0 sampai N).
2. Jika kondisi i <= N diubah menjadi i > N, apa akibatnya?
Akibat:
Program tidak menampilkan apa-apa.
Penjelasan:
Kondisi i > N langsung salah (false) saat pertama kali dicek (karena i dimulai dari 1 yang tidak lebih besar dari N).
3. Jika step i++ diubah menjadi i--, apa akibatnya?
Akibat:
Program akan berjalan tanpa henti (infinite loop).
Penjelasan:
Karena nilai i justru berkurang terus (i--) sementara kondisi i <= N tetap benar, maka i tidak akan pernah lebih besar dari N.