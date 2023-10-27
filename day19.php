<?php
$input = "";
$perulangan = "";

// inputan
echo "Nama : ";
$input = trim(fgets(STDIN));

// jumlah perulangan
echo "Jumlah perulangan: ";
$perulangan = trim(fgets(STDIN));


for ($i = 0; $i < $perulangan; $i++) {
  // Menampilkan inputan
  echo $input . "\n";
}
?>