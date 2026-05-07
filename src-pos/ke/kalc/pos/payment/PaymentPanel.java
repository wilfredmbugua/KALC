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

import javax.swing.JComponent;

/**
 *
 *   
 */
public interface PaymentPanel {
    
    /**
     *
     * @param sTransaction
     * @param dTotal
     */
    public void activate(String sTransaction, double dTotal);

    /**
     *
     * @return
     */
    public JComponent getComponent();

    /**
     *
     * @return
     */
    public PaymentInfoMagcard getPaymentInfoMagcard();
}
