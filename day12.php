<?php
// Deklarasi variabel
$penghasilan = 13000000;
$tagihan_rumah = 4000000;
$biaya_anak = 3 * 1000000;
$biaya_istri = 4000000;
$tabungan_bulanan = 5000000;
$harga_pc = 150000000;


$tabungan_tahunan = $tabungan_bulanan * 12;

$jumlah_tahun = $harga_pc / $tabungan_tahunan;

// Cetak hasil
echo "Sambo harus menabung selama $jumlah_tahun tahun untuk bisa membeli PC gaming tersebut.";

?>
