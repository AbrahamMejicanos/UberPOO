<?php
require_once("Car.php");
    class UberPool extends Car{
        private $brand;
        private $model;

        public function __construct($license, $driver, $brand, $model)
        {
            parent::__construct($license, $driver);
            $this->brand = $brand;
            $this->model = $model;
        }
    }
?>