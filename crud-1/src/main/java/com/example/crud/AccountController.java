// File: src/main/java/com/example/crud/controller/AccountController.java

package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.crud.Account;
import com.example.crud.StudentDTO;
import com.example.crud.AccountRepository;

@RestController
@RequestMapping("/api/students/add")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping("/add")
    public ResponseEntity<Account> addStudent(@RequestBody StudentDTO studentDTO) {
        Account account = new Account();
        account.setuserName(StudentDTO.getuserName());
        account.seteng_name(StudentDTO.getDisplayNameEn());
        account.setemail(StudentDTO.getemail());
        account.setfaculty(StudentDTO.getfaculty());
        account.settype(StudentDTO.gettype());

        Account savedAccount = accountRepository.save(account);
        return new ResponseEntity<>(savedAccount, HttpStatus.CREATED);
    }
}
