import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class studentList extends JFrame {
    JList sList,sList2;
    studentList(){
        super("Department of ECE");


        JLabel s=new JLabel("Students List");
        s.setBounds(270,10,150,50);
        s.setFont(new Font("Serif",Font.BOLD,20));
        add(s);

        String names[]={"1. Nahid Islam","2. Md Sobuj Rana","3. M Adeb Bin Nasem","4. Akmam Khan Mahin", "5. Rohan Piyash Pradhan","6. Ananna Kundu",
                "7. Chaion Das","8. Samia Rahman Ratry","9. Moyna Roy","10. Md Fuwad Ali","11. Shuvo Kumer Debsharma","12. Md Shourov Ahamed",
                "13. Md Harun Or Rashid","14. Rashedunnabi Rimon","15. Md Romjan Ali","16. Himael Rahman","17. Faozia Fariha Shinthi," ,
                "18. Imtiaz Hossen Ifti","19. Azizul Hakim","20. Muhaiminul Mahmud Mahim","21. Rifat Islam Rose"};
        sList=new JList<>(names);
        sList.setBounds(10,80,300,420);
        sList.setFont(new Font("Tohoma",Font.ITALIC,13));
        sList.setForeground(Color.cyan);
        sList.setBackground(Color.darkGray);
        add(sList);

        String names1[]={"22. Suborna Hasda","23. Md Sojib Hossain",
                "24. Sod Mohammad Zim","25. Suraiya Parvin","26. Asif Iqbal Muhon","27. Sifat Adib","28. Jahin Maruf","29. Mohibullah Hasan","30. MKR Mithun",
                "31. Happy Akter","32. Nusrat Jahan Mehebuba","33. Efaz Ahamed","34. Abdur Rauf Sohag","35. Mimma Khatun","36. Beman Chandra Bormon","37. Rasel Babu",
                "38.Mohammad Atiqur Rahman","39. Sonjoy Soren","40. Shafiul Umam","41. Tamim Hasnat"};
        sList2=new JList<>(names1);
        sList2.setBounds(370,80,320,420);
        sList2.setFont(new Font("Tohoma",Font.ITALIC,13));
        sList2.setForeground(Color.cyan);
        sList2.setBackground(Color.darkGray);
//        sList2.addListSelectionListener(ListSelectionListener);
        add(sList2);



        ImageIcon icon=new ImageIcon(getClass().getResource("icon/logo.png"));
        this.setIconImage(icon.getImage());


        setSize(700,550);
        setLocation(400,150);
        setLayout(null);
        setVisible(true);

    }

//    public void actionPerformed(ActionEvent ae){
//
//        if (ae.getSource()=="1. Nahid Islam"){
//            try {
//                JOptionPane.showMessageDialog(null, "See Nahid Islam's details");
//                new nahidInfo();
//            }catch (Exception e){
//
//            }
//        }
//    }
    public static void main(String[] args) {
        new studentList();
    }
}
