<?php

function input($pesan) {
  echo $pesan;
  $input = trim(fgets(STDIN));
  return $input;
}

$a = input("Luas : ");
$b = input("Lebar : ");
$c = input("Tinggi :");
$Panjang = $a /( $b * 2);

echo "Panjang  balok = $Panjang";
?>
