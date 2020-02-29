/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: StudentHandler
 * Author:   25610
 * Date:     2020/2/29 13:20
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.mybatis1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.fusheng.mybatis1.entity.Student;
import xyz.fusheng.mybatis1.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentHandler {

    @Autowired
    private StudentService studentService;

    @GetMapping("/findAll")
    public List<Student> findAll(){
        return studentService.findAll();
    }
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return studentService.findById(id);
    }

    @PostMapping("/add")
    public int add(@RequestBody Student student){
        return studentService.add(student);
    }

    @PutMapping("/edit")
    public int edit(@RequestBody Student student){
        return studentService.edit(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public int deleteById(@PathVariable("id") Long id){
        return studentService.deleteById(id);
    }

}
