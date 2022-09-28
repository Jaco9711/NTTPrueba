/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttdata.JRestService.service;

import com.nttdata.JRestService.model.ModelRequest;
import com.nttdata.JRestService.model.ModelResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author AndresOsorio
 */
@RestController
@RequestMapping(path = "/Service")
public class ServicioUsuario {
    
    @RequestMapping(method = RequestMethod.GET, produces = "application/json", path = "/Cliente/{tdoc}/{id}" )
    
    
    public @ResponseBody ResponseEntity<ModelResponse> Cliente(@PathVariable String tdoc, @PathVariable String id){
        ModelResponse respuesta = new ModelResponse();
        int nid= Integer.valueOf(id);
        char t_doc= tdoc.charAt(0);
        if (nid == 0 || t_doc != 'C' && t_doc != 'P'){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }else if (nid == 23445322 && t_doc == 'C'){
            //F_name Esta desde el model Response grabado
            //S_name Esta desde el model Response grabado
            respuesta.setFl_name("Castillo");
            respuesta.setSl_name("Osorio");
            respuesta.setPhone("+573115077609");
            respuesta.setDir("Cra 68G # 39c-20Sur ");
            respuesta.setCity("Bogota");
            return new ResponseEntity<>(respuesta,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}
    
    @RequestMapping(method = RequestMethod.POST, consumes  = "application/json", path = "/Cliente" )
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody ResponseEntity<ModelResponse> pCliente(@RequestBody ModelRequest request){
        ModelResponse respuesta = new ModelResponse();

        if (request.getId() == 0 || request.getT_doc() != 'C' && request.getT_doc() != 'P'){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }else if (request.getId() == 23445322 && request.getT_doc() == 'C'){
            //F_name Esta desde el model Response grabado
            //S_name Esta desde el model Response grabado
            respuesta.setFl_name("Castillo");
            respuesta.setSl_name("Osorio");
            respuesta.setPhone("+573115077609");
            respuesta.setDir("Cra 68G # 39c-20Sur ");
            respuesta.setCity("Bogota");
            return new ResponseEntity<>(respuesta,HttpStatus.OK);
        }

        return new ResponseEntity<>(respuesta,HttpStatus.NOT_FOUND);
}
    
}
