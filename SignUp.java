import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class SignUp extends JFrame implements ActionListener
{
    JLabel ltitle, lfname, llname, luser, lpass, lcpass, lsec, lans,limage,lsideImg,lemail,ldob,lmob;
    JTextField tfname, tlname, tuser,temail,tdob,tmob;
    JPasswordField ppass, pcpass, pans;
    JComboBox cbsec;
    ImageIcon img;
    JButton bsignUp, bclear, bback, bexit;

    SignUp(){
        setTitle("SignUp Form");
        setLayout(null);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        ltitle = new JLabel("Sign up now");
        ltitle.setFont(new Font("Bold", Font.PLAIN, 40));
        ltitle.setBounds(550, 35, 250, 50);
        add(ltitle);
        ltitle.setVisible(true);

        lfname =new JLabel("First Name");
        lfname.setBounds(180,140,150,30);
        lfname.setFont(new Font("Serif", Font.PLAIN, 20));
        add(lfname);

        tfname= new JTextField();
        tfname.setBounds(380,140,250,30);
        tfname.setOpaque(false);
        add(tfname);

        llname= new JLabel("Last Name");
        llname.setBounds(720,140,150,30);
        llname.setFont(new Font("Serif", Font.PLAIN, 20));
        add(llname);

        tlname= new JTextField();
        tlname.setBounds(900,140,250,30);
        tlname.setOpaque(false);
        add(tlname);

        luser= new JLabel("User Name");
        luser.setFont(new Font("Serif", Font.PLAIN, 20));
        luser.setBounds(180,210,150,30);
        add(luser);

        tuser =new JTextField();
        tuser.setBounds(380,210,250,30);
        tuser.setOpaque(false);
        add(tuser);

        ldob= new JLabel("Date of birth");
        ldob.setFont(new Font("Serif", Font.PLAIN, 20));
        ldob.setBounds(720,210,200,30);
        add(ldob);

        tdob= new JTextField();
        tdob.setOpaque(false);
        tdob.setBounds(900,210,250,30);
        add(tdob);

        lemail= new JLabel("Email-Id");
        lemail.setFont(new Font("Serif", Font.PLAIN, 20));
        lemail.setBounds(180,280,150,30);
        add(lemail);

        temail =new JTextField();
        temail.setBounds(380,280,250,30);
        temail.setOpaque(false);
        add(temail);

        lmob= new JLabel("Mobile No");
        lmob.setFont(new Font("Serif", Font.PLAIN, 20));
        lmob.setBounds(720,280,200,30);
        add(lmob);

        tmob = new JTextField();
        tmob.setBounds(900,280,250,30);
        tmob.setOpaque(false);
        add(tmob);

        lpass=new JLabel("Password");
        lpass.setFont(new Font("Serif", Font.PLAIN, 20));
        lpass.setBounds(180,350,150,30);
        add(lpass);

        ppass =new JPasswordField();
        ppass.setBounds(380,350,250,30);
        ppass.setOpaque(false);
        add(ppass);

        lcpass=new JLabel("Confirm Password");
        lcpass.setFont(new Font("Serif", Font.PLAIN, 20));
        lcpass.setBounds(720,350,200,30);
        add(lcpass);

        pcpass =new JPasswordField();
        pcpass.setBounds(900,350,250,30);
        pcpass.setOpaque(false);
        add(pcpass);

        lsec=new JLabel("Security Question");
        lsec.setFont(new Font("Serif", Font.PLAIN, 20));
        lsec.setBounds(180,420,200,30);
        add(lsec);

        cbsec=new JComboBox();
        cbsec.addItem("--select--");
        cbsec.addItem("What is your first school name?");
        cbsec.addItem("Who is your favourite hero?");
        cbsec.addItem("What is your favourite food?");
        cbsec.addItem("Who is your first crush?");
        cbsec.setBounds(380,420,330,30);
        add(cbsec);

        lans =new JLabel("Answer");
        lans.setBounds(720,420,150,30);
        lans.setFont(new Font("Serif", Font.PLAIN, 20));
        add(lans);

        pans= new JPasswordField();
        pans.setBounds(900,420,250,30);
        pans.setOpaque(false);
        add(pans);

        bsignUp =new JButton("Sign Up");
        bsignUp.setFont(new Font("Bold", Font.PLAIN, 20));
        bsignUp.setBounds(180,520,200,40);
        add(bsignUp);

        bclear=new JButton("Clear");
        bclear.setFont(new Font("Bold", Font.PLAIN, 20));
        bclear.setBounds(565,520,200,40);
        add(bclear);
        bclear.addActionListener(this);

        bback=new JButton("Back");
        bback.setFont(new Font("Bold", Font.PLAIN, 20));
        bback.setBounds(950,520,200,40);
        add(bback);
        bback.addActionListener(this);

        img= new ImageIcon("C:\\Users\\visha\\Myproject\\src\\Images\\signUP.png");

        limage=new JLabel();
        limage.setIcon((Icon) img);
        limage.setVisible(true);
        limage.setBounds(0,0,1368,708);
        add(limage);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bback){
            Login l1=new Login();
            hide();
        }
        if(e.getSource()==bclear){
            Login l1=new Login();
            hide();
        }
    }
}
