<?php

$jumlahHariKerja = 0;
$tanggal = "";
$bulan = "";
$tahun = "";

// Input tanggal
echo "Tanggal: ";
$tanggal = trim(fgets(STDIN));

// Input bulan
echo "Bulan: ";
$bulan = trim(fgets(STDIN));

// Input tahun
echo "Tahun: ";
$tahun = trim(fgets(STDIN));

switch ($bulan) {
  case "1":
  case "3":
  case "5":
  case "7":
  case "8":
  case "10":
  case "12":
    $jumlahHariBekerja = 22;
    break;
  case "4":
  case "6":
  case "9":
  case "11":
    $jumlahHariBekerja = 21;
    break;
  case "2":
    if ($tahun % 4 == 0) {
      $jumlahHariBekerja = 23;
    } else {
      $jumlahHariBekerja = 21;
    }
    break;
}

for ($i = 1; $i <= $jumlahHariBekerja; $i++) {
  if ($i % 7 != 0 && $i != 1) {
    $jumlahHariKerja++;
  }
}

echo "Jumlah hari kerja dalam bulan $bulan-$tahun adalah $jumlahHariKerja";

?>
