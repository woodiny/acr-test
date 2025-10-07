package com.example.app;

/**
 * Payment processing service
 */
public class PaymentProcessor {
    
    public boolean processPayment(double amount, String userId) {
        validateAmount(amount);
        
        boolean result = chargeCard(amount, userId);
        
        updateUserBalance(userId, amount);
        
        return result;
    }
    
    private void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }
    
    private boolean chargeCard(double amount, String userId) {
        // Simulated payment processing
        return true;
    }
    
    private void updateUserBalance(String userId, double amount) {
        
    }
}
