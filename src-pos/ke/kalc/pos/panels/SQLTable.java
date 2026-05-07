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


package ke.kalc.pos.panels;

import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.tree.TreeNode;


public class SQLTable implements TreeNode { 
    
    private SQLDatabase m_db;
    private String m_sName;
    
    private ArrayList m_aColumns;
    
    /** Creates a new instance of SQLTable
     * @param db
     * @param name */
    public SQLTable(SQLDatabase db, String name) {
        m_db = db;
        m_sName = name;
        m_aColumns = new ArrayList();
    }
    
    /**
     *
     * @return
     */
    public String getName() {
        return m_sName;
    }
    
    /**
     *
     * @param name
     */
    public void addColumn(String name) {
        SQLColumn c = new SQLColumn(this, name);
        m_aColumns.add(c);
    }
    
    @Override
    public String toString() {
        return m_sName;
    }
    
    @Override
    public Enumeration children(){
        return new EnumerationIter(m_aColumns.iterator());
    }
    @Override
    public boolean getAllowsChildren() {
        return true;
    }
    @Override
    public TreeNode getChildAt(int childIndex) {
        return (TreeNode) m_aColumns.get(childIndex);
    }
    @Override
    public int getChildCount() {
        return m_aColumns.size();
    }
    @Override
    public int getIndex(TreeNode node){
        return m_aColumns.indexOf(node);
    }
    @Override
    public TreeNode getParent() {
        return m_db;
    }
    @Override
    public boolean isLeaf() {
        return m_aColumns.isEmpty();
    }   
 
}
