package guru.springframework.mapstruct;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */

public class UserMapperTest {

    @Test
    public void testPopulateUserFromUserCommand() {
        // given
        UserCommand ash = UserCommand.builder().firstName("Ash").lastName("Barrett").workEmail("ash@techleisure.com")
                .build();

        // when
        User user = UserMapper.INSTANCE.userCommandToUser(ash);

        // then
        assertNotNull(user);
        assertEquals(user.getFirstName(), "Ash");
        assertEquals(user.getLastName(), "Barrett");
        assertEquals(user.getEmail(), "ash@techleisure.com");

    }

    @Test
    public void testPopulateUserCommandFromUser() {
        // given
        User ash = User.builder().firstName("Ash").lastName("Barrett").email("ash@techleisure.com").build();

        // when
        UserCommand userCommand = UserMapper.INSTANCE.userToUserCommand(ash);

        // then
        assertNotNull(userCommand);
        assertEquals(userCommand.getFirstName(), "Ash");
        assertEquals(userCommand.getLastName(), "Barrett");
        assertEquals(userCommand.getWorkEmail(), "ash@techleisure.com");

    }
}
