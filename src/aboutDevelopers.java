import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aboutDevelopers extends JFrame implements ActionListener {
    JButton back;

    aboutDevelopers(){
        super("About Developers");

        JLabel name=new JLabel("Nahid Islam");
        name.setBounds(20,200,160,35);
        name.setFont(new Font("Serif",Font.BOLD,22));
        add(name);
        JLabel dept=new JLabel("Department of Electronics and Communication Engineering");
        dept.setBounds(20,240,700,35);
        dept.setFont(new Font("Serif",Font.ITALIC,22));
        add(dept);
        JLabel campus=new JLabel("Hajee Mohammad Danesh Science and Technology University");
        campus.setBounds(20,280,700,35);
        campus.setFont(new Font("Serif",Font.ITALIC,22));
        add(campus);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/unnamed.jpg"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel img=new JLabel(i3);
        img.setBounds(240,15,200,200);
        add(img);

        back =new JButton("Back");
        back.setBounds(520,330,100,25);
        back.setFont(new Font("Serif",Font.PLAIN,18));
        back.addActionListener(this);
        add(back);


        ImageIcon icon=new ImageIcon(getClass().getResource("icon/logo.png"));
        this.setIconImage(icon.getImage());


        setSize(700,400);
        setLocation(300,120);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            try {
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        new aboutDevelopers();
    }
}
