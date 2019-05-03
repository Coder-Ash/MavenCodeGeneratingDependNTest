package guru.springframework.mapstruct;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class UserMapperTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public UserMapperTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(UserMapperTest.class);
    }

    /**
     * Rigourous Test :-)
     */
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
