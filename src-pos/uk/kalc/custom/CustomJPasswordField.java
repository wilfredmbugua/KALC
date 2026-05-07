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


package uk.kalc.custom;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPasswordField;

/**
 *
 * @author John
 */
    public class CustomJPasswordField extends JPasswordField {

        public CustomJPasswordField(Dimension dimension, Font font) {
            super();
            this.setText("");
            this.setFont(font);
            this.setPreferredSize(dimension);
        }
    }
