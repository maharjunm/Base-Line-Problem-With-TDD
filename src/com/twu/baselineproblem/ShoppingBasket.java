package com.twu.baselineproblem;


public class ShoppingBasket {

    private Items[] itemsList;

    public ShoppingBasket(Items[] itemList) {
        this.itemsList=itemList;
    }

    public int containsItems() {
        return itemsList.length;
    }
}
