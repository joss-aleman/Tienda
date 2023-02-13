
package com.tienda.Controller;

import com.tienda.domain.Cliente;
import com.tienda.service.ClienteService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
    
    
    @Autowired
    ClienteService clienteService;
    
    
    
    @GetMapping("/")
            public String inicio(Model model){
                String variable="Hola desde el Back End";
               model.addAttribute("mensaje", variable);
               
               var clientes = clienteService.getClientes();
                
               model.addAttribute(cliente, cliente);
              
             
                return "index";
            }
            
            
            
            
            
            
            
            
            
            
            
}