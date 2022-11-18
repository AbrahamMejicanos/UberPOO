<?php
    require_once("Car.php");
    require_once("Account.php");

    $car = new Car("AMJ02E", new Account("Abraham Mejicanos", "3020 71865 0101"));
    $car->PrintDataCar();
?>