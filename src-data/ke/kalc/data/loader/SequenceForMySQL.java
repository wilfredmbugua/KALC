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


package ke.kalc.data.loader;

import ke.kalc.basic.BasicException;

/**
 *
 *   
 */
public class SequenceForMySQL extends BaseSentence {
    
    private BaseSentence sent1;
    private BaseSentence sent2;
    
    /** Creates a new instance of SequenceForMySQL
     * @param s
     * @param sSeqTable */
    public SequenceForMySQL(Session s, String sSeqTable) {
        
        sent1 = new StaticSentence(s, "update " + sSeqTable + " set id = last_insert_id(id + 1)");
        sent2 = new StaticSentence(s, "select last_insert_id()", null, SerializerReadInteger.INSTANCE);
    }
    
    // Funciones de bajo nivel
        
    /**
     *
     * @param params
     * @return
     * @throws BasicException
     */
        public DataResultSet openExec(Object params) throws BasicException {        
        sent1.exec();
        return sent2.openExec(null);
    }   

    /**
     *
     * @return
     * @throws BasicException
     */
    public DataResultSet moreResults() throws BasicException {
        return sent2.moreResults();
    }

    /**
     *
     * @throws BasicException
     */
    public void closeExec() throws BasicException {
        sent2.closeExec();
    }
}
