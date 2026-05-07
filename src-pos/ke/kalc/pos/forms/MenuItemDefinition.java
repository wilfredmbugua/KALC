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

import java.awt.Dimension;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class MenuItemDefinition implements MenuElement {
    
    private Action act;
    
    /**
     *
     * @param act
     */
    public MenuItemDefinition(Action act) {
        this.act = act;
    }
    
    /**
     *
     * @param menu
     */
    @Override
    public void addComponent(JPanelMenu menu) {        
        JButton btn = new JButton(act);         
        btn.setFocusPainted(false);
        btn.setFocusable(false);
        btn.setRequestFocusEnabled(false);
        btn.setHorizontalAlignment(SwingConstants.LEADING);
        btn.setPreferredSize(new Dimension(150, 40));              
        menu.addEntry(btn);
    }
}
