<?php
$nilai = "";

echo "Masukkan nilai: ";
$nilai = trim(fgets(STDIN));

if ($nilai >= 0) {
  // Perulangan
  for ($i = 1; $i <= $nilai; $i++) {
    // Menampilkan angka
    echo $i . "\n";
  }
} else {
  echo "Nilai harus >= 0";
}
?>