/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regression;

import matrix.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aakash
 */
public class Test {
    double x[][];
    double y[][];

    public Test() {
        this.x = new double[][]{{4,0,1}, {7,1,1}, {6,1,0}, {2,0,0}, {3,0,1}};
        this.y = new double[][]{{27},{29},{23},{20},{21}};
    }
    
    public void Calculate() throws NoSquareException{
        Matrix X = new Matrix(x);
        Matrix Y = new Matrix(y);
        MultiLinear ml = new MultiLinear(X,Y);
        Matrix beta = ml.calculate();
        for(int i=0;i<beta.getNrows();i++)
        {
            for(int j=0;j<beta.getNcols();j++)
            {
                System.out.println(beta.getValueAt(i, j));
            }
            System.out.println();
        }
//        for (int i=0;i<Y.getNrows();i++) {
//            double predictedY =  beta.getValueAt(0, 0);
//            for (int j=1; j< beta.getNrows(); j++) {
//                predictedY += beta.getValueAt(j, 0) * X.getValueAt(i, j-1);
//            }
//            System.out.println(Y.getValueAt(i, 0) + " -> " + predictedY);
//        }
    }
    
}

class BMI{    
    public static void main(String args[]) throws NoSquareException{
        Test t = new Test();
        t.Calculate();
        
        

	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("SQL Driver not found!");
		return;
	}

	
	Connection connection = null;

	try {
		connection = DriverManager
		.getConnection("jdbc:mysql://localhost:3306/lab3","root", "abbh07@6718");
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery("Select * from accident418;");
                while(rs.next()){
                //Retrieve by column name
                int rn  = rs.getInt("report_number");
                Date ad = rs.getDate("accd_date");
                String loc = rs.getString("location");
               

                //Display values
                System.out.print("Report Number: " + rn);
                System.out.print(", Accident Date: " + ad);
                System.out.print(", Location: " + loc);
                System.out.println();
                }
                
        }catch (SQLException e) {
		System.out.println("Connection Failed!");
	}

	  
    }
}

