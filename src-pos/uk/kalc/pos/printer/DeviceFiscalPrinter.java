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


package uk.kalc.pos.printer;

import javax.swing.JComponent;

/**
 *
 *   
 */
public interface DeviceFiscalPrinter {
 
    /**
     *
     * @return
     */
    public String getFiscalName();

    /**
     *
     * @return
     */
    public JComponent getFiscalComponent();
    
    /**
     *
     */
    public void beginReceipt();

    /**
     *
     */
    public void endReceipt();

    /**
     *
     * @param sproduct
     * @param dprice
     * @param dunits
     * @param taxinfo
     */
    public void printLine(String sproduct, double dprice, double dunits, int taxinfo);

    /**
     *
     * @param smessage
     */
    public void printMessage(String smessage);

    /**
     *
     * @param sPayment
     * @param dpaid
     */
    public void printTotal(String sPayment, double dpaid);
    
    /**
     *
     */
    public void printZReport();

    /**
     *
     */
    public void printXReport();
}
