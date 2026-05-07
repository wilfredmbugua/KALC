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


package ke.kalc.pos.printer.ticket;

import java.awt.Graphics2D;

/**
 *
 *   
 */
public interface PrintItem {
    
    /**
     *
     * @return
     */
    public int getHeight();

    /**
     *
     * @param g
     * @param x
     * @param y
     * @param width
     */
    public void draw(Graphics2D g, int x, int y, int width);
}
