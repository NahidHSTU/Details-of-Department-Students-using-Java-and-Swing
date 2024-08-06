import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class takeId extends JFrame implements ActionListener {

    JComboBox studentNames;
    JButton see,back;
    Choice names;

    takeId(){
        super("Department of ECE");


        JLabel studentName=new JLabel("Students list");
        studentName.setBounds(150,20,180,40);
        studentName.setFont(new Font("Serif",Font.BOLD,22));
        studentName.setForeground(Color.BLACK);
        add(studentName);


        JLabel select=new JLabel("Select Student");
        select.setBounds(60,95,180,40);
        select.setFont(new Font("Serif",Font.BOLD,16));
        select.setForeground(Color.BLACK);
        add(select);

        String names[]={"Nahid Islam","Md Sobuj Rana","M Adeb Bin Nasem","Akmam Khan Mahin", "Rohan Piyash Pradhan","Ananna Kundu",
                        "Chaion Das","Samia Rahman Ratry","Moyna Roy","Md Fuwad Ali","Shuvo Kumer Debsharma","Md Shourov Ahamed",
                        "Md Harun Or Rashid","Rashedunnabi Rimon","Md Romjan Ali","Himael Rahman","Faozia Fariha Shinthi," ,
                        "Imtiaz Hossen Ifti","Azizul Hakim","Muhaiminul Mahmud Mahim","Rifat Islam Rose","Suborna Hasda","Md Sojib Hossain",
                        "Sod Mohammad Zim","Suraiya Parvin","Asif Iqbal Muhon","Sifat Adib","Jahin Maruf","Mohibullah Hasan","MKR Mithun",
                        "Happy Akter","Nusrat Jahan Mehebuba","Efaz Ahamed","Abdur Rauf Sohag","Mimma Khatun","Beman Chandra Bormon","Rasel Babu",
                        "Mohammad Atiqur Rahman","Sonjoy Soren","Shafiul Umam","Tamim Hasnat"};
        studentNames=new JComboBox(names);
        studentNames.setBounds(200,100,200,30);
        studentNames.addActionListener(this);
        add(studentNames);

//        names=new Choice();
//        names.setBounds(200,100,200,30);
//        names.add("Nahid Islam");
//        add(names);


        see=new JButton("See Details");
        see.setBounds(60,200,120,25);
        see.setFont(new Font("Serif",Font.BOLD,16));
        see.setForeground(Color.WHITE);
        see.setBackground(Color.BLACK);
        see.addActionListener(this);
        add(see);

        back=new JButton("Back");
        back.setBounds(270,200,120,25);
        back.setFont(new Font("Serif",Font.BOLD,16));
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        add(back);



        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/loginback.png"));
        Image i2=i1.getImage().getScaledInstance(450,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,450,300);
        add(image);




        ImageIcon icon=new ImageIcon(getClass().getResource("icon/logo.png"));
        this.setIconImage(icon.getImage());
        setSize(450,300);
        setLocation(450,200);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == see) {
            if (studentNames.getSelectedItem() == "Nahid Islam") {
                try {
                    JOptionPane.showMessageDialog(null, "See Nahid Islam's details");
                    new nahidInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (studentNames.getSelectedItem() == "Md Sobuj Rana") {
                try {
                    JOptionPane.showMessageDialog(null, "See Md Sobuj Rana's details");
                    new sobujInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (studentNames.getSelectedItem() == "M Adeb Bin Nasem") {
                try {
                    JOptionPane.showMessageDialog(null, "See M Adeb Bin Nasem's details");
                    new adebInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (studentNames.getSelectedItem() == "Akmam Khan Mahin") {
                try {
                    JOptionPane.showMessageDialog(null, "See Akmam Khan Mahin's details");
//                    new mahinInfo();
                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            else if (studentNames.getSelectedItem() == "Rohan Piyash Pradhan") {
                try {
                    JOptionPane.showMessageDialog(null, "See Rohan Piyash Pradhan's details");
                    new rohan();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            else if (studentNames.getSelectedItem() == "Ananna Kundu") {
                try {
                    JOptionPane.showMessageDialog(null, "See Ananna Kundu's details");
                    new anannaInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            else if (studentNames.getSelectedItem() == "Chaion Das") {
                try {
                    JOptionPane.showMessageDialog(null, "See Chaion Das's details");
                    new chaionInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Samia Rahman Ratry") {
                try {
                    JOptionPane.showMessageDialog(null, "See Samia Rahman Ratry's details");
                    new ratryInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Moyna Roy") {
                try {
                    JOptionPane.showMessageDialog(null, "See Moyna Roy's details");
                    new moynaInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Md Fuwad Ali") {
                try {
                    JOptionPane.showMessageDialog(null, "See Md Fuwad Ali's details");
                    new fuwadInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Shuvo Kumer Debsharma") {
                try {
                    JOptionPane.showMessageDialog(null, "See Shuvo Kumer Debsharma's details");
                    new shuvoInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if (studentNames.getSelectedItem() == "Md Shourov Ahamed") {
                try {
                    JOptionPane.showMessageDialog(null, "See Md. Shourov Ahamed's details");
                    new sourovInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Md Harun Or Rashid") {
                try {
                    JOptionPane.showMessageDialog(null, "See Md Harun Or Rahid's details");
                    new harunInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Rashedunnabi Rimon") {
                try {
                    JOptionPane.showMessageDialog(null, "See Rashedunnabi Rimon's details");
                    new rimonInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Faozia Fariha Shinthi") {
                try {
                    JOptionPane.showMessageDialog(null, "See Faozia Fariha Shinthi's details");
                    new shinthiInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Imtiaz Hossen Ifti") {
                try {
                    JOptionPane.showMessageDialog(null, "See Imtiaz Hossen Ifti's details");
                    new iftiInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Azizul Hakim") {
                try {
                    JOptionPane.showMessageDialog(null, "See Azizul Hakim's details");
                    new azizulInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Muhaiminul Mahmud Mahim") {
                try {
                    JOptionPane.showMessageDialog(null, "See Muhaiminul Mahmud Mahim's details");
                    new mahimInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }


            else if (studentNames.getSelectedItem() == "Md Romjan Ali") {
                try {
                    JOptionPane.showMessageDialog(null, "See Md Romjan Ali's details");
                    new romjanInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Himel Rahman") {
                try {
                    JOptionPane.showMessageDialog(null, "See Himel Rahman's details");
                    new himelnfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Rifat Islam Rose") {
                try {
                    JOptionPane.showMessageDialog(null, "See Rifat Islam Rose's details");
                    new roseInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Suborna Hasda") {
                try {
                    JOptionPane.showMessageDialog(null, "See Suborna Hasda's details");
                    new subornaInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Md Sojib Hossain") {
                try {
                    JOptionPane.showMessageDialog(null, "See Md Sojib Hossain's details");
                    new sojibInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Sod Mohammad Zim") {
                try {
                    JOptionPane.showMessageDialog(null, "See Sod Mohammad Zim's details");
                    new zimInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Suraiya Parvin") {
                try {
                    JOptionPane.showMessageDialog(null, "See Suraiya Parvin's details");
                    new parvinInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Asif Iqbal Muhin") {
                try {
                    JOptionPane.showMessageDialog(null, "See Asif Iqbal Muhin's details");
                    new muhinInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Sifat Adib") {
                try {
                    JOptionPane.showMessageDialog(null, "See Sifat Adib's details");
                    new adibInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Jahin Maruf") {
                try {
                    JOptionPane.showMessageDialog(null, "See Jahin Maruf's details");
                    new jahinInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Mohibullah Hasan") {
                try {
                    JOptionPane.showMessageDialog(null, "See Mohibullah Hasan's details");
                    new mohibullahInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "MKR Mithun") {
                try {
                    JOptionPane.showMessageDialog(null, "See MKR Mithun's details");
                    new mithunInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Happy Akter") {
                try {
                    JOptionPane.showMessageDialog(null, "See Happy Akter's details");
                    new happyInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Nusrat Jahan Mehebuba") {
                try {
                    JOptionPane.showMessageDialog(null, "See Nusrat Jahan Mehebuba's details");
                    new nusratInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Efaz Ahamed") {
                try {
                    JOptionPane.showMessageDialog(null, "See Efaz Ahamed's details");
                    new efazInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Abdur Rauf Sohag") {
                try {
                    JOptionPane.showMessageDialog(null, "See Abdur Rauf Shohag's details");
                    new sohagInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Mimma Khatun") {
                try {
                    JOptionPane.showMessageDialog(null, "See Mimma khatun's details");
                    new mimmaInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Beman Chandra Bormon") {
                try {
                    JOptionPane.showMessageDialog(null, "See Beman Chandra Bormon's details");
                    new bemanInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Rasel Babu") {
                try {
                    JOptionPane.showMessageDialog(null, "See Rasel Babu's details");
                    new raselInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Mohammad Atiqur Rahman") {
                try {
                    JOptionPane.showMessageDialog(null, "See Mohammad Atiqur Rahman's details");
                    new atiqInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Sonjoy Soren") {
                try {
                    JOptionPane.showMessageDialog(null, "See Sonjoy Soren's details");
                    new sonjoy();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Shafiul Umam") {
                try {
                    JOptionPane.showMessageDialog(null, "See Shafiul Umam's details");
                    new shafiulInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else if (studentNames.getSelectedItem() == "Tamim Hasnat") {
                try {
                    JOptionPane.showMessageDialog(null, "See Tamim Hasnat's details");
                    new tamimInfo();
//                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }





        }


        else if(ae.getSource()==back){
            try {
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }

        }


        }


    public static void main(String[] args) {
        new takeId();
    }
}

