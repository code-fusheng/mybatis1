/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: StudentSeviceImpl
 * Author:   25610
 * Date:     2020/2/29 13:18
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.mybatis1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.fusheng.mybatis1.entity.Student;
import xyz.fusheng.mybatis1.repository.StudentRepository;
import xyz.fusheng.mybatis1.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id);
    }
    @Override
    public int add(Student student) {
        return studentRepository.add(student);
    }
    @Override
    public int edit(Student student) {
        return studentRepository.edit(student);
    }
    @Override
    public int deleteById(Long id) {
        return studentRepository.deleteById(id);
    }
}
