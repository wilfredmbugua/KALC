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


package ke.kalc.pos.util;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.Timer;

// this is a dialog that will dispose of itself after a given amount of time
// work in progress

public class JTimedDialog extends JDialog {

    private int lifeTime = 0;

 public JTimedDialog() {
        super();   
 }
    
// if lifeTime is set to zero, this behaves like a normal dialog
    public void setLifeTime(int millis) {
        lifeTime = millis;
    }

    public void setVisible(boolean b) {
        System.out.println("setVisible(" + b + ")");
        super.setVisible(b);
        if (b && lifeTime != 0) {
            Action disposeAction = new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("disposing");
                    dispose();
                }
            };
            Timer t = new Timer(lifeTime, disposeAction);
            t.setRepeats(false);
            t.start();
        }
    }
}
