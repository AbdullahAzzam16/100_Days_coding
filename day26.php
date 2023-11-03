<?php
function tampilkanRentang($a, $b) {
    $start = min($a, $b);
    $end = max($a, $b);

    if ($a < $b) {
        for ($i = $start; $i <= $end; $i++) {
            echo $i . " ";
        }
    } else {
        for ($i = $end; $i <= $start; $i++) {
            echo $i . " ";
        }
    }
}


echo "Masukkan angka pertama : ";
$a = trim(fgets(STDIN));

echo "Masukkan angka kedua: ";
$b = trim(fgets(STDIN));


tampilkanRentang($a, $b);
?>
