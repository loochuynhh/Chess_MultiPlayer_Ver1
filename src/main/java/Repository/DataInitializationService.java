
package Repository;
import Entity.Friend;
import Entity.Room;
import Entity.Roomuser;
import Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;

@Service
public class DataInitializationService {

    private final UserRepository userRepository;
    private final RoomRepository roomRepository;
    private final FriendRepository friendRepository;
    private final RoomuserRepository roomUserRepository;

    @Autowired
    public DataInitializationService(UserRepository userRepository, RoomRepository roomRepository, FriendRepository friendRepository, RoomuserRepository roomUserRepository) {
        this.userRepository = userRepository;
        this.roomRepository = roomRepository;
        this.friendRepository = friendRepository;
        this.roomUserRepository = roomUserRepository;
    }

    public void initializeData() {
        // Chèn dữ liệu cho bảng user
        User user1 = new User("1", 1, 1000, "1", 10, 5, 2);
        User user2 = new User("2", 2, 1200, "2", 15, 8, 1);
        User user3 = new User("3", 3, 800, "3", 8, 12, 3);
        userRepository.saveAll(Arrays.asList(user1, user2, user3));

        // Chèn dữ liệu cho bảng room
        Room room1 = new Room("1", LocalDateTime.now(), null, "Mode1");
        Room room2 = new Room("2", LocalDateTime.now(), null, "Mode2");
        roomRepository.saveAll(Arrays.asList(room1, room2));

        // Chèn dữ liệu cho bảng friend
        Friend friend1 = new Friend("1", "1", "2");
        Friend friend2 = new Friend("2", "2", "3");
        friendRepository.saveAll(Arrays.asList(friend1, friend2));

        // Chèn dữ liệu cho bảng roomuser
        Roomuser roomUser1 = new Roomuser("1", "1", "1", "Chat1", "Result1");
        Roomuser roomUser2 = new Roomuser("2", "1", "2", "Chat2", "Result2");
        roomUserRepository.saveAll(Arrays.asList(roomUser1, roomUser2));
    }
}

