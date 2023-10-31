<?php

$hari = "";
$tanggal = "";
$bulan = "";
$tahun = "";

echo "Masukkan tanggal: ";
$tanggal = trim(fgets(STDIN));

echo "Masukkan bulan: ";
$bulan = trim(fgets(STDIN));

switch ($bulan) {
  case "1":
  case "3":
  case "5":
  case "7":
  case "8":
  case "10":
  case "12":
    $jumlah_hari = 31;
    break;
  case "4":
  case "6":
  case "9":
  case "11":
    $jumlah_hari = 30;
    break;
}

if ($tanggal <= $jumlah_hari) {
  $hari = "Senin";
} else if ($tanggal <= $jumlah_hari * 2) {
  $hari = "Selasa";
} else if ($tanggal <= $jumlah_hari * 3) {
  $hari = "Rabu";
} else if ($tanggal <= $jumlah_hari * 4) {
  $hari = "Kamis";
} else if ($tanggal <= $jumlah_hari * 5) {
  $hari = "Jumat";
} else if ($tanggal <= $jumlah_hari * 6) {
  $hari = "Sabtu";
} else {
  $hari = "Minggu";
}

echo "Tanggal $tanggal-$bulan adalah hari $hari";

?>
