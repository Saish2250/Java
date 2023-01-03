package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
	 /**
	  *
	  * @author sqlitetutorial.net
	  */
	 public class Store {
			
		 private Connection connect() {
		        // SQLite connection string
		        String url = "jdbc:sqlite:C://sqlite/db/test.db";
		        Connection conn = null;
		        try {
		            conn = DriverManager.getConnection(url);
		        } catch (SQLException e) {
		            System.out.println(e.getMessage());
		        }
		        return conn;
		    }

	     /**
	      * Create a new table in the test database
	      *
	      */
	     public static void createNewTable() {
	         // SQLite connection string
	         String url = "jdbc:sqlite:C://sqlite/db/tests.db";
	         
	         // SQL statement for creating a new table
	         String sql = "CREATE TABLE IF NOT EXISTS Mobile (\n"
	                 + "	"
	                 + "	brand text NOT NULL,\n"
	                 + "	model text NOT NULL\n"
	                 + ");";
	         
	         try (Connection conn = DriverManager.getConnection(url);
	                 Statement stmt = conn.createStatement()) {
	             // create a new table
	             stmt.execute(sql);
	         } catch (SQLException e) {
	             System.out.println(e.getMessage());
	         }
	     }

	     /**
	      * @param args the command line arguments
	      */
	   
	 

	    /**
	     * Insert a new row into the warehouses table
	     *
	     * @param name
	     * @param capacity
	     */
	    public void insert(String Brand, String Model) {
	        String sql = "INSERT INTO Mobile(Brand,Model) VALUES(?,?)";

	        try (Connection conn = this.connect();
	                PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setString(1, Brand);
	            pstmt.setString(2, Model);
	            pstmt.executeUpdate();
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	    public void selectAll(){
	        String sql = "SELECT * FROM Mobile";
	        
	        try (Connection conn = this.connect();
	             Statement stmt  = conn.createStatement();
	             ResultSet rs    = stmt.executeQuery(sql)){
	            
	            // loop through the result set
	            while (rs.next()) {
	                System.out.println(rs.getInt("Brand") +  "\t" + 
	                                   rs.getString("Model"));
	            }
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }

}
