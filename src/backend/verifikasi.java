package backend;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
/**
 *
 * @author Bayu
 */
public class verifikasi {
    private final Connection conn = new koneksi().connect();
    public boolean verifikasi(String a, String b){
        boolean hasilver = false;
        String sql = "select * from user where username='"+a+ "' and password='"+b+"'" ;
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                hasilver = true;
            }
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,
                    "Gk bisa nampilin data bos"+e);
        }
        return hasilver;
    }
    
}
