import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class raselInfo extends JFrame implements ActionListener {
    JButton back;

    raselInfo(){
        super("Department of Electronics and Communication Engineering");
//        getContentPane().setBackground(new Color(0x00DFFC));

        JLabel name=new JLabel("Rasel Babu");
        name.setBounds(80,20,250,50);
        name.setFont(new Font("Serif",Font.ITALIC,40));
        add(name);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/second.png"));
        Image i2=i1.getImage().getScaledInstance(350,350,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel img=new JLabel(i3);
        img.setBounds(400,70,350,350);
//        img.setBorder(Color.MAGENTA,);
        add(img);




        JLabel studentId=new JLabel("Student ID: 2302176");
        studentId.setBounds(80,150,250,50);
        studentId.setFont(new Font("Serif",Font.BOLD,20));
        studentId.setForeground(Color.BLACK);
        add(studentId);

        JLabel phn=new JLabel("Phone Number: 01640194742");
        phn.setBounds(80,200,250,50);
        phn.setFont(new Font("Serif",Font.BOLD,20));
        phn.setForeground(Color.BLACK);
        add(phn);

        JLabel address=new JLabel("Address: Dinajpur");
        address.setBounds(80,250,250,50);
        address.setFont(new Font("Serif",Font.BOLD,20));
        address.setForeground(Color.BLACK);
        add(address);

        JLabel blood=new JLabel("Blood Group: --");
        blood.setBounds(80,300,250,50);
        blood.setFont(new Font("Serif",Font.BOLD,20));
        blood.setForeground(Color.BLACK);
        add(blood);

        back=new JButton("Back");
        back.setBounds(600,500,100,25);
        back.setBackground(Color.GRAY);
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Tohoma",Font.BOLD,19));
        back.addActionListener(this);
        add(back);


        ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("icon/loginback.png"));
        Image i21=i11.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
        ImageIcon i31=new ImageIcon(i21);
        JLabel img1=new JLabel(i31);
        img1.setBounds(0,0,800,600);
//        img.setBorder(Color.MAGENTA,);
        add(img1);

        ImageIcon icon=new ImageIcon(getClass().getResource("icon/logo.png"));
        this.setIconImage(icon.getImage());

        setSize(800,600);
        setLocation(300,90);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            try {
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new raselInfo();
    }
}
