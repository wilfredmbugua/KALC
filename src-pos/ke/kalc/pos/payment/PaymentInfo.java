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
package ke.kalc.pos.payment;

import ke.kalc.format.Formats;

public abstract class PaymentInfo {

    public abstract String getName();

    public abstract String getDescription();

    public abstract double getTotal();

    public abstract PaymentInfo copyPayment();

    public abstract String getTransactionID();

    public abstract double getPaid();

    public abstract double getChange();

    public abstract double getTendered();

    public abstract String getCardName();
    
    public abstract Boolean isCardPayment();

    public void addToPaid(Double balance) {       
    }
     
    public void addToTotal(Double balance) {       
    }

    public int getBurnPoints() {
        return 0;
    }

    public Double getECardBalance() {
        return 0.00;
    }

    public String getECardNumber() {
        return null;
    }

    public String printTotal() {
        return Formats.CURRENCY.formatValue(getTotal());
    }
}
