package miniproject;
import java.sql.*;
public class MiniProject
{
public static void main(String[] args)
{
Connection conn=null;
try { String driverName="oracle.jdbc.OracleDriver";
Class.forName(driverName);
conn=DriverManager.getConnection("jdbc:oracle:thin:@CSLC10572:1521/XEPDB1","mini","mini123");
System.out.println("Connection Successful");
}
catch (ClassNotFoundException e)
{
System.out.println("could not find conn db driver"+e.getMessage());
}
catch(SQLException e)
{
System.out.println("could not connect to db"+e.getMessage());
}
}
}