package com.twu.baselineproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingBasketTest {

    @Test
    public void shouldHaveAtleastTwoItemsInIt() {
        Item[] itemsList=new Item[2];
        ShoppingBasket shoppingBasket=new ShoppingBasket(itemsList);

        assertEquals(2,shoppingBasket.containsItems());
    }

    @Test
    public void shouldAcceptOnlyItems() {
        Item item1=null;
        Item[] itemsList={item1};
        ShoppingBasket shoppingBasket=new ShoppingBasket(itemsList);

        assertFalse(shoppingBasket.isValidItem());
    }

}
