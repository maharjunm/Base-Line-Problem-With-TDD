package com.twu.baselineproblem;


public class ShoppingBasket {

    private Item[] itemsList;

    public ShoppingBasket(Item[] itemList) {
        this.itemsList=itemList;
    }

    public int containsItems() {
        return itemsList.length;
    }

    public boolean isValidItem() {
        return false;
    }
}
