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


package ke.kalc.data.loader;

import ke.kalc.basic.BasicException;


public class SimpleBuilder implements ISQLBuilderStatic {
    
    private String m_sSentence;
    
    /** Creates a new instance of SimpleBuilder
     * @param sSentence */
    public SimpleBuilder(String sSentence) {
        m_sSentence = sSentence;
    }
    
    /**
     *
     * @param sw
     * @param params
     * @return
     * @throws BasicException
     */
    public String getSQL(SerializerWrite sw, Object params) throws BasicException {
        return m_sSentence;
    }
    
}
