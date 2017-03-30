
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Books;

/**
 *
 * @author Kayla
 */
public class UpdateQuery {

    private Connection conn;
    
    public UpdateQuery(){
        
        
        Properties props = new Properties();
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void doUpdate(Books book){
        
        try {
            String query = "UPDATE books SET bookTitle = ?, bookAuthor = ?, bookPublisher = ?, bookRating = ?, bookOwn = ?, bookRead = ? WHERE bookID = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, book.getBookTitle());
            ps.setString(2, book.getBookAuthor());
            ps.setString(3, book.getBookPublisher());
            ps.setInt(4, book.getBookRating());
            ps.setString(5, book.getBookOwn());
            ps.setString(6, book.getBookRead());
            ps.setInt(7, book.getBookID());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
