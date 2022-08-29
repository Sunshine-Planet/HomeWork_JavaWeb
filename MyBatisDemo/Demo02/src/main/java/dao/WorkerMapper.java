package dao;

import org.apache.ibatis.annotations.*;
import pojo.Worker;

public interface WorkerMapper {
    @Select("select * from tb_worker where id = #{id}")
    Worker findWorker(int id);

    @Insert("insert into tb_worker(name, age, sex, work_id) "
            + "values(#{name}, #{age}, #{sex}, #{workId})")
    int insertWorker(Worker worker);

    @Update("update tb_worker set name = #{name}, age = #{age} " +
            "where id = #{id}")
    int updateWorker(Worker worker);

    @Delete("delete from tb_worker where id = #{id}")
    int deleteWorker(int id);

    @Select("select * from tb_worker where id = #{param01} and name = #{param02}")
    Worker findWorkerByIdAndName(@Param("param01") int id,
                                 @Param("param02") String name);
}
