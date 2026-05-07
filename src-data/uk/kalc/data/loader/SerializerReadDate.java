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

public class SerializerReadDate implements SerializerRead {

    /**
     *
     */
    public static final SerializerRead INSTANCE = new SerializerReadDate();

    /** Creates a new instance of SerializerReadImage */
    private SerializerReadDate() {
    }

    /**
     *
     * @param dr
     * @return
     * @throws BasicException
     */
    @Override
    public Object readValues(DataRead dr) throws BasicException {
        return Datas.TIMESTAMP.getValue(dr, 1);
    }
}
