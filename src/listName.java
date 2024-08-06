import javax.imageio.stream.IIOByteBuffer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class listName extends JFrame implements ActionListener {

    JButton members,about,back;

    listName(){
        super("Department of Electronics and Communication Engineering");

        members=new JButton("See Students");
        members.setBounds(40,110,250,100);
        members.setFont(new Font("Serif",Font.ITALIC,30));
        members.setBackground(Color.GRAY);
        members.setForeground(Color.orange);
        members.addActionListener(this);
        add(members);

        about=new JButton("About");
        about.setBounds(40,320,250,100);
        about.setFont(new Font("Serif",Font.ITALIC,30));
        about.setBackground(Color.GRAY);
        about.setForeground(Color.orange);
        about.addActionListener(this);
        add(about);

        back=new JButton("Back");
        back.setBounds(40,540,250,100);
        back.setFont(new Font("Serif",Font.ITALIC,30));
        back.setBackground(Color.GRAY);
        back.setForeground(Color.orange);
        back.addActionListener(this);
        add(back);

//        JLabel text=new JLabel("We are like a family...");
//        text.setBounds(700,40,550,30);
//        text.setFont(new Font("Serif",Font.BOLD,30));
//        text.setForeground(Color.MAGENTA);
//        add(text);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/pic.jpg"));
        Image i2=i1.getImage().getScaledInstance(1850,980,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1850,980);
        add(image);


        ImageIcon icon=new ImageIcon(getClass().getResource("icon/logo.png"));
        this.setIconImage(icon.getImage());

//        ImageIcon icon=new ImageIcon(getClass().getResource("icon/logo.png"));
//        this.setIconImage(icon.getImage());

//        getContentPane().setBackground(Color.GRAY);
        setSize(1780,960);
        setLocation(0,0);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==members){
            try{
                new popup();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==about){
            try {
                new aboutUs();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new listName();
    }
}
