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


package ke.kalc.pos.scripting;

public class ScriptException extends java.lang.Exception {
    
    /**
     * Creates a new instance of <code>ScriptException</code> without detail message.
     */
    public ScriptException() {
    }
    
    
    /**
     * Constructs an instance of <code>ScriptException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public ScriptException(String msg) {
        super(msg);
    }

    /**
     *
     * @param msg
     * @param cause
     */
    public ScriptException(String msg, Throwable cause) {
        super(msg, cause);
    }
        
}
