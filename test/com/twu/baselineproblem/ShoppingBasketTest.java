package com.twu.baselineproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingBasketTest {

    @Test
    public void shouldHaveAtleastTwoItemsInIt() {
        Items[] itemsList=new Items[2];
        ShoppingBasket shoppingBasket=new ShoppingBasket(itemsList);

        assertEquals(2,shoppingBasket.containsItems());
    }

}
