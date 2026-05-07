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

import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author John
 */
public class ExtendedJButton extends JButton {

    private int btnChoice = -1;

    public ExtendedJButton(String text) {
        super(text);
    }

    public ExtendedJButton(String text, String icon) {
        super("  " + text);
        try {
            Image img = ImageIO.read(getClass().getResource(icon));
            setIcon(new ImageIcon(img));
        } catch (Exception ex) {

        }
    }

    public ExtendedJButton(String text, int choice) {
        super(text);
        btnChoice = choice;
    }

    public ExtendedJButton(String text, String icon, int choice) {
        super("  " + text);
        setVerticalTextPosition(JButton.CENTER);
        setHorizontalTextPosition(JButton.RIGHT);
        try {
            Image img = ImageIO.read(getClass().getResource(icon));
            setIcon(new ImageIcon(img));
        } catch (Exception ex) {

        }
        btnChoice = choice;
    }
      
    
    public int getBtnChoice() {
        return btnChoice;
    }
}
