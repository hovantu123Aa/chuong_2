/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giaodien;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class BT_01 {

    public static void main(String[] args) {
        JFrame jfr = new JFrame("Slimple calculator");// khai báo tạo tên tiêu đề
        JPanel JP = new JPanel();
        
        JLabel lblten1 = new JLabel("name1:");
        JLabel lblten2 = new JLabel("name2:");
        JLabel lblten3 = new JLabel("Result:");
        JTextField jtextten1=new JTextField(10);
        JTextField jtextten2=new JTextField(10);
        JTextField jTextrust=new JTextField(10);
        JButton jbtnadd=new JButton("ADD");
        JButton jbtnsub=new JButton("Sub");
        JButton jbtnmul=new JButton("Mul");
        JButton jbtndiv=new JButton("Div");
        jfr.setSize(300, 400);//kích thước
        jfr.setLocale(null);//
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//thoát chuong trình không còn chạy
        jfr.setVisible(true);// chạy from ra màng hinh
    }
}
