<?php
function input($pesan) {
  echo $pesan;
  $input = trim(fgets(STDIN));
  return $input;
}

$nilai = input("Nilai : ");

if ($nilai > 5) {
    echo "Nilai lebih dari 5";
} else {
    echo "Nilai kurang dari atau sama dengan 5";
}
?>