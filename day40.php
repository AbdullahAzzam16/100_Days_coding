<?php
$nama = "";

do {
    echo "Nama saya : ";
    $nama = trim(fgets(STDIN));

    if ($nama == "Azzam") {
        break;
    }
} while (true);

echo "Yo, $nama!";
?>
