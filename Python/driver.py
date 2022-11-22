from account import Account

class driver(Account):
    def __init__(self, name, document, email, password):
        super().__init__(name, document, email, password)