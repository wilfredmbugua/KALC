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
import ke.kalc.pos.forms.AppLocal;

/**
 *
 *
 */
public class PaymentInfoCash_original extends PaymentInfo {

    private double m_dPaid;
    private double m_dTotal;
    private String m_dCardName = null;
    private int pointsBurned = 0;

    /**
     * Creates a new instance of PaymentInfoCash
     *
     * @param dTotal
     * @param dPaid
     */
    public PaymentInfoCash_original(double dTotal, double dPaid) {
        m_dTotal = dTotal;
        m_dPaid = dPaid;
    }

    @Override
    public PaymentInfo copyPayment() {
        return new PaymentInfoCash_original(m_dTotal, m_dPaid);
    }

    @Override
    public String getTransactionID() {
        return null;
    }

    @Override
    public String getName() {
        return "cash";
    }

    @Override
    public String getDescription() {
        return AppLocal.getIntString("paymentdescription.cash");
    }

    @Override
    public double getTotal() {
        return m_dTotal;
    }

    @Override
    public double getPaid() {
        return m_dPaid;
    }

    @Override
    public double getTendered() {
        return m_dPaid;
    }

    @Override
    public double getChange() {
        return m_dPaid - m_dTotal;
    }

    @Override
    public String getCardName() {
        return m_dCardName;
    }

    @Override
    public Boolean isCardPayment() {
        return false;
    }

    public String printPaid() {
        return Formats.CURRENCY.formatValue(Double.valueOf(m_dPaid));
    }

    public String printChange() {
        return Formats.CURRENCY.formatValue(Double.valueOf(m_dPaid - m_dTotal));
    }

}
