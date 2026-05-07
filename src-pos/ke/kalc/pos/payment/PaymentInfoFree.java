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

import ke.kalc.pos.forms.AppLocal;

/**
 *
 *
 */
public class PaymentInfoFree extends PaymentInfo {

    private double m_dTotal;
    private double m_dTendered;
    private String m_dCardName = null;
    private int pointsBurned = 0;

    /**
     * Creates a new instance of PaymentInfoFree
     *
     * @param dTotal
     */
    public PaymentInfoFree(double dTotal) {
        m_dTotal = dTotal;
    }

    /**
     *
     * @return
     */
    @Override
    public PaymentInfo copyPayment() {
        return new PaymentInfoFree(m_dTotal);
    }

    @Override
    public String getTransactionID() {
        return null;
    }

    @Override
    public String getName() {
        return "free";
    }

    @Override
    public String getDescription() {
        return AppLocal.getIntString("paymentdescription.free");
    }

    @Override
    public double getTotal() {
        return m_dTotal;
    }

    @Override
    public double getPaid() {
        return (0.0);
    }

    @Override
    public double getChange() {
        return (0.00);
    }

    @Override
    public double getTendered() {
        return m_dTendered;
    }

    @Override
    public String getCardName() {
        return m_dCardName;
    }
    @Override
    public Boolean isCardPayment() {
        return false;
    }
    
}
