package crud;

import java.awt.Color;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

class crud_demo implements ActionListener{
	
	JButton Exit,Register,Delete,Update,Reset,Refresh_table;
	JTextField Id_field,Name_field,Gender_field,Address_field,Contact_field;
	JLabel  label,Name,Contact,Address,Id,Gender;
	JRadioButton Male,Female;
	ButtonGroup g1;

	JPanel Panel;
	JTable table;

	DefaultTableModel model;
	JScrollPane scrollpane;

	public crud_demo() {
		
		JFrame frame=new JFrame("APP Name");
		frame.setVisible(true);
		frame.setSize(800, 300);
		frame.setLayout(null);
		
		label=new JLabel("Registration form",JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 18));
		label.setBounds(100, 10, 200, 20);
		label.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(label);
		
		
		Id=new JLabel("Id:");
		Id.setBounds(100, 50, 120, 20);
		frame.add(Id);
		
		Name=new JLabel();
		Name.setText("Name:");
		Name.setBounds(100, 80, 120, 20);
		frame.add(Name);
		
		Contact=new JLabel();
		Contact.setText("Contact:");
		Contact.setBounds(100, 120, 120, 20);
		frame.add(Contact);
		
		Address=new JLabel();
		Address.setText("Address:");
		Address.setBounds(100, 150, 120, 20);
		frame.add(Address);
		
		Gender=new JLabel();
		Gender.setText("Gender:");
		Gender.setBounds(100, 180, 120, 20);
		frame.add(Gender);
		
		Id_field=new JTextField();
		Id_field.setBounds(170, 50, 120, 20);
		frame.add(Id_field);
		
		Name_field=new JTextField();
		Name_field.setBounds(170, 80, 120, 20);
		frame.add(Name_field);
		
		Contact_field=new JTextField();
		Contact_field.setBounds(170, 120,120, 20);
		frame.add(Contact_field);
		
		Address_field=new JTextField();
		Address_field.setBounds(170, 150, 120, 20);
		frame.add(Address_field);
		
		Male=new JRadioButton();
		Male.setText("Male");
		Male.setBounds(170, 180, 60, 20);
		frame.add(Male);
		
		Female=new JRadioButton();
		Female.setText("Female");
		Female.setBounds(230, 180, 70, 20);
		frame.add(Female);
		
		g1=new ButtonGroup();
		g1.add(Male);
		g1.add(Female);
		
		Register=new JButton("Register");
		Register.setBounds(100, 220, 100, 20);
		frame.add(Register);
		
		Exit=new JButton("Exit");
		Exit.setBounds(210, 220, 100, 20);
		frame.add(Exit);
		
		Update=new JButton("Update");
		Update.setBounds(100, 250, 100, 20);
		frame.add(Update);
		
		Delete=new JButton("Delete");
		Delete.setBounds(210, 250, 100, 20);
		frame.add(Delete);
		
		Reset=new JButton("Reset");
		Reset.setBounds(150, 280, 100, 20);
		frame.add(Reset);
		
		Refresh_table=new JButton("Refresh table");
		Refresh_table.setBounds(500, 370, 270, 20);
		frame.add(Refresh_table);
		
		
		Register.addActionListener(this);
		Exit.addActionListener(this);
		Update.addActionListener(this);
		Delete.addActionListener(this);
		Reset.addActionListener(this);
		Refresh_table.addActionListener(this);
		

		
		Panel=new JPanel();
		Panel.setLayout(new GridLayout());
		Panel.setBounds(400, 20, 480, 330);
		frame.add(Panel);
		
		model = new DefaultTableModel();
		table = new JTable(model);
		
		table.getTableHeader().setReorderingAllowed(false);
		model.addColumn("S.NO");
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Gender");
		model.addColumn("Address");
		model.addColumn("Contact");
				
