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


package uk.kalc.pos.forms;

import uk.kalc.basic.BasicException;
import uk.kalc.data.loader.Session;
import uk.kalc.data.loader.SessionFactory;

public class AppViewConnection {

    /**
     * Creates a new instance of AppViewConnection
     */
    private AppViewConnection() {
    }

    /**
     *
     * @param props
     * @return
     * @throws BasicException
     */
    public static Session createSession(AppProperties props) throws BasicException {
        return createSession();
    }

    public static Session createSession() throws BasicException {        
        return SessionFactory.getSession();
    }

    private static boolean isJavaWebStart() {

        try {
            Class.forName("javax.jnlp.ServiceManager");
            return true;
        } catch (ClassNotFoundException ue) {
            return false;
        }
    }
}
