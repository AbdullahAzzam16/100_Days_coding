<?php
class Manusia {

    public $nama;
    public $umur;

    public function __construct($nama, $umur) {
        $this->nama = $nama;
        $this->umur = $umur;
    }

    public function perkenalkanDiri() {
        echo "Halo, nama saya $this->nama. Saya berusia $this->umur bebrapa tahun lalu.";
    }
}

$budi = new Manusia("Azzam", 15);
$budi->perkenalkanDiri();

?>