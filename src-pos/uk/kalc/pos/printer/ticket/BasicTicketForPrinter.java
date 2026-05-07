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


public class BasicTicketForPrinter extends BasicTicket {

        private static Font BASEFONT = new Font("Monospaced", Font.PLAIN, 7).deriveFont(AffineTransform.getScaleInstance(1.0, 1.40));
        private static int FONTHEIGHT = 12;
        private static double IMAGE_SCALE = 0.65;

    /**
     *
     * @return
     */
    @Override
    protected Font getBaseFont() {
        return BASEFONT;
    }

    /**
     *
     * @return
     */
    @Override
    protected int getFontHeight() {
        return FONTHEIGHT;
    }

    /**
     *
     * @return
     */
    @Override    protected double getImageScale() {
        return IMAGE_SCALE;
      }
  }