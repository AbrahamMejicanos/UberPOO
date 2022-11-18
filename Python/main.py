from car import Car
from account import Account

if __name__ == "__main__":
    car = Car("AMJ123", Account("Abraham Mejicanos", "3020 71865 0101"))
    print(vars(car))
    print(vars(car.driver))
