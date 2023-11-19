<?php
$inputan = readline("Masukkan angka: ");
if ($inputan % 3 == 0 && $inputan % 2 == 0) {
    echo "Angka $inputan habis dibagi 3 dan 2.";
} else {
    echo "Angka $inputan tidak habis dibagi 3 dan 2.";
}
?>