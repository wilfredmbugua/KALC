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


package uk.kalc.pos.util;

/**
 *
 *   
 */
public class OSValidator {
   
    private static String OS = System.getProperty("os.name").toLowerCase();

    public OSValidator() {            
        }
        
    public static String getOS(){
      if (isWindows()) {
                    return("w");
		} else if (isMac()) {
                    return("m");
		} else if (isUnix()) {
                    return("l");
		} else if (isSolaris()) {
                    return("s");
		} else {
                    return("x");
		}
    }

    public static boolean isWindows() {
		return (OS.indexOf("win") >= 0);
	}

    public static boolean isMac() {
		return (OS.indexOf("mac") >= 0); 
	}

    public static boolean isUnix() {
		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
	}

    public static boolean isSolaris() {
		return (OS.indexOf("sunos") >= 0); 
	}      
}
