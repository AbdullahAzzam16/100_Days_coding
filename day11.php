<?php

function input($pesan) {
  echo $pesan;
  $input = trim(fgets(STDIN));
  return $input;
}

$a = input("Tinggi : ");
$b = input("Alas : ");

$Luas = $a * $b /2;

echo "Luas segitiga = $Luas";
?>
