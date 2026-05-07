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

package uk.kalc.pos.forms;

public class AppLocal implements Versions {

    public static final String APP_NAME = "KALC POS";
    public static final String APP_ID = "kalcpos";
    public static final String APP_DEMO = "";

    public static String LIST_BY_RIGHTS = "";

    /**
     *
     * @param sKey
     * @return
     */
    public static String getIntString(String sKey) {
        return LocalResource.getString(sKey);
    }

    /**
     *
     * @param sKey
     * @param sValues
     * @return
     */
    public static String getIntString(String sKey, Object... sValues) {
        return  LocalResource.getString(sKey, sValues);
    }
}
