import java.awt.event.*;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.JTable;

public class BookControl implements ActionListener{
    private HomeView home;
    private RegisterView regis;
    private ConnectModel connect;
    private CheckOutView out;
    


    public BookControl() {
        home = new HomeView(); 
        home.setVisible(true); //หน้าแรก
        connect = new ConnectModel();
        regis = new RegisterView();
        out = new CheckOutView();
        
        regis.getSuccess().addActionListener(this);
        out.getSuccess().addActionListener(this);
        home.getjButton4().addActionListener(this);
        home.getjButton3().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(home.getjButton4())){ //จอง
            regis.setVisible(true);
            
        }else if(e.getSource().equals(home.getjButton3())){ //ออก
            out.setVisible(true);
            
        }else if(e.getSource().equals(regis.getSuccess())){ //ยืนยันหน้าจอง
            connect.checkIn(regis.getCarNum().getText(), regis.getDmy3().getSelectedItem()+"",regis.getDmy2().getSelectedItem()+"", 
            regis.getDmy().getSelectedItem()+"", regis.getTimeInHour().getSelectedItem()+"", regis.getTimeInMin().getSelectedItem()+"", regis.getColorCar().getSelectedItem()+"", regis.getTypeCar().getSelectedItem()+"");
            connect.ShowReciIn(regis.getCarNum().getText());
        }else if(e.getSource().equals(out.getSuccess())){ //ยืนยันหน้าออก
            connect.checkOut(out.getCarNum().getText(), out.getYear().getSelectedItem()+"",out.getMonth().getSelectedItem()+"", 
            out.getDay().getSelectedItem()+"", out.getHourOut().getSelectedItem()+"", out.getMinOut().getSelectedItem()+""); //เอาวัน/เวลาออกไปเก็บใน db
            try {
              connect.checkbill(out.getCarNum().getText()); //คิดเงิน
            } catch (SQLException | ParseException ex) {
                Logger.getLogger(BookControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            connect.ShowReci(out.getCarNum().getText()); //โชว์ใบเสร็จ
        }
        else if(e.getSource().equals(home.getjButton5())){ //ออก
            MessageFormat header = new MessageFormat("Table Data");
            MessageFormat footer = new MessageFormat("Page 0");
            PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
            try{
//            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
//            set.add(OrientationRequested.LANDSCAPE);
                home.getjTable1().print(JTable.PrintMode.FIT_WIDTH, header, footer);
                }catch(Exception error){
                    error.printStackTrace();
            }
        }
    }
    
    public static void main(String args[]) {
       new BookControl();
    }
}
