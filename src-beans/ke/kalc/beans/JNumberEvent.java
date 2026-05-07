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


package ke.kalc.beans;

import java.util.EventObject;

public class JNumberEvent extends EventObject {

    private char m_cKey;
    
    /**
     *
     * @param source
     * @param cKey
     */
    public JNumberEvent(Object source, char cKey) {
        super(source);
        m_cKey = cKey;
    }
    
    /**
     *
     * @return
     */
    public char getKey() {
        return m_cKey;
    }

}
