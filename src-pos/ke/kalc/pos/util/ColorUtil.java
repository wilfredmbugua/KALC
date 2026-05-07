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

import java.awt.Color;

public class ColorUtil {
    
    
      public static Color getColorFromArray(String[] _arrColor){
         Color color=null;
         int r= Integer.parseInt(_arrColor[0].toString().trim());
         int g=Integer.parseInt(_arrColor[1].toString().trim());
         int b=Integer.parseInt(_arrColor[2].toString().trim());
         color = new Color(r,g,b);
         if (_arrColor.length==4){
            int a = Integer.parseInt(_arrColor[3].toString().trim());
            color = new Color(r,g,b,a);
         }
        return color;
    }
      
      
      public static Color setColorFromConfig(String _color){
         Color color=Color.WHITE;
         if (_color!=null){
             String[] _arrColor = _color.split(",");
             int r= Integer.parseInt(_arrColor[0].toString().trim());
             int g=Integer.parseInt(_arrColor[1].toString().trim());
             int b=Integer.parseInt(_arrColor[2].toString().trim());
             color = new Color(r,g,b);
             if (_arrColor.length==4){
                int a = Integer.parseInt(_arrColor[3].toString().trim());
                color = new Color(r,g,b,a);
             }
         }
        return color;
    }
      
      public static String getColorToRgb(Color _color){
         String result = _color.getRed()+","+_color.getGreen()+","+_color.getBlue();
        return result;
    }
      
}
