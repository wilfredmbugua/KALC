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


package ke.kalc.pos.ticket;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import ke.kalc.basic.BasicException;
import ke.kalc.data.loader.DataRead;
import ke.kalc.data.loader.DataWrite;
import ke.kalc.data.loader.SerializableRead;
import ke.kalc.data.loader.SerializableWrite;

/**
 *
 * @author John Barrett
 */
public class CouponSet implements SerializableWrite, SerializableRead, Serializable{
    Set<CouponLine> lines = new TreeSet<CouponLine>();

    public CouponLine findLine( String id, int linenumber ) {  
        Iterator<CouponLine> iterator = lines.iterator();

        while(iterator.hasNext()) {
            CouponLine line = iterator.next();
            if(line.getid().contentEquals(id) &&             
                line.getlinenumber() == linenumber ) {        
                return line;
            }
        }

        return null;
    }

    public void add( String id, int linenumber, String text ) {  
        lines.add( new CouponLine( id, linenumber, text ) );
    }

    public void clear( ) {  
        lines.clear();
    }

    // Remove a single line
    public void remove( String id, int linenumber ) {  
        Iterator<CouponLine> iterator = lines.iterator();

        while(iterator.hasNext()) {
            CouponLine line = iterator.next();
            if(line.getid().contentEquals(id) &&             
                line.getlinenumber() == linenumber ) {        
                iterator.remove();
            }
        }
    }

    // Remove all lines for this coupon
    public void remove( String id ) {  
        Iterator<CouponLine> iterator = lines.iterator();

        while(iterator.hasNext()) {
            CouponLine line = iterator.next();
            if(line.getid().contentEquals(id)) {        
                iterator.remove();
            }
        }
    }

    public void copyAll( CouponSet c ) {
        Iterator<CouponLine> iterator = c.lines.iterator();

        while(iterator.hasNext()) {
            CouponLine line = iterator.next();
            this.lines.add( new CouponLine( line ) );
        }            
    }

    public List<String> getCouponLines() {
        List<String> result = new ArrayList<>();
        Iterator<CouponLine> iterator = this.lines.iterator();

        while(iterator.hasNext()) {
            CouponLine line = iterator.next();
            result.add( line.gettext() );
        }            
        return result;
    }

    @Override
    public void writeValues(DataWrite dp) throws BasicException {

        dp.setObject(1, lines );
    }

    @Override
    public void readValues(DataRead dr) throws BasicException {
        lines = (Set<CouponLine>) dr.getObject(1);
    }
}
