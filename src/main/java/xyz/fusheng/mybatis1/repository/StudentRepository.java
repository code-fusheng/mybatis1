/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: StudentRepository
 * Author:   25610
 * Date:     2020/2/29 13:18
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.mybatis1.repository;

import org.springframework.stereotype.Repository;
import xyz.fusheng.mybatis1.entity.Student;

import java.util.List;

@Repository
public interface StudentRepository {
    // findAll 查找所有
    List<Student> findAll();
    // findById 根据id查
    Student findById(Long id);
    // add 添加
    int add(Student student);
    // edit 修改
    int edit(Student student);
    // deleteById 根据id删除
    int deleteById(Long id);

}
