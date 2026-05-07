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

import javax.swing.JComponent;
import ke.kalc.basic.BasicException;

public interface JPanelView {

    public abstract String getTitle();
    public abstract void activate() throws BasicException;
    public abstract boolean deactivate();
    public abstract JComponent getComponent();
}
