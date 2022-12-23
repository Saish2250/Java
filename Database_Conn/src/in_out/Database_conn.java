package in_out;
import java.sql.Connection;
import java.sql.*;

public class Database_conn {
	
		public static Connection connect() {
	        Connection conn = null;
	        try {
	          
	        	
	            String url = "jdbc:sqlite:C:\\Users\\MCA\\Documents\\eclipse workspace\\Mobile_in_out\\datmobile.db";
	   
	            conn = DriverManager.getConnection(url);
	            
	            System.out.println("Connection is established.");
	            
	            String createtable = "CREATE TABLE \"data\" (\r\n"
	            		+ "	\"ID\"	INTEGER,\r\n"
	            		+ "	\"Brand\"	TEXT,\r\n"
	            		+ "	\"Model\"	TEXT,\r\n"
	            		+ "	\"Price\"	INTEGER\r\n"
	            		+ ");";
	            
	         
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            try {
	                if (conn != null) {
	                	System.out.println("Connection Established");
	                    conn.close();
	                }
	            } catch (SQLException ex) {
	                System.out.println(ex.getMessage());
	            }
	        }
			return conn;
	    }
	    
		   public void insert(Integer ID, String Brand, String Model, Integer Price) {
               String sql = "INSERT INTO warehouses(ID,Brand,Model,Price) VALUES(?,?,?,?)";

               try (Connection conn = Database_conn.connect();
                       PreparedStatement pstmt = conn.prepareStatement(sql)) {
                   pstmt.setInt(1, ID);
                   pstmt.setString(2, Brand);
                   pstmt.setString(3, Model);
                   pstmt.setInt(4,Price);
                   
                   pstmt.executeUpdate();
               } catch (SQLException e) {
                   System.out.println(e.getMessage());
               }
           }
        
        
	}

