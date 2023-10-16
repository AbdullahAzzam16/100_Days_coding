<?php

// Fungsi untuk menerima input
function input($pesan) {
  echo $pesan;
  $input = trim(fgets(STDIN));
  return $input;
}

$gaji_lembur = 55000;
$pajak = 0.15;
// Input gaji dan lama lembur
$gaji_pokok = input("Gaji pokok: ");

$lama_lembur = input("Lama lembur : ");

// Hitung gaji lembur
$gaji_lembur = intval($lama_lembur) * $gaji_lembur;

// Hitung gaji kotor
$gaji_kotor = intval($gaji_pokok) + $gaji_lembur;
echo "Gaji kotor = Rp. $gaji_kotor";

// Hitung potongan pajak
$potongan_pajak = $gaji_kotor * $pajak;
echo "Potongan = Rp. $potongan_pajak";

// Hitung gaji bersih
$gaji_bersih = $gaji_kotor - $potongan_pajak;

// Hasil
echo "Gaji bersih = Rp. $gaji_bersih";
?>
