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

import java.awt.Component;

public interface EditorRecord extends EditorCreator {
       
    public void writeValueEOF();

    public void writeValueInsert(); 

    public void writeValueEdit(Object value); 

    public void writeValueDelete(Object value); 
    
    public void refresh();
    
    public Component getComponent(); 

    public void refreshGuid(String siteGuid);
}
