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


package uk.kalc.data.loader;

import uk.kalc.basic.BasicException;


public interface DataWrite {

    public void setInt(int paramIndex, Integer iValue) throws BasicException;

    public void setString(int paramIndex, String sValue) throws BasicException;

    public void setDouble(int paramIndex, Double dValue) throws BasicException;

    public void setBoolean(int paramIndex, Boolean bValue) throws BasicException;

    public void setTimestamp(int paramIndex, java.util.Date dValue) throws BasicException;

    public void setBytes(int paramIndex, byte[] value) throws BasicException;

    public void setObject(int paramIndex, Object value) throws BasicException;
    
    public void setBigDecimal(int paramIndex, java.math.BigDecimal bdValue) throws BasicException;
}
