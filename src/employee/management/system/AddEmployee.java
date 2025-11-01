package employee.management.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AddEmployee extends JFrame implements ActionListener {

    Random ran = new Random();
    int number = ran.nextInt(999999);

    JTextField tname, tfname, taddress, tdesignation, tphone, tadhar, temail, tsalary;
    JLabel tempid;
    JDateChooser tdob;
    JComboBox BoxEducation;
    JButton add, back;

    AddEmployee() {

        getContentPane().setBackground(new Color(163, 255, 188));
        setLayout(null);

        JLabel heading = new JLabel("Add Employee Details");
        heading.setBounds(320, 30, 500, 30);
        heading.setFont(new Font("serif", Font.BOLD, 25));
        add(heading);

        // Name
        JLabel name = new JLabel("Name");
        name.setBounds(50, 150, 150, 30);
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(name);

        tname = new JTextField();
        tname.setBounds(200, 150, 150, 30);
        tname.setBackground(new Color(177, 252, 197));
        add(tname);

        // Father's Name
        JLabel fname = new JLabel("Father's Name");
        fname.setBounds(400, 150, 150, 30);
        fname.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(fname);

        tfname = new JTextField();
        tfname.setBounds(600, 150, 150, 30);
        tfname.setBackground(new Color(177, 252, 197));
        add(tfname);

        // Date of Birth
        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(50, 200, 150, 30);
        dob.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(dob);

        tdob = new JDateChooser();
        tdob.setBounds(200, 200, 150, 30);
        tdob.setBackground(new Color(177, 252, 197));
        add(tdob);

        // Salary
        JLabel salary = new JLabel("Salary");
        salary.setBounds(400, 200, 150, 30);
        salary.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(salary);

        tsalary = new JTextField();
        tsalary.setBounds(600, 200, 150, 30);
        tsalary.setBackground(new Color(177, 252, 197));
        add(tsalary);

        // Address
        JLabel address = new JLabel("Address");
        address.setBounds(50, 250, 150, 30);
        address.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(address);

        taddress = new JTextField();
        taddress.setBounds(200, 250, 150, 30);
        taddress.setBackground(new Color(177, 252, 197));
        add(taddress);

        // Phone Number
        JLabel phone = new JLabel("Phone Number");
        phone.setBounds(400, 250, 150, 30);
        phone.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(phone);

        tphone = new JTextField();
        tphone.setBounds(600, 250, 150, 30);
        tphone.setBackground(new Color(177, 252, 197));
        add(tphone);

        // Email
        JLabel email = new JLabel("E-mail Id");
        email.setBounds(50, 300, 150, 30);
        email.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(email);

        temail = new JTextField();
        temail.setBounds(200, 300, 150, 30);
        temail.setBackground(new Color(177, 252, 197));
        add(temail);

        // Education
        JLabel education = new JLabel("Highest Education");
        education.setBounds(400, 300, 180, 30);
        education.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(education);

        String items[] = {
                "High School (10th)", "Intermediate (12th)", "Diploma", "BCA", "BBA",
                "BA", "B.Com", "B.Sc", "B.Tech", "MCA", "MBA", "MA",
                "M.Com", "M.Sc", "M.Tech", "PhD"
        };
        BoxEducation = new JComboBox(items);
        BoxEducation.setBackground(new Color(177, 252, 197));
        BoxEducation.setBounds(600, 300, 150, 30);
        add(BoxEducation);

        // Aadhar
        JLabel aadhar = new JLabel("Aadhar Card");
        aadhar.setBounds(50, 350, 150, 30);
        aadhar.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(aadhar);

        tadhar = new JTextField();
        tadhar.setBounds(200, 350, 150, 30);
        tadhar.setBackground(new Color(177, 252, 197));
        add(tadhar);

        // Designation
        JLabel designation = new JLabel("Designation");
        designation.setBounds(400, 350, 150, 30);
        designation.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(designation);

        tdesignation = new JTextField();
        tdesignation.setBounds(600, 350, 150, 30);
        tdesignation.setBackground(new Color(177, 252, 197));
        add(tdesignation);

        // Employee ID
        JLabel empid = new JLabel("Employee ID");
        empid.setBounds(50, 400, 150, 30);
        empid.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(empid);

        tempid = new JLabel("" + number);
        tempid.setBounds(200, 400, 150, 30);
        tempid.setForeground(Color.red);
        tempid.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(tempid);

        add = new JButton("ADD");
        add.setBounds(450,550,150,40);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.white);
        add.addActionListener(this);
        add(add);

        back = new JButton("BACK");
        back.setBounds(250,550,150,40);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        // Frame setup
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add){
            String name = tname.getText();
            String fname = tfname.getText();
            String dob = ((JTextField) tdob.getDateEditor().getUiComponent()).getText();
            String salary = tsalary.getText();
            String address = taddress.getText();
            String phone = tphone.getText();
            String email = temail.getText();
            String education = (String) BoxEducation.getSelectedItem();
            String designation = tdesignation.getText();
            String empid = tempid.getText();
            String aadhar = tadhar.getText();

            try {
                Conn c = new Conn();
                String query = "INSERT INTO employee VALUES('"
                        + name + "', '"
                        + fname + "', '"
                        + dob + "', '"
                        + address + "', '"
                        + phone + "', '"
                        + email + "', '"
                        + education + "', '"
                        + designation + "', '"
                        + salary + "', '"
                        + aadhar + "', '"
                        + empid + "')";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);
                new Home();

            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }

        }
    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}
