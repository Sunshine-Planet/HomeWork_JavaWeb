package dao;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import pojo.Person;

public interface PersonMapper {
    @Select("select * from tb_person where id = #{id}")
    @Results(@Result(property = "card",
                    column = "card_id",
                    one = @One(select = "dao.IdCardMapper.findIdCardById")
    ))
    Person findPersonById(int id);
}
