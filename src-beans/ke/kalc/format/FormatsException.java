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


package ke.kalc.format;

/**
 *
 *   
 */
public class FormatsException extends java.lang.Exception {
    
    /**
     * Creates a new instance of <code>FormatsException</code> without detail message.
     */
    public FormatsException() {
    }   
    
    /**
     * Constructs an instance of <code>FormatsException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public FormatsException(String msg) {
        super(msg);
    }
}
