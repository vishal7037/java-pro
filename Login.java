import javax.swing.*;
//import javax.swing.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class Login extends JFrame implements ActionListener
{
    JLabel ltitle,ltitle1,luser, lpass, limage;
    ImageIcon img ;
    JTextField tuser;
    JPasswordField tpass;
    JCheckBox chshow;
    JButton blogin, bsighup, bchange, bforget, bexit;


//    constructor_______________________________________________________________________

    Login(){

//        frame______________________________________________________________

        setLayout(null);


//        TITLE______________________________________________________________
        ltitle = new JLabel("Login");
        ltitle.setFont(new Font("Serif", Font.PLAIN, 40));
        ltitle.setBounds(980, 30, 100, 50);
        add(ltitle);
        ltitle.setVisible(true);

        ltitle1=new JLabel("Doesn't have an account yet?");
        ltitle1.setBounds(840,100,400,30);
        ltitle1.setFont(new Font("Bold", Font.PLAIN, 20));
        add(ltitle1);
//         sign button_______________________________________________________________

        bsighup=new JButton("SignUp");
        bsighup.setBounds(1100,100,70,30);
        bsighup.setFont(new Font("Bold", Font.PLAIN, 11));
        add(bsighup);
        bsighup.addActionListener(this);

//        user_________________________________________________________________
        luser=new JLabel("User Name");
        luser.setFont(new Font("Serif", Font.PLAIN, 30));
        luser.setBounds(840,170,200,30);
        add(luser);

        tuser=new JTextField("username");
        tuser.setBounds(840,210,370,40);
        add(tuser);

        tuser.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(tuser.getText().equals("username"))
                {
                    tuser.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(tuser.getText().equals("")){
                    tuser.setText("username");
                }
            }
        });

//        password_____________________________________________________________
        lpass=new JLabel("Password");
        lpass.setBounds(840,270,200,30);
        lpass.setFont(new Font("Serif", Font.PLAIN, 30));
        add(lpass);
        
        tpass=new JPasswordField();
        tpass.setBounds(840,310,370,40);
        add(tpass);

//        checkbox_______________________________________________________________
        chshow=new JCheckBox("show password");
        chshow.setBounds(840,350,200,40);
        chshow.setFont(new Font("Bold", Font.PLAIN, 20));
        add(chshow);

//        buttons____________________________________________________________

        blogin =new JButton("login");
        blogin.setBounds(900,420,250,42);
        blogin.setFont(new Font("Bold", Font.PLAIN, 30));
        add(blogin);
        blogin.addActionListener(this);

        bchange=new JButton("Change password");
        bchange.setBounds(840,500,150,40);
        add(bchange);
        bchange.addActionListener(this);

        bforget= new JButton("Forgot password");
        bforget.setBounds(1060,500,150,40);
        add(bforget);
        bforget.addActionListener(this);

        bexit =new JButton("Exit");
        bexit.setBounds(1110,580,100,40);
        add(bexit);
        bexit.addActionListener(this);

//        image____________________________________________________________________

        img= new ImageIcon("C:\\Users\\visha\\Myproject\\src\\Images\\login.jpeg");
        limage=new JLabel();
        limage.setIcon((Icon) img);
        limage.setVisible(true);
        limage.setBounds(0,0,690,700);
        add(limage);

        setTitle("Login Form");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

//    main function________________________________________________________________________________________

    public static void main(String[] args){
        Login n=new Login();
//        SignUp s1=new SignUp();
//        ForgotPassword f1=new ForgotPassword();
//        ChangePassword c1=new ChangePassword();
//        Main m= new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bchange){
            ChangePassword c1 =new ChangePassword();
            hide();
        }
        if(e.getSource()==bforget){
            ForgotPassword f1 =new ForgotPassword();
            hide();
        }
        if(e.getSource()==bsighup){
            SignUp s1 =new SignUp();
            hide();
        }
        if(e.getSource()==bexit){
            System.exit(0);
        }
        if(e.getSource()==blogin){
//            Main m=new Main();
//            hide();
        }
    }
}

