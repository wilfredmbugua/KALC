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

public class FlyerAnimator extends BaseAnimator {
    
    /**
     *
     * @param line1
     * @param line2
     */
    public FlyerAnimator(String line1, String line2) {
        baseLine1 = DeviceTicket.alignLeft(line1, 20);
        baseLine2 = DeviceTicket.alignLeft(line2, 20);
    }
    
    /**
     *
     * @param i
     */
    @Override
    public void setTiming(int i) {

        if (i < 20) {
            currentLine1 = DeviceTicket.alignRight(baseLine1.substring(0, i), 20);
            currentLine2 = DeviceTicket.alignRight(baseLine2.substring(0, i), 20);
        } else {
            currentLine1 = baseLine1;
            currentLine2 = baseLine2;
        }
    }
}
