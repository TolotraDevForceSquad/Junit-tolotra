package fr.emse.test;

public class Money implements IMoney {
	private int fAmount;
	private String fCurrency;
	public Money(int amount, String currency) {
		fAmount = amount;
		fCurrency = currency;
	}
	public int amount() {
		return fAmount;
	}
	public String currency() {
		return fCurrency;
	}
	
	public IMoney add(Money m) {
		if (m.currency().equals(currency()))
		return new Money(amount() + m.amount(), currency());
		return new MoneyBag(this, m);
	}

	
	public boolean equals(Object obj) {
        if (this == obj) 
        	return true;
        if (obj == null || getClass() != obj.getClass()) 
        	return false;
        Money money = (Money) obj;
        return fAmount == money.fAmount && fCurrency.equals(money.fCurrency);
    }
	@Override
	public IMoney add(IMoney aMoney) {
		// TODO Auto-generated method stub
		return null;
	}
}
