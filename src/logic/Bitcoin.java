package logic;

import callbacks.BitcoinObserver;
import callbacks.UpdateObserver;

public class Bitcoin implements UpdateObserver {

    private int amount = 0;
    private int price = 0;
    BitcoinObserver bitcoinObserver;

    public Bitcoin(BitcoinObserver bitcoinObserver) {

        this.bitcoinObserver = bitcoinObserver;
        this.bitcoinObserver.addObserver(this);
    }

    @Override
    public void update(int amount, int price) {

        this.amount = amount;
        this.price = price;
        printUpdate();
    }

    private void printUpdate(){
        System.out.println("Amount: " + this.amount + ", Price: " + this.price);
    }

}
