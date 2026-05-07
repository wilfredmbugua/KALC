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


package ke.kalc.pos.util;

import ke.kalc.basic.BasicException;
import ke.kalc.data.loader.DataRead;
import ke.kalc.data.loader.IKeyed;
import ke.kalc.data.loader.SerializableRead;
import ke.kalc.data.loader.SerializerRead;


public class ReturnInfo implements SerializableRead, IKeyed {

    private static final long serialVersionUID = 8906929819402L;
    private Integer idret;

    /**
     *
     */
    public ReturnInfo() {
        idret = null;
    }

    /**
     *
     * @return
     */
    @Override
    public Object getKey() {
        return idret;
    }

    /**
     *
     * @param dr
     * @throws BasicException
     */
    @Override
    public void readValues(DataRead dr) throws BasicException {
        idret = dr.getInt(1);
    }

    /**
     *
     * @param id
     */
    public void setId(Integer id) {
        idret = id;
    }

    /**
     *
     * @return
     */
    public Integer getId() {
        return idret;
    }

    /**
     *
     * @return
     */
    public static SerializerRead getSerializerRead() {
        return new SerializerRead() {
            @Override
            public Object readValues(DataRead dr) throws BasicException {
                return new ReturnInfo(
                        dr.getInt(1));
            }
        };
    }

    /**
     *
     * @param id
     */
    public ReturnInfo(Integer id) {
        this.idret = id;
    }

}
