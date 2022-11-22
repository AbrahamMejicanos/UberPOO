<?php
    class Car{
        private $id, $driver, $license;
        protected $passengers;

        public function __construct($licence, $driver)
        {
            $this->license = $licence;
            $this->driver = $driver;
        }

        public function PrintDataCar(){
            echo "License: {$this->license},
            Driver Name: {$this->driver->_getName()},
            Driver Document: {$this->driver->_getDocument()}";
        }

        public function getPassenger(){
            return $this->passenger;
        }

        public function setPassenger($passengers){
            if($passengers >=1 && $passengers <= 4){
                $this->passengers = $passengers;
            }else{
                echo "Necesias asignar unicamente de 1 a 4 pasajeros";
            }
        }
    }
?>