package dao;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import pojo.IClass;

public interface IClassMapper {

    @Select("select * from c_class where id = #{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "classname", column = "classname"),
            @Result(property = "studentList",
                    column = "id",
                    many = @Many(select = "dao.IStudentMapper.findStudentByCid")
            )
    })
    IClass findClassById(int id);
}
