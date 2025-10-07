def calculate_total(items):
    x = 0
    for i in items:
        x += i['price']
    return x

def format_currency(amount):
    # 3
    return f"${amount:.2f}"
