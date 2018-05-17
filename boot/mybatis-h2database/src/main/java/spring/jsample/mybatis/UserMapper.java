package spring.jsample.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import spring.jsample.model.User;

@Mapper
public interface UserMapper {

	@Select("select * from user")
	List<User> selectAll();
	
	@Select("select * from user where userId = #{userId}")
	User select(@Param("userId") String userId);

	@Insert("insert into user (userId, password) values (#{userId},#{password})")
	void insert(User user);

	@Delete("delete from user where userId = #{userId}")
	void delete(@Param("userId") String userId);

	@Update("update user set password=#{password} where userId = #{userId}")
	void update(User user);
}
