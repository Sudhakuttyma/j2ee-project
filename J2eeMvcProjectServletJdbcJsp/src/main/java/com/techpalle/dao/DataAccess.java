package com.techpalle.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.techpalle.model.Student;

public class DataAccess 
{
	public static ArrayList<Student> getStudents()
	{
		ArrayList<Student> al=new ArrayList<Student>();//empty array list
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2eeproject","root","admin");
			Statement s=con.createStatement();
			ResultSet res=s.executeQuery("select * from student");
			if(res != null)
			{
				while(res.next()==true)
				{
					//read each row from student table
					int sno=res.getInt(1);
					String sname=res.getString(2);
					String course=res.getString(3);
					String gender=res.getString(4);
					String email=res.getString(5);
					String education=res.getString(6);
					//create student object
					Student obj=new Student(sno,sname,course,gender,email,education);
					//add student object to arraylist,
					al.add(obj);
					
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}
	public static void insertStudent(String name,String course,String gender,String email,String education)
	{
		//JDBC code..to insert student and check in work bench
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2eeproject","root","admin");
			PreparedStatement s=con.prepareStatement("insert into student(name,course,gender,email,education)values(?,?,?,?,?)");
			s.setString(1,name);
			s.setString(2,course);
			s.setString(3,gender);
			s.setString(4,email);
			s.setString(5,education);
			s.executeUpdate();
			s.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static boolean checkAdminLogin(String email,String pw)
	{
		//JDBC code read all rows from admin table
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2eeproject","root","admin");
			Statement s=con.createStatement();
			ResultSet res=s.executeQuery("select * from admin");
			int count=0;
			if(res !=null)
			{
				while(res.next()==true)
				{
					String dbemail=res.getString(2);//read email
					String dbpw=res.getString(3);//read pw
					if(dbemail.equals(email) && dbpw.equals(pw))
					{
						count++;
						break;
					}
				}
			}
			s.close();
			con.close();
			
			if(count==1)
				return true;
			else
				return false;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;//admin login failure
	}

}
