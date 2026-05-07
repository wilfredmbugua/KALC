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


package uk.kalc.pos.payment;

import java.awt.Component;
import uk.kalc.pos.customers.CustomerInfoExt;
import uk.kalc.pos.loyalty.LoyaltyCard;


public interface JPaymentInterface {
    
    /**
     *
     * @param customerext
     * @param dTotal
     * @param transactionID
     */
    public void activate(CustomerInfoExt customerext, double dTotal, String transactionID);    

    public PaymentInfo executePayment();
    public Component getComponent();
    public Component getComponent(LoyaltyCard loyaltyCard);
    
}
