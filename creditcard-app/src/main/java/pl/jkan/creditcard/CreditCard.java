package pl.jkan.creditcard;

class CreditCard {
    private boolean blocked = false;
    private double balance = 0;
    private double cardLimit = 0;

    public void block(){
        this.blocked = true;
    }

    public boolean isBlocked(){
        return blocked;
    }
    public double getLimit() {
        return 2000;
    }

    public void assignLimit(double limit){
        this.balance = limit;
        this.cardLimit = limit;
    }

    public double getCountBalance(){
        return balance;
    }

    public void withdraw(double money){
        this.balance = this.balance - money;
    }
}