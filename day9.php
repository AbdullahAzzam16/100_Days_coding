<?php

function input($pesan) {
  echo $pesan;
  $input = trim(fgets(STDIN));
  return $input;
}

$a = input("Angka pertama: ");

$b = input("Angka kedua: ");


$jumlah = $a + $b;

echo "Hasil  tambah = $jumlah";
?>
