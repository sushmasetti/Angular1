package com.bean.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Beanbook {
int bookid;
String title,author,s;
float price;
public String getS() {
	return s;
}
public void setS(String s) {
	this.s=s;
}
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
String DB_URL2 = "jdbc:mariadb://localhost:3306/bookmanagement";
String USER = "root";
String PASS = "root";
Connection conn = null;
Statement stmt = null;
public String Ex() {
	 int c=0;
     try
        { 
			Class.forName(JDBC_DRIVER);
			 System.out.println("Connecting to a selected database...");
	           conn = DriverManager.getConnection(DB_URL2, USER, PASS);
	            System.out.println("Connected database successfully...");
	            //STEP 4: Execute a query
	            System.out.println("selecting data from table in given database...");
	            stmt = conn.createStatement();
	            System.out.println("stmt created");
	            System.out.println(s);
	            if(s.equals("add")) {
		            System.out.println("loop created");
	            	
	            	String sql="insert into book values("+bookid+",'"+title+"','"+author+"',"+price+")";
	            	System.out.println(sql);
	            	int x=stmt.executeUpdate(sql);
	            	if(x>0)
	            		return "Record added successfully";
	            	return "bookid "+bookid+" already exists" ;
	            }
	            if(s.equals("update")) {
	            	 String sql="update book set title ='"+title+"' , author='"+author+"' , price="+price+" where id="+bookid;
	            	int x=stmt.executeUpdate(sql);
	            	if(x>0)
	            		return "Record updated successfully";
	            	return "bookid "+bookid+" is not present" ;
	            }
	            if(s.equals("delete")) {
	            	String sql="delete from book where id="+bookid;
	            	int x=stmt.executeUpdate(sql);
	            	if(x>0)
	            		return "Record deleted successfully";
	            	return " No record exists with id "+bookid ;
	            }
	            if(s.equals("update1")) {
	            	String op="";
	            	String sql="select * from book where id="+bookid;
	            	ResultSet rs = stmt.executeQuery(sql);
	            	while(rs.next()) {
	            		op+="\r\n" + 
	            				"<form action=\"beanbook.jsp\">\r\n" + 
	            				"<div class=\"form-group col-xs-5\">\r\n" + 
	            				"    	<label for=\"exampleFormControlInput1\">Book ID</label>\r\n" + 
	            				"    	<input type=\"number\" class=\"form-control\" id=\"BookId\" placeholder=\"\" value=\""+rs.getString(1) +"\" name=\"bookid\">\r\n" + 
	            				"  		</div>\r\n" + 
	            				"  		<div class=\"form-group col-xs-5\">\r\n" + 
	            				"    	<label for=\"exampleFormControlInput1\">Title</label>\r\n" + 
	            				"    	<input type=\"text\" class=\"form-control\" id=\"Title\" placeholder=\"\" value=\""+rs.getString(2) +"\" name=\"title\">\r\n" + 
	            				"  		</div>\r\n" + 
	            				"		<div class=\"form-group col-xs-5\">\r\n" + 
	            				"    	<label for=\"exampleFormControlInput1\">Author</label>\r\n" + 
	            				"    	<input type=\"text\" class=\"form-control\" id=\"Author\" placeholder=\"\" value=\""+rs.getString(3) +"\" name=\"author\">\r\n" + 
	            				"  		</div>\r\n" + 
	            				"		<div class=\"form-group col-xs-5\">\r\n" + 
	            				"    	<label for=\"exampleFormControlInput1\">Price</label>\r\n" + 
	            				"    	<input type=\"number\" class=\"form-control\" id=\"Price\" placeholder=\"\"value=\""+rs.getString(4) +"\" name=\"price\">\r\n" + 
	            				"  		</div>\r\n" + 
	            				"  		<div>\r\n" + 
	            				"  		<button align=\"center\" type=\"submit\">Update</button>\r\n" + 
	            				"  		</div>\r\n" + 
	            				"<input type=\"hidden\" name=\"s\" value=\"update\">\r\n" + 
	            				"</form>";
	            		c++;
//	            		op+= rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)
//	            		+" "+rs.getString(4)+" ";
	            	}
	            	if(c==0) 
	            		return "please check the bookid "+bookid;
	              return op;
	            	
	            }
//	            if(s.equals("view")) {  
//	            	String op="";
//	            	String sql="select * from book where id="+bookid;
//	            	ResultSet rs = stmt.executeQuery(sql);
//	            	while(rs.next()) {
//	            		c++;
//	            		op+= rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)
//	            		+" "+rs.getString(4)+" ";
//	            	}
//	            	if(c==0) 
//	            		return "please check the bookid "+bookid;
//	              return op;
//	            }
	            if(s.equals("viewall")|| s.equals("view")) {
	            	String op="<table id=\"mytable\" class=\"table table-bordred table-striped\">  <thead>\r\n" + 
	            			"                    <th>Book Id</th>\r\n" + 
	            			"                    <th>Title</th>\r\n" + 
	            			"                    <th> Author Name</th>\r\n" + 
	            			"                    <th>Price</th>\r\n" + 
	            			"                    <th>Edit</th>\r\n" + 
	            			"                    <th>Delete</th>\r\n" + 
	            			"                   </thead><tbody>";
	            	String sql;
	            	 if(s.equals("viewall")){
	            		 sql="select * from book";
	            	 }
	            	 else {
	            		 sql="select * from book where id="+bookid;
	            	 }
	            	 
	            	//System.out.println(sql);
	            	ResultSet rs = stmt.executeQuery(sql);
	            
	            	while(rs.next()) {
	            		c++;
	            		op+="<tr>";
	            		op+=  "<td>"+rs.getString(1)+"</td>"+"<td>"+rs.getString(2)+"</td>"+"<td>"+rs.getString(3)
	            		+"</td>"+"<td>"+rs.getString(4)+"</td>";
	            		op+="<td><p data-placement=\"top\" data-toggle=\"tooltip\" title=\"Edit\"><button class=\"btn btn-primary btn-xs\" data-title=\"Edit\" data-toggle=\"modal\" data-target=\"#edit\" ><span class=\"glyphicon glyphicon-pencil\"></span></button></p></td>\r\n" + 
	            				"    <td><p data-placement=\"top\" data-toggle=\"tooltip\" title=\"Delete\"><button class=\"btn btn-danger btn-xs\" data-title=\"Delete\" data-toggle=\"modal\" data-target=\"#delete\" ><span class=\"glyphicon glyphicon-trash\"></span></button></p></td>\r\n" + 
	            				"   ";
	            	}
	            	op+="</tr></tbody></table>";
	            			
	            	if(c==0) 
	            		return "No records present";
	            return op;
	            }
            conn.close(); 
        } 
        catch(Exception ex) 
        { 
            System.err.println(ex); 
        } 
     return "error";
}
}
