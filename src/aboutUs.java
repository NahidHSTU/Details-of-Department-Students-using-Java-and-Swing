import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aboutUs extends JFrame  implements ActionListener {

    JButton back,aboutDept,aboutDeveloper;

    aboutUs(){
        super("About Section");
        getContentPane().setBackground(new Color(0xFC007E));

        aboutDept=new JButton("About Department");
        aboutDept.setBounds(90,50,200,40);
        aboutDept.setFont(new Font("Serif",Font.ITALIC,20));
        aboutDept.setForeground(Color.BLACK);
        aboutDept.setBackground(Color.LIGHT_GRAY);
        aboutDept.addActionListener(this);
        add(aboutDept);

        aboutDeveloper=new JButton("About Developer");
        aboutDeveloper.setBounds(90,140,200,40);
        aboutDeveloper.setFont(new Font("Serif",Font.ITALIC,20));
        aboutDeveloper.setForeground(Color.BLACK);
        aboutDeveloper.setBackground(Color.LIGHT_GRAY);
        aboutDeveloper.addActionListener(this);
        add(aboutDeveloper);




        back=new JButton("Back");
        back.setBounds(230,240,100,30);
        back.setFont(new Font("Serif",Font.BOLD,20));
        back.setForeground(Color.YELLOW);
        back.setBackground(Color.BLUE);
        back.addActionListener(this);
        add(back);


        ImageIcon icon=new ImageIcon(getClass().getResource("icon/logo.png"));
        this.setIconImage(icon.getImage());

        setSize(400,350);
        setLocation(450,200);
        setLayout(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==aboutDept){
            try {
                new aboutDept();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else if (ae.getSource()==aboutDeveloper){
            try {
                new aboutDevelopers();
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new aboutUs();
    }
}
