package cn.ruoshy.jobmanagement.mapper;

import cn.ruoshy.jobmanagement.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User findById(Integer id);

    User findByPhone(String phone);

    Integer insert(User user);

    Integer update(User user);

    Integer delete(Integer userId);
}
