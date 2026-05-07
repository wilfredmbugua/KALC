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

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import uk.kalc.connectionpool.ConnectionPoolFactory;

/**
 *
 * @author John
 */
public class pooltest {

    public static void main(final String args[]) throws SQLException {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = ConnectionPoolFactory.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from products");
            while (resultSet.next()) {
                System.out.println("empId:" + resultSet.getString(1));
                System.out.println("empName:" + resultSet.getString(2));
                System.out.println("dob:" + resultSet.getString(3));
                System.out.println("designation:" + resultSet.getString(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(pooltest.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            resultSet.close();
            statement.close();
            connection.close();
        }

        try {
            connection = ConnectionPoolFactory.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from products");
            while (resultSet.next()) {
                System.out.println("empId:" + resultSet.getString(1));
                System.out.println("empName:" + resultSet.getString(2));
                System.out.println("dob:" + resultSet.getString(3));
                System.out.println("designation:" + resultSet.getString(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(pooltest.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            resultSet.close();
            statement.close();
            connection.close();
        }

        try {
            connection = ConnectionPoolFactory.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from products");
            while (resultSet.next()) {
                System.out.println("empId:" + resultSet.getString(1));
                System.out.println("empName:" + resultSet.getString(2));
                System.out.println("dob:" + resultSet.getString(3));
                System.out.println("designation:" + resultSet.getString(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(pooltest.class.getName()).log(Level.SEVERE, null, ex);
        } finally 
        {
            resultSet.close();
            statement.close();
            connection.close();
        }

        try {
            connection = ConnectionPoolFactory.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from products");
            while (resultSet.next()) {
                System.out.println("empId:" + resultSet.getString(1));
                System.out.println("empName:" + resultSet.getString(2));
                System.out.println("dob:" + resultSet.getString(3));
                System.out.println("designation:" + resultSet.getString(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(pooltest.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            resultSet.close();
            statement.close();
            connection.close();
        }

        try {
            connection = ConnectionPoolFactory.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from products");
            while (resultSet.next()) {
                System.out.println("empId:" + resultSet.getString(1));
                System.out.println("empName:" + resultSet.getString(2));
                System.out.println("dob:" + resultSet.getString(3));
                System.out.println("designation:" + resultSet.getString(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(pooltest.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
            resultSet.close();
            statement.close();
            connection.close();
        }

        try {
            TimeUnit.SECONDS.sleep(25);
        } catch (InterruptedException ex) {
            Logger.getLogger(pooltest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