		scrollpane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,

				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		Panel.add(scrollpane);	
		
	}
	public static Connection driverconnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == Register) {
			System.out.println("Register Button clicked");
			int ID = Integer.parseInt(Id_field.getText());
			String Name = Name_field.getText();
			Long Contact = Long.parseLong(Contact_field.getText());
			String Address = Address_field.getText();
			String Gender = null;
			if(Male.getText() !=null) {
				Gender = Male.getText();
			}
			else {
				Gender = Female.getText();
			}
			
			
			

			System.out.println(ID + Name + Contact + Address + Gender);

			try {
				Connection conn = crud_demo.driverconnection();
				String sql = "insert into student_1 (ID,Name,Contact,Address,Gender) values (?,?,?,?,?)";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, ID);
				pst.setString(2, Name);
				pst.setLong(3, Contact);
				pst.setString(4, Address);
				pst.setString(5, Gender);

				if (pst.executeUpdate() == 1) {
					System.out.println("inserted successfully");

					JOptionPane.showMessageDialog(null, "Data Inserted Successfuly", "Register",
							JOptionPane.INFORMATION_MESSAGE);
					Update.setEnabled(true);
					Delete.setEnabled(true);
					Reset.setEnabled(true);

				} else {
					JOptionPane.showMessageDialog(null, "Data Not Inserted", "Register", JOptionPane.ERROR_MESSAGE);
				}
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}

		else if (e.getSource() == Exit) {
			System.out.println("Search Button clicked");
			
			int ID=Integer.parseInt(Id_field.getText());
			try {
				Connection conn = crud_demo.driverconnection();
				String sql ="select * from student_1 where ID=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, ID);
			
				ResultSet rs = pst.executeQuery();
				if (rs.next()) {
					Id_field.setText(String.valueOf(rs.getInt("ID")));
					Name_field.setText(rs.getString("Name"));
					Contact_field.setText(String.valueOf(rs.getLong("Contact")));
					Address_field.setText(rs.getString("Address"));
					Gender.setText(rs.getString("Gender"));
					
					
				} else {
					System.out.println("data not founnd");
					
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.getStackTrace();
				
			}
		}

		else if (e.getSource() == Update) {
			System.out.println("Update Button clicked");
			
			int ID = Integer.parseInt(Id_field.getText());
			String Name = Name_field.getText();
			String Address = Address_field.getText();
			Long Contact = Long.parseLong(Contact_field.getText());
			String Gender = g1.getSelection().getActionCommand();
			

			try {
				Connection conn = crud_demo.driverconnection();
				String sql = "update student_1 set Name=?,Address=?,Contact=?,Gender=? where ID=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, Name);
				pst.setString(2, Address);
				pst.setLong(3, Contact);
				pst.setString(4,Gender);
				pst.setInt(5,ID );
			

				if (pst.executeUpdate() == 1) {
					JOptionPane.showMessageDialog(null, "Data updated Successfully", "Update",
							JOptionPane.INFORMATION_MESSAGE);
				}

				else {
					JOptionPane.showMessageDialog(null, "Data Not Update", "Update", JOptionPane.ERROR_MESSAGE);
				}

			} catch (Exception e2) {
				e2.getStackTrace();
			}

		}

		else if (e.getSource() == Delete) {
			System.out.println("Delete Button clicked");
			int ID = Integer.parseInt(Id_field.getText());
			try {
				Connection conn = crud_demo.driverconnection();
				String sql = "delete from student_1 where ID=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, ID);

				if (pst.executeUpdate() == 1) {
					System.out.println("record deleted");
					Id_field.setText("");
					Name_field.setText("");
					Address_field.setText("");
					Contact_field.setText("");
					Male.setSelected(false);
					Female.setSelected(false);

					JOptionPane.showMessageDialog(null, "Data Deleted Successfuly", "Delete",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					System.out.println("data not found");
					JOptionPane.showMessageDialog(null, "Data Not found", "Delete", JOptionPane.ERROR_MESSAGE);
				}
				
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		} else if (e.getSource() == Reset) {
			System.out.println("reset button clicked");
			Id_field.setText("");
			Name_field.setText("");
			Address_field.setText("");
			Contact_field.setText("");
			Male.setSelected(false);
			Female.setSelected(false);
		} else if (e.getSource() == Refresh_table) {
			// removing all the rows of the table
			System.out.println("refresh button clicked");

			DefaultTableModel dm = (DefaultTableModel)table.getModel();

			dm.getDataVector().removeAllElements();

			System.out.println("Refresh Table");

		}

	}

}

public class crud_frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              new crud_demo();
	}

}
