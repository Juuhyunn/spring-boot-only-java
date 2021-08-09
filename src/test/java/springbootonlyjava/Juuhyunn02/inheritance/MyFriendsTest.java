package springbootonlyjava.Juuhyunn02.inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MyFriendsTest {
    @Mock
    MyFriends friends;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        friends = new MyFriends();
    }
    @DisplayName("이름")
    @Test
    public void MyFriends() {
        Friend[] returnFriend = friends.getFriend();
        for (Friend i : returnFriend) {
            System.out.println(i.toString() + "\n");
        }
        assertEquals("Lee", returnFriend[0].getName());
    }
}