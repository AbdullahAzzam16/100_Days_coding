<?php
$batas1 = "";
$batas2 = "";

// Inputan pertama
echo "Batas angka pertama: ";
$batas1 = trim(fgets(STDIN));

// Inputan kedua
echo "Batas angka kedua: ";
$batas2 = trim(fgets(STDIN));

// Perulangan for pertama
for ($i = 1; $i <= $batas1; $i++) {
  // Perulangan for kedua
  for ($j = 1; $j <= $batas2; $j++) {
    // Menampilkan 
    echo $i . " " . $j . "\n";
  }
}
?>