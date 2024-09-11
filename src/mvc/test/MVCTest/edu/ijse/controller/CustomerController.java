/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.test.MVCTest.edu.ijse.controller;

import mvc.test.MVCTest.edu.ijse.dto.CustomerDTO;
import mvc.test.MVCTest.edu.ijse.model.CustomerModel;
import java.util.List;

/**
 *
 * @author Shavindi
 */
public class CustomerController {
    private CustomerModel customerModel = new CustomerModel();

    public String saveCustomer(CustomerDTO customerDTO) throws Exception {
        String resp = customerModel.saveCustomer(customerDTO);
        return resp;
    }

    public String updateCustomer(CustomerDTO customerDTO) throws Exception {
        String resp = customerModel.updateCustomer(customerDTO);
        return resp;
    }

    public String deleteCustomer(String customerId) throws Exception {
        String resp = customerModel.deleteCustomer(customerId);
        return resp;
    }
    
    public CustomerDTO searchCustomer(String customerId) throws Exception{
        CustomerDTO dto = customerModel.searchCustomer(customerId);
        return dto;
    }
    
    public List<CustomerDTO> getAllCustomer() throws Exception{
        List<CustomerDTO> dtos = customerModel.getAllCustomer();
        return dtos;
    }

}
}
