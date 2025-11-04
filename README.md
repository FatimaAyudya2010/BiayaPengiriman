# Biaya Pengiriman #

# Deskripsi Program
Program BiayaPengiriman digunakan untuk menghitung total biaya pengiriman paket berdasarkan berat, jarak pengiriman, dan volume paket.
Program ini meminta pengguna untuk memasukkan data paket, lalu menghitung biaya sesuai dengan ketentuan yang telah ditentukan.

# Cara Kerja Program
> Input Data dari Pengguna
-Berat paket (dalam kilogram)
-Jarak pengiriman (dalam kilometer)
-Ukuran paket: panjang, lebar, dan tinggi (dalam sentimeter)
> Perhitungan Volume
volume = panjang × lebar × tinggi
> Penentuan Biaya per Kg
Jika jarak ≤ 10 km → biaya per kg = Rp 4.250
Jika jarak > 10 km → biaya per kg = Rp 6.000
> Perhitungan Biaya Dasar
biayaPengiriman = berat × biayaPerKg
> Tambahan Biaya Volume
Jika volume > 100 cm³ → biaya tambahan = Rp 50.000
Jika volume ≤ 100 cm³ → tidak ada biaya tambahan

# Output yang Ditampilkan
-Berat paket
-Jarak pengiriman
-Volume paket
-Biaya per kg
-Biaya tambahan volume (kalau ada)
-Total biaya pengiriman

# Contoh Input dan Output
> Input:
berat paket (kg): 3
jarak pengiriman (km): 15
panjang paket (cm): 20
lebar paket (cm): 10
tinggi paket (cm): 10
> Output:
berat paket: 3.0 kg
Jarak yang ditempuh: 15.0 km
volume paket: 2000.0 cm^3
Biaya per kg: 6000.0 kg
Biaya tambahan volume: Rp 50.000
Total biaya pengiriman: Rp 68.000

# Konsep yang Digunakan
-Input dan Output dengan Scanner
-Percabangan if-else untuk menentukan tarif dan tambahan biaya
-Operasi aritmetika dasar
-Output format teks dengan nilai variabel
<img width="1919" height="1007" alt="Screenshot 2025-11-03 193044" src="https://github.com/user-attachments/assets/ff774ef3-4cdb-4401-8521-ba562475f3a3" />
