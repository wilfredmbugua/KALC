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
package uk.kalc.pos.forms;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.Arrays;
import uk.kalc.globals.SystemProperty;

public class KALCFonts {

    public static Font DEFAULTFONT;
    public static Font DEFAULTFONTBOLD;
    public static Font DEFAULTBUTTONFONT;
    public static Font KALCFONT;
    public static Font KALCFONTBOLD;

    public static void setFont(String fontName) {

        KALCFONT = new Font("Courgette", Font.PLAIN, 14);
        KALCFONTBOLD = new Font("Courgette", Font.BOLD, 14);

        String font = SystemProperty.SWINGFONT;
        if (!SystemProperty.SWINGFONT.isBlank()) {
            if (Arrays.asList(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames()).contains(font)) {
                DEFAULTFONT = new Font(font, Font.PLAIN, SystemProperty.SWINGFONTSIZE);
                DEFAULTFONTBOLD = new Font(font, Font.BOLD, SystemProperty.SWINGFONTSIZE);
                DEFAULTBUTTONFONT = new Font(font, Font.BOLD, SystemProperty.SWINGFONTSIZE + 2);
                return;
            }
        }

        DEFAULTFONT = new Font(fontName, Font.PLAIN, 14);
        DEFAULTFONTBOLD = new Font(fontName, Font.BOLD, 14);
        DEFAULTBUTTONFONT = new Font(fontName, Font.BOLD, 16);

    }

}
