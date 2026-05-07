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


package uk.kalc.pos.epm;

import java.io.Serializable;
import uk.kalc.pos.util.StringUtils;

public class EmployeeInfo implements Serializable {
    
    private static final long serialVersionUID = 9083257536541L;

    /**
     *
     */
    protected String id;

    /**
     *
     */
    protected String name;
    
    /** Creates a new instance of EmployeeInfo
     * @param id */
    public EmployeeInfo(String id) {
        this.id = id;
        this.name = null;
    }
    
    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }
    
    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }   

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String printName() {
        return StringUtils.encodeXML(name);
    }
    
    @Override
    public String toString() {
        return getName();
    }    
}

