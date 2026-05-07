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


package ke.kalc.pos.util;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.JLabel;


public class LabelIcon extends JLabel implements Icon {
    
    private final int iconwidth;
    private final int iconheight;
    
    /**
     *
     * @param width
     * @param height
     */
    public LabelIcon(int width, int height) {
        iconwidth = width;
        iconheight = height;
    }

    /**
     *
     * @param mywidth
     * @param myheight
     * @return
     */
    public BufferedImage getImage(int mywidth, int myheight) {
        
        BufferedImage imgtext = new BufferedImage(mywidth, myheight,  BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = imgtext.createGraphics();
        
        setBounds(0, 0, mywidth, myheight);          
        paint(g2d);
        g2d.dispose();
        
        return imgtext;         
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        
        setBounds(0, 0, iconwidth, iconheight);
        g.translate(x, y);
        paint(g);
        g.translate(-x, -y);
    }

    @Override
    public int getIconWidth() {
        return iconwidth;
    }

    @Override
    public int getIconHeight() {
        return iconheight;
    }

}
