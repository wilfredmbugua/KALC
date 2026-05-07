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

import java.awt.Color;
import ke.kalc.globals.SystemProperty;

/**
 *
 * @author John
 */
public class CustomColour {

    public static Color getBorderColour() {
        if (SystemProperty.LAF.equalsIgnoreCase("com.jtattoo.plaf.hifi.HiFiLookAndFeel")) {
            return Color.WHITE;
        }
        return Color.BLACK;
    }

    public static Color getEnabledColour(Color color) {
        double y = (299 * color.getRed() + 587 * color.getGreen() + 114 * color.getBlue()) / 1000;
        return y >= 128 ? Color.black : Color.white;
    }
}
