<?php
    require_once("Car.php");
    require_once("Account.php");
    require_once("UberX.php");

    $car = new UberX("AMJ02E", new Account("Abraham Mejicanos", "3020 71865 0101"), "Toyota", "Yaris");
    $car->PrintDataCar();
?>