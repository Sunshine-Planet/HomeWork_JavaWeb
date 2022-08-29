package dao;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import pojo.Orders;

import java.util.List;

public interface OrdersMapper {

    @Select("select * from tb_orders where user_id = #{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "number", column = "number"),
            @Result(property = "userId", column = "user_id")
    })
    List<Orders> findOrdersByUserId(int userId);

    @Select("select * from tb_orders where id = #{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "number", column = "number"),
            @Result(property = "productList",
                    column = "id",
                    many = @Many(select = "dao.ProductMapper.findProductByOrdersId")
            )
    })
    Orders findOrdersById(int id);
}
