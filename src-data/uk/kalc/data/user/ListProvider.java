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


package uk.kalc.data.user;

import java.util.List;
import uk.kalc.basic.BasicException;

/**
 *
 *   
 */
public interface ListProvider {

    /**
     *
     * @return
     * @throws BasicException
     */
    public List loadData() throws BasicException;    

    /**
     *
     * @return
     * @throws BasicException
     */
    public List refreshData() throws BasicException;     
    
    public List setData(Object values) throws BasicException;
}
