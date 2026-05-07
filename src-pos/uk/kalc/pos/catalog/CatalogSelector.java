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


package uk.kalc.pos.catalog;

import java.awt.Component;
import java.awt.event.ActionListener;
import uk.kalc.basic.BasicException;


public interface CatalogSelector {
    

    public void loadCatalog(String siteGuid) throws BasicException;

    public void showCatalogPanel(String id);

    public void setComponentEnabled(boolean value);

    public Component getComponent();
    
    public void addActionListener(ActionListener l);  

    public void removeActionListener(ActionListener l);    
    

}
