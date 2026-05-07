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


package uk.kalc.pos.panels;

import java.util.Enumeration;
import javax.swing.tree.TreeNode;


public class SQLColumn implements TreeNode {
    
    private SQLTable m_table;
    private String m_sName;
    
    /** Creates a new instance of SQLColumn
     * @param t
     * @param name */
    public SQLColumn(SQLTable t, String name) {
        m_table = t;
        m_sName = name;
    }
    @Override
    public String toString() {
        return m_sName;
    }
    
    @Override
    public Enumeration children(){
        return null;
    }
    @Override
    public boolean getAllowsChildren() {
        return false;
    }
    @Override
    public TreeNode getChildAt(int childIndex) {
        throw new ArrayIndexOutOfBoundsException();
    }
    @Override
    public int getChildCount() {
        return 0;
    }
    @Override
    public int getIndex(TreeNode node){
        throw new ArrayIndexOutOfBoundsException();
    }
    @Override
    public TreeNode getParent() {
        return m_table;
    }
    @Override
    public boolean isLeaf() {
        return true;
    }      
}
