
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Books;

public class ReadQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery(){
        
    Properties props = new Properties();
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void doRead(){
        
        try {
            String query = "Select * from books ORDER BY bookID ASC";
            
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String getHTMLtable(){
        
        String table = "";
        
        table += "<table>";
        
        table += "<tr>";
        table += "<th>Book ID</th>";
        table += "<th>Title</th>";
        table += "<th>Author</th>";
        table += "<th>Publisher</th>";
        table += "<th>Personal Rating</th>";
        table += "<th>Own?</th>";
        table += "<th>Read?</th>";
        table += "<th>Update/Delete</th>";
        
        table += "</tr>";
        
        try {
            while(this.results.next()){
                
                Books books = new Books();
                books.setBookID(this.results.getInt("bookID"));
                books.setBookTitle(this.results.getString("bookTitle"));
                books.setBookAuthor(this.results.getString("bookAuthor"));
                books.setBookPublisher(this.results.getString("bookPublisher"));
                books.setBookRating(this.results.getInt("bookRating"));
                books.setBookOwn(this.results.getString("bookOwn"));
                books.setBookRead(this.results.getString("bookRead"));
                
                table += "<tr>";
                
                table += "<td>";
                table += books.getBookID();
                table += "</td>";
                
                table += "<td>";
                table += books.getBookTitle();
                table += "</td>";
                
                table += "<td>";
                table += books.getBookAuthor();
                table += "</td>";
                
                table += "<td>";
                table += books.getBookPublisher();
                table += "</td>";
                
                table += "<td>";
                table += books.getBookRating();
                table += "</td>";
                
                table += "<td>";
                table += books.getBookOwn();
                table += "</td>";
                
                table += "<td>";
                table += books.getBookRead();
                table += "</td>";
                
                table += "<td>";
                table += "<a href=update?bookID=" + books.getBookID() + "> Update </a>" + "<a href=delete?bookID=" + books.getBookID() + "> Delete </a>";
                
                table += "</tr>";
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        table += "</table>";
        
                return table;
      
    }
}
