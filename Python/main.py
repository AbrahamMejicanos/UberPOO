from car import Car
from account import Account
from uberX import UberX

if __name__ == "__main__":
    uber = UberX("AMJ123", Account("Abraham Mejicanos", "3020 71865 0101"), "Kia", "Rio")
    print(vars(uber))
    print(vars(uber.driver))
