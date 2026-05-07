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


public class SerializerReadBoolean implements SerializerRead {
    
    public static final SerializerRead INSTANCE = new SerializerReadBoolean();
    
    public SerializerReadBoolean() {
    }
    
    public Object readValues(DataRead dr) throws BasicException {
        return Datas.BOOLEAN.getValue(dr,1);
    }    
}
