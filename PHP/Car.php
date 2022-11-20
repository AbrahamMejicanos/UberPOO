<?php
    class Car{
        private $id, $driver, $passenger;

        public function __construct($licence, $driver)
        {
            $this->license = $licence;
            $this->driver = $driver;
        }

        public function PrintDataCar(){
            echo "License: {$this->license},
            Driver Name: {$this->driver->name},
            Driver Document: {$this->driver->document}";
        }
    }
?>