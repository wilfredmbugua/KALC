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


package ke.kalc.pos.printer;

public interface DisplayAnimator {
    
    /**
     *
     * @param i
     */
    public void setTiming(int i);

    /**
     *
     * @return
     */
    public String getLine1();

    /**
     *
     * @return
     */
    public String getLine2();
}
