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


package uk.kalc.pos.printer.ticket;

import java.awt.Font;
import java.awt.geom.AffineTransform;
import uk.kalc.pos.printer.DevicePrinter;

/**
 *
 *   
 */
public class MyPrinterState {

    private int m_iSize;

    /** Creates a new instance of PrinterState
     * @param iSize */
    public MyPrinterState(int iSize) {
        m_iSize = iSize;
    }

    /**
     *
     * @return
     */
    public int getLineMult() {
        return getLineMult(m_iSize);
    }

    /**
     *
     * @param iSize
     * @return
     */
    public static int getLineMult(int iSize) {
        switch (iSize) {
            case 0:
            case 2:
                return 1;
            case 1:
            case 3:
                return 2;
            default:
                return 1;
        }
    }

    /**
     *
     * @param baseFont
     * @param iStyle
     * @return
     */
    public Font getFont(Font baseFont, int iStyle) {

        Font f;
        AffineTransform a;
        switch (m_iSize) {
            case 0:
                f = baseFont;
                break;
            case 2:
                a = AffineTransform.getScaleInstance(2.0, 1.0);
                a.preConcatenate(baseFont.getTransform());
                f = baseFont.deriveFont(a);
                break;
            case 1:
                a = AffineTransform.getScaleInstance(1.0, 2.0);
                a.preConcatenate(baseFont.getTransform());
                f = baseFont.deriveFont(a);
                break;
            case 3:
                a = AffineTransform.getScaleInstance(2.0, 2.0);
                a.preConcatenate(baseFont.getTransform());
                f = baseFont.deriveFont(a);
                break;
            default:
                f = baseFont;
                break;
        }
        f = f.deriveFont((iStyle & DevicePrinter.STYLE_BOLD) != 0 ? Font.BOLD : baseFont.getStyle());
        // Falta aplicar el subrayado
        return f;
    }
}
