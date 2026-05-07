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


package uk.kalc.pos.loyalty;

import uk.kalc.pos.ticket.TicketInfo;

/**
 *
 * @author John
 */
public class CollectItemLoyaltyPoints extends CollectLoyaltyPoints {

    private Integer pointsRedeemed = 0;

    public CollectItemLoyaltyPoints(String cardNumber) {
        super(cardNumber);
    }

    @Override
    public void processTicketPoints(String cardNumber, TicketInfo ticket) {
        ticketBalance = 0;
        pointsRedeemed = 0;       
        ticket.getLines().forEach((line) -> {
            if (line.getProperty("redeemed_points") != null) {
                pointsRedeemed += Integer.valueOf(line.getProperty("redeemed_points"));
            } else if (line.getPrice() != 0.00) {
                Double qty = line.getMultiply();
                ticketBalance += (line.getItemEarnValue() * qty.intValue());
            }

        });

        if (ticketBalance != 0) {
            addTransaction(cardNumber + " : " + ticketBalance + " Points added to the loyalty card. Receipt - " + ticket.printId(), ticketBalance, ticket);
        }

        if (pointsRedeemed != 0) {
            addTransaction(cardNumber + " : " + pointsRedeemed + " Points redeemed from loyalty card. Receipt - " + ticket.printId(), -pointsRedeemed, ticket);
        }
    }

    @Override
    public Integer getRedeemedPoints(String cardNumber, TicketInfo ticket) {
        ticketBalance = 0;
        pointsRedeemed = 0;
        ticket.getLines().forEach((line) -> {
            if (line.getProperty("redeemed_points") != null) {
                pointsRedeemed += Integer.valueOf(line.getProperty("redeemed_points"));
            } else if (line.getPrice() != 0.00) {
                Double qty = line.getMultiply();
                ticketBalance += (line.getItemEarnValue() * qty.intValue());
            }
        });

        return pointsRedeemed;
    }

    @Override
    public Integer getEarnedPoints(String cardNumber, TicketInfo ticket) {
        ticketBalance = 0;
        pointsRedeemed = 0;
        ticket.getLines().forEach((line) -> {
            if (line.getProperty("redeemed_points") != null) {
                pointsRedeemed += Integer.valueOf(line.getProperty("redeemed_points"));
            } else if (line.getPrice() != 0.00) {
                Double qty = line.getMultiply();
                ticketBalance += (line.getItemEarnValue() * qty.intValue());
            }
        });
        return ticketBalance;       
    }

}
