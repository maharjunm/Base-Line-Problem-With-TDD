package com.twu.baselineproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class BillProducerTest {

    @Test
    public void shouldHaveTotalAmountAsZeroWithoutAnyItems() {
        Item[] itemsList={};
        ShoppingBasket shoppingBasket=new ShoppingBasket(itemsList);
        BillProducer billProducer=new BillProducer(shoppingBasket);

        assertEquals(0.0, billProducer.getTotalPrice(), 0.2d);
    }
}
