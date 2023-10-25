<?php
$nama = "";
$umur = "";

// Input 
echo "Nama Anda: ";
$nama = trim(fgets(STDIN));

// Input 
echo "Umur Anda: ";
$umur = trim(fgets(STDIN));


if ($umur >= 18) {
  // Jika umur lebih dari atau sama dengan 18
  echo "Selamat datang, $nama! Anda sudah dewasa.";
} else {
  // Jika umur kurang dari 18
  echo "Maaf, $nama. Anda masih di bawah umur.";
}

?>