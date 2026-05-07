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
package uk.kalc.pos.ticket;

import java.io.Serializable;

public class UserInfo implements Serializable {

    private static final long serialVersionUID = 7537578737839L;
    private final String m_sId;
    private final String m_sName;

    /**
     * Creates a new instance of UserInfoBasic
     *
     * @param id
     * @param name
     */
    public UserInfo(String id, String name) {
        m_sId = id;
        m_sName = name;
    }

    /**
     *
     * @return
     */
    public String getId() {
        return m_sId;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return m_sName;
    }

    @Override
    public String toString() {
        return getName();
    }

}
