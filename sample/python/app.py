class Config:
    def __init__(self):
        self.database_password = "admin123"
        self.api_key = "AKIAIOSFODNN7EXAMPLE"
        
    def get_db_connection(self):
        return f"postgresql://admin:{self.database_password}@localhost/mydb"

config = Config()
