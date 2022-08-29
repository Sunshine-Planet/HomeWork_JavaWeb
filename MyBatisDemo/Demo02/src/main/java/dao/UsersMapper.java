package dao;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import pojo.Users;

public interface UsersMapper {

    @Select("select * from tb_user where id = #{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "address", column = "address"),
            @Result(property = "ordersList",
                    column = "id",
                    many = @Many(select = "dao.OrdersMapper.findOrdersByUserId")
            )
    })
    Users findUserById(int id);
}
