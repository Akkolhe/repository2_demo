package fetchingresult;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import dbconnection.DBConnection;

public class FetchingresultDB {
	
	public static void fetchingDetails(DBConnection dbconn, String test_id)
	{
		
		try
		{
		Statement st = dbconn.getConnection().createStatement();
		Fillo excelfillo = new Fillo();
		com.codoid.products.fillo.Connection excon= excelfillo.getConnection("D:\\Downloads\\account.xlsx");
		String query= null;
		
		
		ResultSet rs= st.executeQuery("select custnbr from CSHIP where test_id="+test_id+"");
		
		while(rs.next())
		{
			String custmernumber=rs.getString("custnbr");
			System.out.println("custnbr is "+custmernumber);
			/*
			 * FileReader fr= new FileReader("D:\\KODEKloud\\Learning Content\\kepaas.txt");
			 * BufferedReader file = new BufferedReader(fr); String line = null; String cust
			 * = null; System.out.println("before print "+line);
			 * while((line=file.readLine())!=null) {
			 * if(file.readLine().contains(custmernumber)) { System.out.print(line); }
			 * 
			 * 
			 * } fr.close();
			 * 
			 * if(cust.contains(custmernumber)) { System.out.println(cust); }
			 */		
			query="select account from Registration where custnbr="+custmernumber+"";
			Recordset excelrs=excon.executeQuery(query);
			
			while(excelrs.next())
			{
				String account=excelrs.getField("account");
				System.out.println("the Account is ---- " + excelrs.getField("account"));
				System.out.println("\n");
				switch(account) {
				case "Shipping1":
					System.out.println("clientid:iwjdiojisdj");
					System.out.println("clientpassword:hshcfkjsk");
					break;
				case "Shipping2":
					System.out.println("clientid:dwhduojisdj");
					System.out.println("clientpassword:nsdjjcbjskcn");
					break;
				case "Shipping3":
					System.out.println("clientid:sjcnkmsncmn");
					System.out.println("clientpassword:njscjnjksn");
					break;
				default:
					System.out.println("give the correct details");
					
				}
				
			}
				
				
			
		}
		
		
				}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}
	

	public static void main(String[] args) {
		
		DBConnection dbconn= new DBConnection();
		String test_id="47430";
		
		FetchingresultDB.fetchingDetails(dbconn,test_id);
		

	}

}
