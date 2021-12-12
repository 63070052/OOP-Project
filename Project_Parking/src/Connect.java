
import java.sql.*;

public class Connect { //conncet database kub
    private Register register;
    private BookControl control;
    private Connection con;
    
    private Statement st;
//    private String carNum, dmy3, dmy, dmy2, ColorCar, TypeCar, TimeInHour, TimeInMin, TimeInAMPM;

    public Connect() {
        
    }
    
    
    public static Connection ConnectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/parking";
            Connection con = DriverManager.getConnection(url, "root", "");
          
        } catch (Exception e) {
            e.printStackTrace();   
        }
        return null;
    }
    public void register(String carNum, String dmy3, String dmy){
//        carNum = register.getCarNum().getText();
//        dmy3 = (String) register.getDmy3().getSelectedItem();
//        dmy = (String) register.getDmy().getSelectedItem();
//        dmy2 = (String) register.getDmy2().getSelectedItem();
//        ColorCar =(String) register.getColorCar().getSelectedItem();
//        TypeCar = (String) register.getTypeCar().getSelectedItem();
//        TimeInHour = (String) register.getTimeInHour().getSelectedItem();
//        TimeInMin = (String) register.getTimeInMin().getSelectedItem();
//        TimeInAMPM = (String) register.getTimeInAMPM().getSelectedItem();


//        private String carNumber;
//        private int dayIn, dayOut, monthIn, monthOut, yearIn, yearOut;
//        private int timeInHour, timeInMin;
//        private int timeOutHour, timeOutMin;
//        private int Parking; //2 4 6 8
//        private int countcar2=20, countcar4=20, countcar6=20, countcar8=20;
//        private String colorCar;
      
        System.out.println(carNum+" "+dmy3+" "+dmy);
//        
//        st= con.createStatement();
//        st.updateString("carNumber", carNum);
//        System.out.println(dmy2+ " " +ColorCar+ " "+ TypeCar+" "+TimeInHour+" "+TimeInMin+" "+TimeInAMPM);
    }

}
