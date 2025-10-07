"""
Payment processing module
"""

def process_payment(amount, user_id):
    """
    Process payment for a user
    """
    result = charge_credit_card(amount, user_id)
    
    update_user_balance(user_id, amount)
    
    return result

def charge_credit_card(amount, user_id):
    if amount <= 0:
        raise ValueError("Amount must be positive")
    
    return {"status": "success", "transaction_id": "12345"}

def update_user_balance(user_id, amount):
    pass
