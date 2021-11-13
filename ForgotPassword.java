//Forgot password page

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForgotPassword extends JFrame implements ActionListener {
    JLabel ltitle,luser,lsques,lsasns,lnpass,lcnpass,limage;
    JTextField tuser;
    ImageIcon img;
    JComboBox cbsques;
    JPasswordField psans, pnpass, pcnpass;
    JButton bsubmit, bsave, bback, bcancel;

    ForgotPassword() {
        setTitle("Forgot password");
//        getContentPane().setBackground(Color.lightGray);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ltitle = new JLabel("Forgot your password?");
        ltitle.setFont(new Font("Serif", Font.PLAIN, 30));
        ltitle.setBounds(870, 30, 600, 40);
        add(ltitle);
        ltitle.setVisible(true);

        luser = new JLabel("User Name");
        luser.setFont(new Font("Bold", Font.PLAIN, 20));
        luser.setBounds(770, 100, 150, 40);
        add(luser);
        luser.setVisible(true);

        tuser =new JTextField();
        tuser.setBounds(970,100,300,40);
        add(tuser);
        tuser.setVisible(true);

        lsques = new JLabel("Security question");
        lsques.setFont(new Font("Bold", Font.PLAIN, 20));
        lsques.setBounds(770, 160, 200, 40);
        add(lsques);
        lsques.setVisible(true);

        cbsques=new JComboBox();
        cbsques.setBounds(970,160,300,40);
        cbsques.addItem("--select--");
        cbsques.addItem("What is your first school name?");
        cbsques.addItem("Who is your favourite hero?");
        cbsques.addItem("Who is your first crush?");
        cbsques.addItem("What is your favourite food?");
        add(cbsques);
        cbsques.setVisible(true);

        lsasns = new JLabel("Answer");
        lsasns.setFont(new Font("Bold", Font.PLAIN, 20));
        lsasns.setBounds(770, 220, 150, 40);
        add(lsasns);
        lsasns.setVisible(true);

        psans=new JPasswordField();
        psans.setBounds(970,220,300,40);
        add(psans);
        psans.setVisible(true);

        bsubmit=new JButton("Submit");
        bsubmit.setFont(new Font("Bold", Font.PLAIN, 20));
        bsubmit.setBounds(900,280,250,40);
        add(bsubmit);
        bsubmit.setVisible(true);

        lnpass = new JLabel("Enter new password");
        lnpass.setFont(new Font("Bold", Font.PLAIN, 20));
        lnpass.setBounds(770, 350, 200, 40);
        add(lnpass);
        lnpass.setVisible(true);

        pnpass=new JPasswordField();
        pnpass.setBounds(970,350,300,40);
        add(pnpass);
        pnpass.setVisible(true);

        lcnpass = new JLabel("Confirm password");
        lcnpass.setFont(new Font("Bold", Font.PLAIN, 20));
        lcnpass.setBounds(770, 410, 200, 40);
        add(lcnpass);
        lcnpass.setVisible(true);

        pcnpass=new JPasswordField();
        pcnpass.setBounds(970,410,300,40);
        add(pcnpass);
        pcnpass.setVisible(true);

        bsave=new JButton("Save");
        bsave.setFont(new Font("Bold", Font.PLAIN, 20));
        bsave.setBounds(900,470,250,40);
        add(bsave);
//        bsave.addActionListener(this);

        bback=new JButton("Back");
        bback.setFont(new Font("Bold", Font.PLAIN, 20));
        bback.setBounds(770,540,150,40);
        add(bback);
        bback.addActionListener(this);

        bcancel=new JButton("Cancel");
        bcancel.setFont(new Font("Bold", Font.PLAIN, 20));
        bcancel.setBounds(1120,540,150,40);
        add(bcancel);
        bcancel.addActionListener(this);

        img= new ImageIcon("C:\\Users\\visha\\Myproject\\src\\Images\\forgot.jpg");

        limage=new JLabel();
        limage.setIcon((Icon) img);
        limage.setVisible(true);
        limage.setBounds(0,0,690,700);
        add(limage);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bback){
            Login l1=new Login();
            hide();
        }
        if(e.getSource()==bcancel){
            Login l1=new Login();
            hide();
        }
    }
}
