package myproject3;
import java.sql.*;
import javax.swing.JOptionPane;

public class DbManager {
    Connection con;
    PreparedStatement pstmt;
    
    // DEFAULT CONSTRUCTOR THAT INITIALIZES CONNECTION STRING ...
    public DbManager() throws ClassNotFoundException, SQLException
    {
        // LOAD DRIVERS
        Class.forName("com.mysql.jdbc.Driver");
        
        // CREATE A CONNECTION
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "");
    }
    
    // LOGIN FUNCTIONALITY ...
    public boolean login(String username, String password) throws SQLException {
        String sql_query = "SELECT * FROM students_data WHERE username=? AND password=?";
        pstmt = con.prepareStatement(sql_query);
        
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        
        ResultSet result = pstmt.executeQuery();
        
        if (result.next()) {
            return true;
        }
        
        con.close();
        return false;
    }
    
    
    
    
    // INSERTION FUNCTIONALITY ...
    public void insertData(String name, String age, String email, 
            String gender, String username, String password) throws SQLException
    {
        String query = "INSERT INTO students_data(name, age, email, gender, username, password)VALUES(?,?,?,?,?,?)";
        
        pstmt = con.prepareStatement(query);
        
        pstmt.setString(1, name);
        int ageInt = Integer.parseInt(age);
        pstmt.setInt(2, ageInt);
        pstmt.setString(3, email);
        pstmt.setString(4, gender);
        pstmt.setString(5, username);
        pstmt.setString(6, password);
        
        int result = pstmt.executeUpdate();
        
        if (result == 1) {
            JOptionPane.showMessageDialog(null, "Data Inserted Successfully.");          
    }
        else {
            JOptionPane.showMessageDialog(null, "Some error occurred during insertion");
        }
        
    }
       
    
    
    // UPDATE DATA ...
    int updateData(String id, String name, String username, String email, String age) throws SQLException {
        String query = "UPDATE students_data SET name=?, username=?, email=?, age=? WHERE id=?";
	pstmt = con.prepareStatement(query);
	pstmt.setString(1,name);
	pstmt.setString(2,username);
	pstmt.setString(3,email);
        pstmt.setInt(4, Integer.parseInt(age));
        pstmt.setInt(5, Integer.parseInt(id));
        
        int result = pstmt.executeUpdate();
        
        return result;
    }
    
    
    
    // DELETETION OF DATA ...
    int deleteData(String id) throws SQLException {
        String query = "DELETE FROM students_data WHERE id = ?";
        pstmt = con.prepareStatement(query);
        
        pstmt.setString(1, id);
        
        int result = pstmt.executeUpdate();
        
        return result;
    }
    
    
    
}
