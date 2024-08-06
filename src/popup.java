import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class popup extends JFrame implements ActionListener {
    JButton button1,button2,back;
    popup(){
        super("Department of ECE");

        button1=new JButton("See Students List");
        button2=new JButton("See Student Details");
        button1.setSize(300,200);
        button2.setSize(300,200);
//        button1.setBackground(Color.BLACK);
//        button2.setBackground(Color.BLACK);
//        button1.setForeground(Color.WHITE);
//        button2.setForeground(Color.WHITE);
        button1.setBounds(150,70,300,50);
        button2.setBounds(150,140,300,50);
        button1.setFont(new Font("Serif",Font.BOLD,18));
        button2.setFont(new Font("Serif",Font.BOLD,18));
        button2.addActionListener(this);
        button1.addActionListener(this);
        add(button1);
        add(button2);

        back=new JButton("Back");
        back.setBounds(540,220,80,30);
        back.setFont(new Font("Serif",Font.BOLD,18));
        back.addActionListener(this);
        add(back);



        ImageIcon icon=new ImageIcon(getClass().getResource("icon/logo.png"));
        this.setIconImage(icon.getImage());


        setSize(700,300);
        setLocation(400,150);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==button1)
            try {
                setVisible(false);
                new studentList();
            }catch (Exception e){
                e.printStackTrace();
            }
        else if (ae.getSource()==button2) {
            try {
                setVisible(false);
                new takeId();
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new popup();
    }
}
