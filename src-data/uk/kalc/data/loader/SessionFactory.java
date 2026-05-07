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

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import uk.kalc.connectionpool.ConnectionPoolFactory;

public class SessionFactory {

    private static Session session;

    private SessionFactory() {
    }

    public static Session getSession() {
        if (session != null) {
            return session;
        }
        try {
            session = new Session(ConnectionPoolFactory.getConnection());
            return session;
        } catch (SQLException ex) {
            Logger.getLogger(SessionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    }
