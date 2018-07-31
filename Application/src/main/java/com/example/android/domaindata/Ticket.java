package com.example.android.domaindata;

import java.util.Date;

public class Ticket {
    private boolean active;
    private String type;
    private Date validatedDate;
    private int timeLeft;

    public Ticket(boolean active, String type, Date validatedDate, int timeLeft) {
        this.active = active;
        this.type = type;
        this.validatedDate = validatedDate;
        this.timeLeft = timeLeft;
    }
}
