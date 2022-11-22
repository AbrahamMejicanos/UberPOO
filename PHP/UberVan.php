<?php
require_once("Car.php");
    class UberVan extends Car{
        private $typeCarAccepted;
        private $seatsMaterial;

        public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial)
        {
            parent::__construct($license, $driver);
            $this->typeCarAccepted = $typeCarAccepted;
            $this->seatsMaterial = $seatsMaterial;
        }

        public function setPassenger($passengers)
        {
            if($passengers >=1 && $passengers <= 6){
                $this->passengers = $passengers;
            }else{
                echo "Necesias asignar unicamente de 1 a 6 pasajeros";
            }            
        }
    }
?>