<?php
    class UberX extends Car{
        private $brand;
        private $model;

        public function __construct($license, $driver, $brand, $model)
        {
            parent::__construct($license, $driver);
            $this->license = $license;
            $this->driver = $driver;
        }
    }
?>