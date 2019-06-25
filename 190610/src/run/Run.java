package run;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import DB.DBConnection;

public class Run {
   public static void main(String args[]){
      Connection conn = null; // DB����� ����(����)�� ���� ��ü
      PreparedStatement pstm = null;  // SQL ���� ��Ÿ���� ��ü
      ResultSet rs = null;  // �������� �����Ϳ� ���� ��ȯ���� ���� ��ü

      try {

         conn = DBConnection.getConnection();
         Scanner sc = new Scanner(System.in);
         while(true) {
            pstm = conn.prepareStatement("SELECT * FROM susi");
            rs = pstm.executeQuery();
            while(rs.next()){
               String name = rs.getString(1);
               int price = rs.getInt(2);
               String result = name + " " + price;
               System.out.println(result);
            }
            System.out.println("�޴� ����( 1 ����, 9 Ż�� ) :");
            int num = sc.nextInt();
            sc.nextLine();
            switch(num) {
            case 1:
               System.out.println("�ʹ� �̸� �Է� : ");
               String name = sc.nextLine();
               System.out.println("�ʹ� ���� �Է� : ");
               int price = sc.nextInt();
               sc.nextLine();
               String query = "insert into susi(name, price) values('"+name+"', "+price+")";
               pstm = conn.prepareStatement(query);
               pstm.executeQuery();
               //insert into susi(name, price) values('����ʹ�', 5000);
               break;
            case 9:
               return;
            }
         }
      } catch (SQLException sqle) {
         System.out.println("SELECT������ ���� �߻�");
         sqle.printStackTrace();

      }finally{
         // DB ������ �����Ѵ�.
         try{
            if ( rs != null ){rs.close();}   
            if ( pstm != null ){pstm.close();}   
            if ( conn != null ){conn.close(); }
         }catch(Exception e){
            throw new RuntimeException(e.getMessage());
         }

      }
   }
}