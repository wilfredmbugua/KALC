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


package uk.kalc.format;

import java.text.ParseException;

/**
 *
 *   
 */
public abstract class FormatsConstrain {
   
//    public final static FormatsConstrain NOTNULL = new FormatsConstrainNOTNULL();
    
    /**
     *
     * @param value
     * @return
     * @throws ParseException
     */
        
    public abstract Object check(Object value) throws ParseException;

    /**
     *
     */
    public FormatsConstrain() {
    }
    
      
}
