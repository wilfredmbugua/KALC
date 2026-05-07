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


package uk.kalc.pos.inventory;

import uk.kalc.basic.BasicException;
import uk.kalc.data.loader.DataRead;
import uk.kalc.data.loader.IKeyed;
import uk.kalc.data.loader.SerializableRead;

public class ProductListInfo implements SerializableRead, IKeyed {
    
    private static final long serialVersionUID = 9032683595244L;
    private String m_sName;
    
    /** Creates a new instance of LocationInfo */
    public ProductListInfo() {
        m_sName = null;
    }
    
    /** Creates a new instance of LocationInfo */
    public ProductListInfo( String name ) {
        m_sName = name;
    }

    /**
     *
     * @return
     */
    public Object getKey() {
        return m_sName;
    }

    /**
     *
     * @param dr
     * @throws BasicException
     */
    public void readValues(DataRead dr) throws BasicException {
        m_sName = dr.getString(1);
    }

    /**
     *
     * @param sID
     */
    public void setID(String sID) {
        m_sName = sID;
    }
    
    /**
     *
     * @return
     */
    public String getID() {
        return m_sName;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return m_sName;
    }
    
    /**
     *
     * @param sName
     */
    public void setName(String sName) {
        m_sName = sName;
    }  

    public String toString(){
        return m_sName;
    }    
}
