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

import java.util.List;
import ke.kalc.basic.BasicException;
import ke.kalc.data.loader.SentenceList;
import ke.kalc.data.loader.TableDefinition;

/**
 *
 *
 */
public class ListProviderCreator implements ListProvider {

    private SentenceList sent;
    private EditorCreator prov;
    private Object params;

    /**
     * Creates a new instance of ListProviderEditor
     *
     * @param sent
     * @param prov
     */
    public ListProviderCreator(SentenceList sent, EditorCreator prov) {
        this.sent = sent;
        this.prov = prov;
        params = null;
    }

    /**
     *
     * @param sent
     */
    public ListProviderCreator(SentenceList sent) {
        this(sent, null);
    }

    /**
     *
     * @param table
     */
    public ListProviderCreator(TableDefinition table) {
        this(table.getListSentence(), null);
    }
//    public ListProviderECreator(Connection c, ISQLBuilderStatic sqlbuilder, SerializerRead sr, SerializerWrite sw, EditorCreator prov) {
//        this(new StaticSentence(c, sqlbuilder), prov);
//        sent.setSerializerRead(sr);
//        sent.setSerializerWrite(sw);
//    }
//    public ListProviderECreator(Connection c, TableDefinition table, SerializerRead sr, SerializerWrite sw) {        
//        this(new PreparedSentence(c, table.getListSentence()), null);
//        sent.setSerializerRead(sr);
//        sent.setSerializerWrite(sw);
//    }    
//    public ListProviderECreator(Connection c, ISQLBuilder sqlbuilder, SerializerRead sr, SerializerWrite sw, EditorCreator prov) {
//        this(new PreparedSentence(c, sqlbuilder), prov);
//        sent.setSerializerRead(sr);
//        sent.setSerializerWrite(sw);
//    }
//    public ListProviderECreator(Connection c, TableDefinition table, String[] asFindFields, SerializerRead sr, SerializerWrite sw, EditorCreator prov) {
//        this(new PreparedSentence(c, new ListBuilder(table, asFindFields)), prov);
//        sent.setSerializerRead(sr);
//        sent.setSerializerWrite(sw);
//   } 
//    public ListProviderECreator(Connection c, String sqlsentence, SerializerRead sr, SerializerWrite sw, EditorCreator prov) {
//        this(new PreparedSentence(c, sqlsentence), prov);
//        sent.setSerializerRead(sr);
//        sent.setSerializerWrite(sw);
//    }
//    public ListProviderECreator(Connection c, String sqlsentence, SerializerRead sr, SerializerWrite sw) {
//        this(new PreparedSentence(c, sqlsentence), null);
//        sent.setSerializerRead(sr);
//        sent.setSerializerWrite(sw);
//    }

    /**
     *
     * @return @throws BasicException
     */
    @Override
    public List loadData() throws BasicException {
        params = (prov == null) ? null : prov.createValue();
        return refreshData();
    }


    public List setData(Object values) throws BasicException {
        return sent.list(values);
    }

    /**
     *
     * @return @throws BasicException
     */
    @Override
    public List refreshData() throws BasicException {
        return sent.list(params);
    }
}
