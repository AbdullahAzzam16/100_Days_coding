<?php
$A = (int) readline("Masukkan angka awal : ");
$B = (int) readline("Masukkan angka akhir : ");

$jumlah = 0;

for ($i = $A; $i <= $B; $i++) {
    $jumlah += $i;
}

echo "Penjumlahan dari $A hingga $B = " . implode('+', range($A, $B)) . " = $jumlah\n";
?>
