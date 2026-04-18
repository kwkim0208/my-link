package kr.com.mylink.mapper;

import kr.com.mylink.domain.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    UserDto selectUserById(String userId);

    void updateUser(UserDto userDto);

    void insertUser(UserDto userDto);

    void deleteUser(String userId);

    List<UserDto> selectAllUsers();
}
