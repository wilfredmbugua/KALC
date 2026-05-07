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


package uk.kalc.data.loader;


public interface SessionDB {

    /**
     *
     * @return
     */
    public String TRUE();

    /**
     *
     * @return
     */
    public String FALSE();

    /**
     *
     * @return
     */
    public String INTEGER_NULL();

    /**
     *
     * @return
     */
    public String CHAR_NULL();

    /**
     *
     * @return
     */
    public String getName();

    /**
     *
     * @param s
     * @param sequence
     * @return
     */
    public SentenceFind getSequenceSentence(Session s, String sequence);

    /**
     *
     * @param s
     * @param sequence
     * @return
     */
    public SentenceFind resetSequenceSentence(Session s, String sequence);
    
}


