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


package ke.kalc.data.user;

public class DocumentLoaderBasic implements DocumentLoader {
    
    /**
     *
     */
    public static final DocumentLoader INSTANCE = new DocumentLoaderBasic();
    
    /** Creates a new instance of DocumentLoaderBasic */
    private DocumentLoaderBasic() {
    }
    
    /**
     *
     * @param key
     * @return
     */
    public Object getValue(Object key) {
        return key;
    }

    /**
     *
     * @param value
     * @return
     */
    public Object getKey(Object value) {
        return value;
    }
}
