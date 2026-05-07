/*
**    KALC POS  - Open Source Point of Sale
**
**    Copyright (c) 2015-2023 KALC Corporation   
**
**    http://kalcapps.com/enterprise
**   
**    (at your option) any later version.
**
**    KALC POS is distributed under proprietary license.
**    but WITHOUT ANY WARRANTY; without even the implied warranty of
**    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
**
**
*/


package uk.kalc.pos.ticket;

public enum TicketType {
    
    NORMAL(0),
    REFUND(1),
    PAYMENT(2),
    NOSALE(3),
    INVOICE(4);

    int id;
    
    TicketType(int _id)
    {
        this.id = _id;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public static TicketType get(int _id)
    {
        TicketType ret = NORMAL;
        for (TicketType type : values()) {
            if (type.getId() == _id) {
                ret = type;
                break;
            }
        }
        return ret;
    }
}