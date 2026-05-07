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


package ke.kalc.data.loader;


public class SessionDBMySQL implements SessionDB {

    /**
     *
     * @return
     */
    public String TRUE() {
        return "TRUE";
    }

    /**
     *
     * @return
     */
    public String FALSE() {
        return "FALSE";
    }

    /**
     *
     * @return
     */
    public String INTEGER_NULL() {
        return "cast(null as unsigned integer)";
    }

    /**
     *
     * @return
     */
    public String CHAR_NULL() {
        return "cast(null as char)";
    }

    /**
     *
     * @return
     */
    public String getName() {
        return "MySQL";
    }

    /**
     *
     * @param s
     * @param sequence
     * @return
     */
    public SentenceFind getSequenceSentence(Session s, String sequence) {
        return new SequenceForMySQL(s, sequence);
    }
   
    /**
     *
     * @param s
     * @param sequence
     * @return
     */
    public SentenceFind resetSequenceSentence(Session s, String sequence) {
        return new SequenceForMySQL(s, "update pickup_number set id=1");
    }    
}
