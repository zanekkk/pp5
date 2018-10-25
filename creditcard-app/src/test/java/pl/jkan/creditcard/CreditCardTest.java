package pl.jkan.creditcard;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardTest {
    
    @Test
    public void assignCreditLimitToCard() {
        CreditCard card = new CreditCard();
        
        card.assignLimit(2000);
        
        Assert.assertTrue(card.getLimit() == 2000);
    }


    @Test
    public void canBlockCreditCard(){
        CreditCard creditcard = new CreditCard();
        creditcard.assignLimit(2000);

        creditcard.block();
        Assert.assertTrue(creditcard.isBlocked());
    }

    @Test
    public void withdrawedDecreaseAwolableFounds(){
        CreditCard creditcard = new CreditCard();
        creditcard.assignLimit(2000);
        creditcard.withdraw(1000);
        Assert.assertTrue(creditcard.getCountBalance() == 1000);
    }
}