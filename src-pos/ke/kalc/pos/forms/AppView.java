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


package ke.kalc.pos.forms;

import java.util.Date;
import ke.kalc.data.loader.Session;
import ke.kalc.pos.printer.DeviceTicket;
import ke.kalc.pos.scale.DeviceScale;
import ke.kalc.pos.scanpal2.DeviceScanner;

public interface AppView {
    
    public DeviceScale getDeviceScale();

    public DeviceTicket getDeviceTicket();

    public DeviceScanner getDeviceScanner();
      
    public Session getSession();

    public AppProperties getProperties();

    public Object getBean(String beanfactory) throws BeanFactoryException;
     
    public void setActiveCash(String value, int iSeq, Date dStart, Date dEnd);

    public String getActiveCashIndex();

    public int getActiveCashSequence();

    public Date getActiveCashDateStart();

    public Date getActiveCashDateEnd();
    
    public String getInventoryLocation();
    
    public void waitCursorBegin();

    public void waitCursorEnd();
    
    public AppUserView getAppUserView();
}

