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

import uk.kalc.data.loader.IKeyed;

public class AttributeSetInfo implements IKeyed {

    private String id;
    private String name;
    private String siteGuid;

    public AttributeSetInfo(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public AttributeSetInfo(String id, String name, String siteGuid) {
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

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
