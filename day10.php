<?php

function input($pesan) {
  echo $pesan;
  $input = trim(fgets(STDIN));
  return $input;
}

$a = input("Harga barang : ");

$b = input("Jumlah barang : ");


$total = $a * $b;

echo "Total harga = $total";
?>
