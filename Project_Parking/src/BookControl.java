import java.awt.event.*;
public class BookControl implements ActionListener{
private Register regis;
private Connect connect;

    public BookControl() {
        regis = new Register();
        connect = new Connect();
        regis.getSuccess().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(regis.getSuccess())){
            connect.register(regis.getCarNum().getText(), regis.getDmy3().getSelectedItem()+"",regis.getDmy().getSelectedItem()+"");
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
       new BookControl();

    }
}
