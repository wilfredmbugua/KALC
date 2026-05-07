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
package uk.kalc.pos.ticket;

import java.awt.Component;
import java.awt.Image;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JList;
import uk.kalc.format.Formats;
import uk.kalc.globals.IconFactory;
import uk.kalc.pos.forms.AppLocal;
import uk.kalc.pos.util.ThumbNailBuilder;

public class ProductSearchRenderer extends DefaultListCellRenderer {

    ThumbNailBuilder tnbprod;
    private Double stockCount;

    /**
     * Creates a new instance of ProductRenderer
     */
    public ProductSearchRenderer(double stockCount) {
        tnbprod = new ThumbNailBuilder(48, 48, IconFactory.getIcon("package.png"));
        this.stockCount = stockCount;
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, null, index, isSelected, cellHasFocus);

        ProductInfoExt prod = (ProductInfoExt) value;
        if (prod != null) {

//            setText("<html>" + prod.getReference() + " - " + prod.getName() + "<br>&nbsp;&nbsp;&nbsp;&nbsp;" + Formats.CURRENCY.formatValue(prod.getPriceSell()));
            setText("<html>" + prod.getReference() + " - " + prod.getName() + "<br> "
                    + "<b>" + AppLocal.getIntString("label.stockunits") + ":</b> " + Formats.DOUBLE.formatValue(stockCount) + "<b>     "
                    + AppLocal.getIntString("label.prodpricesell") + ":</b>  "
                    + Formats.CURRENCY.formatValue(prod.getPriceSell()));
            Image img = tnbprod.getThumbNail(prod.getImage());
            setIcon(img == null ? null : new ImageIcon(img));
        }
        return this;
    }
}
