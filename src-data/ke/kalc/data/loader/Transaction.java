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

import java.sql.SQLException;
import ke.kalc.basic.BasicException;


public abstract class Transaction<T> {
    
    private Session s;
    
    /** Creates a new instance of Transaction
     * @param s */
    public Transaction(Session s) {
        this.s = s;
    }
    
    /**
     *
     * @return
     * @throws BasicException
     */
    public final T execute() throws BasicException {
        
        if (s.isTransaction()) {
            return transact();
        } else {
            try {
                try {    
                    s.begin();
                    T result = transact();
                    s.commit();
                    return result;
                } catch (BasicException e) {
                    s.rollback();
                    throw e;
                }
            } catch (SQLException eSQL) {
                throw new BasicException("Transaction error", eSQL);
            }
        }
    }
    
    /**
     *
     * @return
     * @throws BasicException
     */
    protected abstract T transact() throws BasicException;
}
