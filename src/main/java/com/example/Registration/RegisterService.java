package com.example.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class RegisterService {

    @Autowired
    private RegisterRepo repo;
    public String registerUser(Register register){


           repo.save(register);
           return "user saved successfully";
    }

    public List<Register> getAllUsers(){
          return repo.findAll();
    }

    public String deleteById(int id){
         repo.deleteById(id);
         return "user deleted successfully";
    }

    public Register findByEmail(String email){
        return repo.findByEmail(email);
    }

    public String deleteAlluser(){
        repo.deleteAll();
        return "delete all users successfully";
    }
}
