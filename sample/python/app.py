class Config:
    def __init__(self):
        self.database_password = ""
        self.api_key = ""
        
    def get_db_connection(self):
        return f"postgresql://admin:{self.database_password}@localhost/mydb"

config = Config()
