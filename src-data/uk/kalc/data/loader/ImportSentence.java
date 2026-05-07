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


public class ImportSentence extends BaseSentence {
    
    /** Creates a new instance of ImportSentence */
    public ImportSentence() {
    }
    
    /**
     *
     * @throws BasicException
     */
    public void closeExec() throws BasicException {
    }
    
    /**
     *
     * @return
     * @throws BasicException
     */
    public DataResultSet moreResults() throws BasicException {
        return null;
    }
    
    /**
     *
     * @param params
     * @return
     * @throws BasicException
     */
    public DataResultSet openExec(Object params) throws BasicException {
        return null;
    }
}
