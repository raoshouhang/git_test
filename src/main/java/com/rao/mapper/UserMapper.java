package com.rao.mapper;

import com.rao.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author:HP
 * @date:2022/9/18 10:11
 * @description:
 */
/*这个注解表示这是一个mybatis的mapper类*/
@Mapper
@Repository
public interface UserMapper {
    List<User> queryUserList();

    User queryUserById(@Param("id") int id);

    int addUser(User user);

    int deleteUserById(@Param("id") int id);

    User updateUserById(@Param("id") int id);
}
