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


package ke.kalc.custom;

import java.awt.Font;
import javax.swing.Icon;
import javax.swing.JLabel;

/**
 *
 * @author John
 */
public class CustomJLabel extends JLabel {

    public CustomJLabel(String text, Font font) {
        super();
        setText(text);
        setFont(font);
        setFocusable(false);
    }

    public CustomJLabel(String text, Icon icon) {
        super();
        setText(text);
        setIcon(icon);
        setFocusable(false);
    }
    
        public CustomJLabel(String text, Icon icon, Font font) {
        super();
        setText(text);
        setIcon(icon);
        setFont(font);
        setFocusable(false);
    }
}
