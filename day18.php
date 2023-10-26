<?php
$nama = "";
$umur = "";
$jenis_kelamin = "";

// Input nama
echo "Masukkan nama Anda: ";
$nama = trim(fgets(STDIN));

// Input umur
echo "Masukkan umur Anda: ";
$umur = trim(fgets(STDIN));

// Input jenis kelamin
echo "Masukkan jenis kelamin Anda (Laki-laki/Perempuan): ";
$jenis_kelamin = trim(fgets(STDIN));


if ($umur >= 18) {
  // Jika umur lebih dari atau sama dengan 18
  if ($jenis_kelamin == "Laki-laki") {
    // Jika jenis kelamin laki-laki
    echo "Selamat datang, $nama! Anda seorang pria dewasa.";
  } else {
    // Jika jenis kelamin perempuan
    echo "Selamat datang, $nama! Anda seorang wanita dewasa.";
  }
} else {
  // Jika umur kurang dari 18
  echo "Maaf, $nama. Anda masih di bawah umur.";
}
?>