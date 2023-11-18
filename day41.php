<?php

$angka_awal = "";
$angka_akhir = "";

echo "Masukkan angka awal: ";
$angka_awal = trim(fgets(STDIN));

echo "Masukkan angka akhir: ";
$angka_akhir = trim(fgets(STDIN));

if ($angka_awal > $angka_akhir) {
    echo "Angka awal tidak boleh lebih besar dari angka akhir!";
    exit;
}

$hasil = "";

for ($i = $angka_awal; $i <= $angka_akhir; $i++) {
    if ($i % 3 == 0) {
        $hasil .= $i . "\n";
    }
}

echo "Angka yang habis di bagi 3 : " . $hasil;
?>
