package guru.springframework.mapstruct;

import guru.springframework.mapstruct.User.UserBuilder;
import guru.springframework.mapstruct.UserCommand.UserCommandBuilder;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-05-03T17:49:56-0400",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.3 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User userCommandToUser(UserCommand userCommand) {
        if ( userCommand == null ) {
            return null;
        }

        UserBuilder user = User.builder();

        user.email( userCommand.getWorkEmail() );
        user.firstName( userCommand.getFirstName() );
        user.lastName( userCommand.getLastName() );

        return user.build();
    }

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
