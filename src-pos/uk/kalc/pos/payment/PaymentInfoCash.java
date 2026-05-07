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

import uk.kalc.format.Formats;
import uk.kalc.pos.forms.AppLocal;

/**
 *
 *
 */
public class PaymentInfoCash extends PaymentInfo {

    private double prePayAmount = 0.0;
    private double m_dPaid;
    private double m_dTotal;
    private String m_dCardName = null;
    private int pointsBurned = 0;

    public PaymentInfoCash(double dTotal, double dPaid, double dTendered) {
        m_dTotal = dTotal;
        m_dPaid = dPaid;
    }

    public PaymentInfoCash(double dTotal, double dPaid, double dTendered, double prePayAmount) {
        this(dTotal, dTendered, dPaid);
        this.prePayAmount = prePayAmount;
    }

    @Override
    public PaymentInfo copyPayment() {
        return new PaymentInfoCash(m_dTotal, m_dPaid, prePayAmount);
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
        //   return m_dTendered;
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
    
    public boolean hasPrePay() {
        return prePayAmount > 0;
    }

    public double getPrePaid() {
        return prePayAmount;
    }

    public String printTendered() {
        //     return Formats.CURRENCY.formatValue(m_dTendered);
        return printPaid();
    }

    public String printPaid() {
        return Formats.CURRENCY.formatValue(m_dPaid);
    }

    public String printChange() {
        return Formats.CURRENCY.formatValue(Double.valueOf(m_dPaid - m_dTotal));
    }

}
