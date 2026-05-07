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

public class PaymentPanelFac {
    
    /** Creates a new instance of PaymentPanelFac */
    private PaymentPanelFac() {
    }
    
    /**
     *
     * @param sReader
     * @param notifier
     * @return
     */
    public static PaymentPanel getPaymentPanel(String sReader, JPaymentNotifier notifier) {
        switch (sReader) {
            default:
                // "Not defined
           return new PaymentPanelBasic(notifier);
        }
    }      
}
