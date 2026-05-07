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


package ke.kalc.data.user;

import ke.kalc.basic.BasicException;

/**
 *
 *   
 */
public interface Finder {

    /**
     *
     * @param obj
     * @return
     * @throws BasicException
     */
    public boolean match(Object obj) throws BasicException;
}
