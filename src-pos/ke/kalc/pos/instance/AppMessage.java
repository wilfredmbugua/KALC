/*
**    KALC POS  - Open Source Point of Sale
**
**    Copyright (c) 2015-2023 KALC Corporation   
**
**    http://kalcapps.com/enterprise
**   
**    KALC POS is proprietary software. Redistribution requires written permission.
**    (at your option) any later version.
**
**    KALC POS is distributed under proprietary license.
**    but WITHOUT ANY WARRANTY; without even the implied warranty of
**    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
**
**
*/


package ke.kalc.pos.instance;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AppMessage extends Remote {
    
    /**
     *
     * @throws RemoteException
     */
    public void restoreWindow() throws RemoteException;    
}
