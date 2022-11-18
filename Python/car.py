from account import Account

class Car:
    id = int
    passenger = int
    license = str
    driver = Account("", "")

    def __init__(self, license, driver):
        self.license = license
        self.driver = driver