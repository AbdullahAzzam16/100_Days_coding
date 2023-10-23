<?php
function input($pesan) {
  echo $pesan;
  $input = trim(fgets(STDIN));
  return $input;
}

$umur = input("Umur anda : ");

if ($umur < 15) {
    echo "Anda masih di bawah umur";
} else if ($umur >= 15 && $umur < 20) {
    echo "Anda adalah seorang remaja";
} else {
    echo "Anda adalah seorang dewasa";
}

?>