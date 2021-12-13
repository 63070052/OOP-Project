

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class CheckOutView extends javax.swing.JFrame {

    public CheckOutView() {
        initComponents();
        setSize(1000, 600);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        dmy1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        daymy = new javax.swing.JLabel();
        CarNum = new javax.swing.JLabel();
        carNum = new javax.swing.JTextField();
        Time = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        day = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        Success = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        hourOut = new javax.swing.JComboBox<>();
        minOut = new javax.swing.JComboBox<>();

        label1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("วัน / เดือน / ปี");

        label2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("ป้ายทะเบียน");

        Label3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label3.setForeground(new java.awt.Color(255, 255, 255));
        Label3.setText("สีรถ");

        Label4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label4.setForeground(new java.awt.Color(255, 255, 255));
        Label4.setText("ประเภทรถ");

        Label5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label5.setForeground(new java.awt.Color(255, 255, 255));
        Label5.setText("เวลาเข้า");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(61, 67, 151));

        daymy.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        daymy.setForeground(new java.awt.Color(255, 255, 255));
        daymy.setText("วัน / เดือน / ปี");

        CarNum.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CarNum.setForeground(new java.awt.Color(255, 255, 255));
        CarNum.setText("ป้ายทะเบียน");

        carNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carNumActionPerformed(evt);
            }
        });

        Time.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Time.setForeground(new java.awt.Color(255, 255, 255));
        Time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time.setText("เวลาออก");

        day.setBackground(new java.awt.Color(190, 138, 255));
        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2020", "2019", "2018", "2017", "2016", "2015" }));

        Success.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Success.setText("สำเร็จ");
        Success.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuccessActionPerformed(evt);
            }
        });

        Cancel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Cancel.setText("ยกเลิก");

        hourOut.setBackground(new java.awt.Color(190, 138, 255));
        hourOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));

        minOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(334, 334, 334))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(daymy)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CarNum)
                            .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(Success, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(carNum, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(hourOut, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(minOut, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(daymy)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CarNum)
                            .addComponent(carNum, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 77, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Time)
                            .addComponent(hourOut, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minOut, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(138, 138, 138)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Success, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carNumActionPerformed

    private void SuccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuccessActionPerformed
  
    }//GEN-LAST:event_SuccessActionPerformed

    public JTextField getCarNum() {
        return carNum;
    }

    public JButton getCancel() {
        return Cancel;
    }

    public JButton getSuccess() {
        return Success;
    }

    public JComboBox<String> getDay() {
        return day;
    }

    public JComboBox<String> getMonth() {
        return month;
    }

    public JComboBox<String> getYear() {
        return year;
    }

    public JComboBox<String> getHourOut() {
        return hourOut;
    }

    public void setHourOut(JComboBox<String> hourOut) {
        this.hourOut = hourOut;
    }

    public JComboBox<String> getMinOut() {
        return minOut;
    }

    public void setMinOut(JComboBox<String> minOut) {
        this.minOut = minOut;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JLabel CarNum;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JButton Success;
    private javax.swing.JLabel Time;
    private javax.swing.JTextField carNum;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JLabel daymy;
    private javax.swing.JTextField dmy1;
    private javax.swing.JComboBox<String> hourOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JComboBox<String> minOut;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
