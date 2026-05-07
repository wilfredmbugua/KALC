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

/**
 *
 *   
 */
public class SerializerWriteInteger implements SerializerWrite<Integer> {
    
    /**
     *
     */
    public static final SerializerWrite INSTANCE = new SerializerWriteInteger();
    
    /** Creates a new instance of SerializerWriteInteger */
    private SerializerWriteInteger() {
    }
    
    /**
     *
     * @param dp
     * @param obj
     * @throws BasicException
     */
    public void writeValues(DataWrite dp, Integer obj) throws BasicException {
        Datas.INT.setValue(dp, 1, obj);
    }  
}