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

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 *   
 */
public class PrintItemImage implements PrintItem {

    /**
     *
     */
    protected BufferedImage image;

    /**
     *
     */
    protected double scale;

    /** Creates a new instance of PrintItemImage
     * @param image
     * @param scale
     */
    public PrintItemImage(BufferedImage image, double scale) {
        this.image = image;
        this.scale = scale;
    }

    /**
     *
     * @param g
     * @param x
     * @param y
     * @param width
     */
    @Override
    public void draw(Graphics2D g, int x, int y, int width) {
        g.drawImage(image, x + (width - (int)(image.getWidth() * scale)) / 2, y, (int)(image.getWidth() * scale), (int)(image.getHeight() * scale), null);
    }

    /**
     *
     * @return
     */
    @Override
    public int getHeight() {
        return (int) (image.getHeight() * scale);
    }
}
