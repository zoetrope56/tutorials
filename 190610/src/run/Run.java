package run;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import DB.DBConnection;

public class Run {
   public static void main(String args[]){
      Connection conn = null; // DB연결된 상태(세션)을 담은 객체
      PreparedStatement pstm = null;  // SQL 문을 나타내는 객체
      ResultSet rs = null;  // 쿼리문을 날린것에 대한 반환값을 담을 객체

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
            System.out.println("메뉴 선택( 1 삽입, 9 탈출 ) :");
            int num = sc.nextInt();
            sc.nextLine();
            switch(num) {
            case 1:
               System.out.println("초밥 이름 입력 : ");
               String name = sc.nextLine();
               System.out.println("초밥 가격 입력 : ");
               int price = sc.nextInt();
               sc.nextLine();
               String query = "insert into susi(name, price) values('"+name+"', "+price+")";
               pstm = conn.prepareStatement(query);
               pstm.executeQuery();
               //insert into susi(name, price) values('장어초밥', 5000);
               break;
            case 9:
               return;
            }
         }
      } catch (SQLException sqle) {
         System.out.println("SELECT문에서 예외 발생");
         sqle.printStackTrace();

      }finally{
         // DB 연결을 종료한다.
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