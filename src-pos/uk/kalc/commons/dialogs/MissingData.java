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


package uk.kalc.commons.dialogs;

import javax.swing.*;

/**
 * @author John Lewis
 */
public class MissingData extends JDialog {


    public static void showInformationDialog(Boolean showLogo, JPanel content, Boolean undecorated) {
        InformationDialog jInfo = new InformationDialog(showLogo,
                content,
                undecorated);
        jInfo.setLocationRelativeTo(null);
        jInfo.setVisible(true);
    }

    

}
