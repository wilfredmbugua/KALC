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

/**
 *
 *   
 */
public class TicketPrinterException extends java.lang.Exception {

    /**
     *
     */
    public TicketPrinterException() {
    }

    /**
     *
     * @param msg
     */
    public TicketPrinterException(String msg) {
        super(msg);
    }

    /**
     *
     * @param msg
     * @param cause
     */
    public TicketPrinterException(String msg, Throwable cause) {
        super(msg, cause);
    }
}


