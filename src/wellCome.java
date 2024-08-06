import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class wellCome extends JFrame implements Runnable{

    Thread t;

    wellCome(){
        super("Department of Electronics and Communication Engineering");

        t=new Thread(this);
        t.start();


        JLabel heading=new JLabel("Assalamualaikum Everyone");
        heading.setBounds(150,20,450,30);
        heading.setFont(new Font("Serif",Font.BOLD,30));
        heading.setForeground(new Color(252, 210, 223));
        add(heading);

        JLabel wellcome=new JLabel("We are ECE-23 Batch");
        wellcome.setBounds(70,160,590,70);
        wellcome.setFont(new Font("Serif",Font.BOLD,60));
        wellcome.setForeground(new Color(252, 210, 223));
        add(wellcome);


        ImageIcon icon=new ImageIcon(getClass().getResource("icon/logo.png"));
        setIconImage(icon.getImage());
        getContentPane().setBackground(Color.GRAY);
        setSize(700,450);
        setLocation(400,150);
        setLayout(null);
        setVisible(true);



    }

    @Override
    public void run() {
        try{
            Thread.sleep(4000);
            setVisible(false);
            new listName();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new wellCome();
    }
}
