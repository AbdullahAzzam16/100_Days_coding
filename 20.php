<?php

$batas = "";

echo "Batas angka : ";
$batas = trim(fgets(STDIN));

// Perulangan
for ($i = 1; $i <= $batas; $i++) {
  // Menampilkan angka
  echo $i . "\n";
}
?>