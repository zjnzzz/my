package sql;
import java.sql.*;  

public class Linksql  
{  
    public static void main(String[] args) throws Exception  
    {  
        Class.forName("com.mysql.jdbc.Driver");  
           
        //一开始必须填一个已经存在的数据库  
        String url = "jdbc:mysql://w.rdc.sae.sina.com.cn/app_xyxxyx?characterEncoding=utf8 ";     
        Connection conn = DriverManager.getConnection(url, "0lxo41l0lz", "431w0ym5k34iwkm303lzz3jkmzk24hiy02xyh3y2");  
        /* Statement stat = conn.createStatement();  
           
        //创建数据库hello  
        stat.executeUpdate("create database hello");  
           
        //打开创建的数据库  
        stat.close();  
        conn.close();
        url = "jdbc:mysql://localhost:3306/hello";  
        conn = DriverManager.getConnection(url, "root", "6021328614"); */  
        Statement stat = conn.createStatement();  
           
        //创建表test 
           
        //添加数据  
        /*stat.executeUpdate("insert into author values('001', '张恨水','已故','中国')");*/  
        //stat.executeUpdate("insert into book values('753780799x','剪愁集','001','北岳文艺出版社','1993-01-01','¥3.1')");  
        //查询数据
        String title="张恨水全集-天明寨";
	    String sql="select * from book where Title='";
	    sql+=title+"'";   
        ResultSet result = stat.executeQuery(sql);  
        while (result.next())  
        {  
            /*System.out.println(result.getString("AuthorID") + " " + result.getString("Name")+"　"+result.getString("Age")+" "+result.getString("Country")); */
            System.out.println(result.getString("ISBN")+" "+result.getString("Title")+" "+result.getString("AuthorID")+" "+result.getString("Publisher")+" "+result.getString("PublishDate")+" "+result.getString("Price")); 	
        }     
        //关闭数据库  
        result.close();  
        stat.close();  
        conn.close();  
    }  
}  