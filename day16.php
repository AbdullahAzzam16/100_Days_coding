<?php
function input($pesan) {
  echo $pesan;
  $input = trim(fgets(STDIN));
  return $input;
}
// Percabangan switch
$hari = input("Hari :");

switch ($hari) {
    case "senin":
        echo "Hari ini adalah hari senin";
        break;
    case "selasa":
        echo "Hari ini adalah hari selasa";
        break;
    case "rabu":
        echo "Hari ini adalah hari rabu";
        break;
    default:
        echo "Hari ini adalah hari lain";
}

?>
