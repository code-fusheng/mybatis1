/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: StudentService
 * Author:   25610
 * Date:     2020/2/29 13:17
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.mybatis1.service;

import xyz.fusheng.mybatis1.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(Long id);
    int add(Student student);
    int edit(Student student);
    int deleteById(Long id);
}
