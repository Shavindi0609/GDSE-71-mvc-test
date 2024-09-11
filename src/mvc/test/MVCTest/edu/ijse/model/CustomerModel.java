/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.test.MVCTest.edu.ijse.model;

import mvc.test.MVCTest.edu.ijse.db.DBConnection;
import mvc.test.MVCTest.edu.ijse.dto.CustomerDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author anjan
 */
public class CustomerModel {
    
    public String saveCustomer(CustomerDTO customerDTO) throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, customerDTO.getId());
        statement.setString(2, customerDTO.getTitle());
        statement.setString(3, customerDTO.getName());
        statement.setString(4, customerDTO.getDob());
        statement.setDouble(5, customerDTO.getSalary());
        statement.setString(6, customerDTO.getAddress());
        statement.setString(7, customerDTO.getCity());
        statement.setString(8, customerDTO.getProvince());
        statement.setString(9, customerDTO.getPostalCode());
        
        int result = statement.executeUpdate();
        return result > 0 ? "Successfully Saved" : "Fail";
    }
    
}