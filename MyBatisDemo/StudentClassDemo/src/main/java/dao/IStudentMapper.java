package dao;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import pojo.IStudent;

import java.util.List;

public interface IStudentMapper {

    @Select("select * from s_student where id = #{id}")
    IStudent findStudent(int id);

    @Update("update s_student set name = #{name}, age = #{age} where id =#{id}")
    int updateStudent(IStudent iStudent);

    @Select("select * from s_student where cid = #{cid}")
    List<IStudent> findStudentByCid(int cid);
}
