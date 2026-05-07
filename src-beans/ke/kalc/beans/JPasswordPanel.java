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
package ke.kalc.beans;

import javax.swing.JDialog;
import ke.kalc.pos.forms.AppUser;
import ke.kalc.pos.forms.JRootFrame;

/**
 *
 * @author John
 */
public class JPasswordPanel extends JDialog {

    public static Object[] requestPassword(String userName) {
        JPasswordDialog pass = new JPasswordDialog();
        pass.buildPasswordRequest(userName);
        pass.pack();
        pass.setLocationRelativeTo(JRootFrame.PARENTFRAME);
        pass.setLocation(pass.getX(), pass.getY() - 200);
        pass.setVisible(true);
        return new Object[]{pass.getChoice(), pass.getPassword()};
    }

    public static Object[] changePassword(AppUser user) {
        JPasswordDialog pass = new JPasswordDialog();
        pass.buildPasswordChange(user);
        pass.pack();
        pass.setLocationRelativeTo(JRootFrame.PARENTFRAME);
        pass.setLocation(pass.getX(), pass.getY() - 200);
        pass.setVisible(true);
        return new Object[]{pass.getChoice(), pass.getPassword()};
    }

}
