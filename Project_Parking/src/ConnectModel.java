import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectModel { //conncet database
    private RecieptCheckoutView reciOut;
    private RecieptCheckinView reciIn;
    private ResultSet rs=null;

    public Connection ConnectDB(){ //เชื่อม db
         try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/parking?useUnicode=true&characterEncoding=utf-8";
            Connection con = DriverManager.getConnection(url, "root", "");

            return con;
             } 
        catch (Exception e) {
            e.printStackTrace();   
        }
        return null;
    }
    
    public void checkIn(String carNum, String year, String month , String day, String hour, String minute, String ColorCar, String TypeCar){ 
        /////// เอาเวลาเข้า เข้าไปเก็บใน db ///////
        String timeIn = year + "-" + month + "-" + day + " " + hour +":" + minute + ":0" ;
         try {
            String sql = "insert into Parking_list_2 (name, colorCar, typeCar, dateTimeIn) values (?, ?, ?, ?)";
            PreparedStatement pstmt = ConnectDB().prepareStatement(sql);
            pstmt.setString(1, carNum);
            pstmt.setString(2, ColorCar);
            pstmt.setString(3, TypeCar);
            pstmt.setString(4, timeIn);
            pstmt.executeUpdate();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e);  
        }
    }
    
    public void checkOut(String carNum, String year, String month , String day, String hour, String minute){ //เอาเวลาออก เข้าไปเก็บใน db
           String timeOut = year + "-" + month + "-" + day + " " + hour +":" + minute + ":0" ;
           try {
            String sql = "update Parking_list_2 set dateTimeOut = ? where name = ?";
            PreparedStatement pstmt = ConnectDB().prepareStatement(sql);
            pstmt.setString(1, timeOut);
            pstmt.setString(2, carNum);
            pstmt.executeUpdate();
            } 
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e);
                e.printStackTrace();   
            }
       }
    
    public void checkbill(String carNum) throws SQLException, ParseException{ //คิดชั่วโมงที่จอด, คิดเงิน และ เอาเข้าไปเก็บใน db
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
        try {
            ///// เอาข้อมูลจาก db ออกมาคำนวน /////
            String dateTimeIn="", dateTimeOut="", typeCar="";
            String sql = "SELECT * FROM parking_list_2 WHERE name = ?";
            PreparedStatement st = ConnectDB().prepareStatement(sql);
            st.setString(1, carNum);
            rs = st.executeQuery();
            
            while (rs.next())
            {
                dateTimeIn = rs.getString("dateTimeIn");
                dateTimeOut = rs.getString("dateTimeOut");
                typeCar = rs.getString("typeCar");
            }
            
            ///// คำนวน /////
            java.util.Date start = df.parse(dateTimeIn);
            java.util.Date end = df.parse(dateTimeOut);

            long diff = end.getTime() - start.getTime();
            int dayDiff = (int) (diff / (24 * 60 * 60 * 1000));
            int hourDiff = (int) (diff / (60 * 60 * 1000) % 24);
            int minuteDiff = (int) (diff / (60 * 1000) % 60);
            int hour = (int) ((dayDiff * 24)+ (hourDiff) + (minuteDiff/60));
            int money = 0;

            if (typeCar.equals("2 ล้อ")){
                money = 20 * hour;
            }else if(typeCar.equals("4 ล้อ")){
                money = 25 * hour;
            }else if(typeCar.equals("6 ล้อ")){
                money = 30 * hour;
            }else if(typeCar.equals("8 ล้อ")){
                money = 35 * hour;
            }
            
            /////// เอาเข้าไปเก็บใน db ///////
            String sql2 = "update Parking_list_2 set countHour = ?, price = ? where name = ?";
            PreparedStatement pstmt = ConnectDB().prepareStatement(sql2);
            pstmt.setInt(1, hour);
            pstmt.setInt(2, money);
            pstmt.setString(3, carNum);
            pstmt.executeUpdate();

        } catch (SQLException e) {
                Logger.getLogger(BookControl.class.getName()).log(Level.SEVERE, null, e);// TODO Auto-generated catch block
                System.out.println(e);
        }
    }
    
    public void ShowReci(String carNum){
        /////// ดึงข้อมูลจาก db มาแสดงที่หน้า view (RecieptCheckoutView) ///////
        String name="", colorCar="", typeCar="", dateTimeIn="", dateTimeOut="", countHour="", price="";   
        try{
           String sql = "SELECT * FROM parking_list_2 WHERE name = ?";
           PreparedStatement st = ConnectDB().prepareStatement(sql);
           st.setString(1, carNum);
           rs = st.executeQuery();
           while (rs.next())
           {
                dateTimeIn = rs.getString("dateTimeIn");
                dateTimeOut = rs.getString("dateTimeOut");
                name = rs.getString("name");
                colorCar = rs.getString("colorCar");
                typeCar = rs.getString("typeCar");
                countHour = rs.getString("countHour");
                price = rs.getString("price");
           }
            reciOut = new RecieptCheckoutView();
            reciOut.getjTextField1().setText(name);
            reciOut.getjTextField4().setText(colorCar);
            reciOut.getjTextField5().setText(typeCar);
            reciOut.getjTextField6().setText(dateTimeIn);
            reciOut.getjTextField8().setText(dateTimeOut);
            reciOut.getjTextField2().setText(countHour);
            reciOut.getjTextField3().setText(price);
            reciOut.setVisible(true);
         }
         catch (SQLException e)
         {
           System.out.println(e);
           System.err.println("Got an exception! ");
           System.err.println(e.getMessage());
         }
    }
    
    public void ShowReciIn(String carNum){
        /////// ดึงข้อมูลจาก db มาแสดงที่หน้า view (RecieptCheckInView) ///////
        String name="", colorCar="", typeCar="", dateTimeIn="";   
        try{
           String sql = "SELECT * FROM parking_list_2 WHERE name = ?";
           PreparedStatement st = ConnectDB().prepareStatement(sql);
           st.setString(1, carNum);
           rs = st.executeQuery();
           while (rs.next())
           {
                dateTimeIn = rs.getString("dateTimeIn");
                name = rs.getString("name");
                colorCar = rs.getString("colorCar");
                typeCar = rs.getString("typeCar");
           }
            reciIn = new RecieptCheckinView();
            reciIn.getjTextField1().setText(name);
            reciIn.getjTextField2().setText(colorCar);
            reciIn.getjTextField3().setText(typeCar);
            reciIn.getjTextField4().setText(dateTimeIn);
            
            reciIn.setVisible(true);
         }
         catch (SQLException e)
         {
           System.out.println(e);
           System.err.println("Got an exception! ShowReciIn");
           System.err.println(e.getMessage());
         }
    }
    
}