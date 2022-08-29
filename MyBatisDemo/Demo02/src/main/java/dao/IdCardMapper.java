package dao;

import org.apache.ibatis.annotations.Select;
import pojo.IdCard;

public interface IdCardMapper {
    @Select("select * from tb_idcard where id = #{id}")
    IdCard findIdCardById(int id);
}
