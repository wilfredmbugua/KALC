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
import uk.kalc.data.loader.SerializerRead;

public class AttributeInfo implements IKeyed {

    private String id;
    private String name;
    private String siteGuid;

    public AttributeInfo(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public AttributeInfo(String id, String name, String siteGuid) {
        this.id = id;
        this.name = name;
        this.siteGuid = siteGuid;
    }

    @Override
    public Object getKey() {
        return id;
    }

    public String getSiteGuid() {
        return siteGuid;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    public static SerializerRead getSerializerRead() {
        return new SerializerRead() {
            @Override
            public Object readValues(DataRead dr) throws BasicException {
                String id = dr.getString(1);
                String name = dr.getString(2);
                String siteGuid = dr.getString(3);
                return new AttributeInfo(id, name, siteGuid);
            }
        };
    }

}
