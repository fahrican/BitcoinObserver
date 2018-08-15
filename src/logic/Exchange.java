package logic;

import callbacks.BitcoinObserver;
import callbacks.UpdateObserver;

import java.util.ArrayList;
import java.util.List;

public class Exchange implements BitcoinObserver {

    private int amount = 0;
    private int price = 0;
    private List<UpdateObserver> bitcoins;

    public Exchange() {
        this.bitcoins = new ArrayList<>();
    }

    @Override
    public void addObserver(UpdateObserver observer) {
        this.bitcoins.add(observer);
    }

    @Override
    public void removeObserver(UpdateObserver observer) {
        this.bitcoins.remove(observer);
    }

    @Override
    public void notifyObserver() {

        for (UpdateObserver bitcoin : bitcoins) {

            bitcoin.update(amount, price);
        }
    }

    public void setAmount(int amount) {
        this.amount = amount;
        notifyObserver();
    }

    public void setPrice(int price) {
        this.price = price;
        notifyObserver();
    }
}
