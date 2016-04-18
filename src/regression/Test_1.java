package regression; 

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import matrix.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aakash
 */
public class Test_1 {//database to matrix conversion
    public static void main(String[] args) throws SQLException, NoSquareException
    {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        String s;
   
        //connect your app to mysql database  
        //boolean autoReconnect;
        //boolean useSSL = false;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab3","root", "abbh07@6718");
      
      
        st = con.createStatement();
        s = "select SA,SB,SC,SD from login.demo";
        rs = st.executeQuery(s);
        ResultSetMetaData rsmt = rs.getMetaData();
        Statement stmt1 = con.createStatement();
        ResultSet rs1 = stmt1.executeQuery("SELECT COUNT(*) AS total FROM login.demo");
        int count = 0;
        while(rs1.next()){
        count = rs1.getInt("total");
        }
        Statement stmt2 = con.createStatement();
        ResultSet rs2 = stmt2.executeQuery("SELECT Disease FROM login.demo");

        

        String a = "";
        int nCol = rs.getMetaData().getColumnCount();
        double ar[][] = new double[count][nCol];
        //System.out.println(rowNumb);
        List<int[]> table = new ArrayList<>();
        while( rs.next()) {
        int[] row = new int[nCol];
        for( int iCol = 1; iCol <= nCol; iCol++ ){
            a = rs.getObject(iCol).toString();
            row[iCol-1] = Integer.parseInt(a);
        }
        table.add( row );
    }

    int nColy = rs2.getMetaData().getColumnCount();
    double ary[][] = new double[count][nColy];

List<int[]> tabley = new ArrayList<>();
while( rs2.next()) {
    int[] rowy = new int[nColy];
    for( int iCol = 1; iCol <= nColy; iCol++ ){
        a = rs2.getObject(iCol).toString();
        rowy[iCol-1] = Integer.parseInt(a);
    }
    tabley.add( rowy );
}


    

/*String b ="";
List<int[]> table = new ArrayList<>();
int arr[] = new int[count];
for(int m=1;m<=count;m++)
{
    b = rs2.getObject(m).toString();
    arr[m-1] = Integer.parseInt(b);
}
for(int p = 0;p<count;p++)
    System.out.println(arr[p]);*/

int i=0;
int j=0;
// print result
for( int[] row: table ){
    for( int si: row ){
       ar[i][j]=si;
       j++;
    }
    j=0;
    i++;
  
}

i=0;
j=0;
// print result
for( int[] row: tabley ){
    for( int si: row ){
       ary[i][j]=si;
       j++;
    }
    j=0;
    i++;
}


/*for(int k=0;k<count;k++)
    {
        for(int l=0;l<nCol;l++)
        {
            System.out.print(ar[k][l]+" ");
        }
        System.out.println();
    }
for(int k=0;k<count;k++)
    {
        for(int l=0;l<nColy;l++)
        {
         
            //Matrix m = new Matrix(ar);
            System.out.print(ary[k][l]+" ");
        }
        System.out.println(); 
    }*/
            
            
            
            
    Matrix m = new Matrix(ar);
    Matrix m2 = new Matrix(ary);
    MultiLinear ml  = new MultiLinear(m,m2);
    Matrix result = ml.calculate(); 
    for(int i1=0;i1<result.getNrows();i1++){
        for(int j1 = 0;j1<result.getNcols();j1++)
        {
            System.out.print(result.getValueAt(i1, j1));
        }
    System.out.println();
    }
//MultiLinear(ar,ary);
}

}
