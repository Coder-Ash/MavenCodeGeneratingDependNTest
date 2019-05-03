package guru.springframework.mapstruct;

import guru.springframework.mapstruct.UserCommand.UserCommandBuilder;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-05-03T15:26:12-0400",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.3 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserCommand userToUserCommand(User user) {
        if ( user == null ) {
            return null;
        }

        UserCommandBuilder userCommand = UserCommand.builder();

        userCommand.workEmail( user.getEmail() );
        userCommand.firstName( user.getFirstName() );
        userCommand.lastName( user.getLastName() );

        return userCommand.build();
    }
}
