package com.example.producer;

import org.junit.Assert;
import org.junit.Test;

public class ReservationTest {

    @Test
    public void create() {
        Reservation reservation = new Reservation(1, "derek");

        Assert.assertEquals((Integer)1, reservation.getId());
    }
}
