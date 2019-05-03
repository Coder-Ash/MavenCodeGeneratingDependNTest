package guru.springframework.mapstruct;

import org.mapstruct.Mapper;;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "workEmail", target = "email")
    User userCommandToUser(UserCommand userCommand);

    @Mapping(source = "email", target = "workEmail")
    UserCommand userToUserCommand(User user);
}