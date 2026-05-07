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


package uk.kalc.pos.printer;

import uk.kalc.pos.sales.JTicketLines;
import java.awt.image.BufferedImage;


public interface DeviceDisplayAdvance {
    
    // has support for product image
    public static final int PRODUCT_IMAGE = 1;
    
    // has support for displaying ticket lines
    public static final int TICKETLINES = 2;
    
    // has support for displaying AD Image
    public static final int AD_IMAGE = 4;
    
    // Used to indicate what the advance display can support
    public boolean hasFeature(int feature);
    
    // Advance support for product image routines
    public boolean setProductImage(BufferedImage img);
    
    // Advance support for list of ticket lines 
    public boolean setTicketLines(JTicketLines ticketlinesPanel);
    
    
}
