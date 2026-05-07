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


package ke.kalc.pos.printer;

import javax.swing.JComponent;

/**
 *
 *   
 */
public class DeviceFiscalPrinterNull implements DeviceFiscalPrinter {
    
    /** Creates a new instance of DeviceFiscalPrinterNull */
    public DeviceFiscalPrinterNull() {
    }

    /**
     *
     * @param desc
     */
    public DeviceFiscalPrinterNull(String desc) {
    }
 
    /**
     *
     * @return
     */
    @Override
    public String getFiscalName() {
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public JComponent getFiscalComponent() {
        return null;
    }
    
    /**
     *
     */
    @Override
    public void beginReceipt() {
    }

    /**
     *
     */
    @Override
    public void endReceipt() {
    }

    /**
     *
     * @param sproduct
     * @param dprice
     * @param dunits
     * @param taxinfo
     */
    @Override
    public void printLine(String sproduct, double dprice, double dunits, int taxinfo) {
    }

    /**
     *
     * @param smessage
     */
    @Override
    public void printMessage(String smessage) {
    }

    /**
     *
     * @param sPayment
     * @param dpaid
     */
    @Override
    public void printTotal(String sPayment, double dpaid) {
    }
    
    /**
     *
     */
    @Override
    public void printZReport() {
    }

    /**
     *
     */
    @Override
    public void printXReport() {
    }
}
