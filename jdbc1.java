import java.sql.*;
 class jdbc1{
	public static void main(String args[]){
		try{
		Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306/amity","root","123456789");
		System.out.print("connected");	
			}
		catch(Exception e){
			System.out.print("not connected");
			}
	}
}
