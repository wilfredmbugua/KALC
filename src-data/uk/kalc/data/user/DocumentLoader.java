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


package uk.kalc.data.user;


public interface DocumentLoader {
    
    /**
     *
     * @param key
     * @return
     */
    public Object getValue(Object key);

    /**
     *
     * @param value
     * @return
     */
    public Object getKey(Object value);
}
