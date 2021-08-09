package springbootonlyjava.Juuhyunn02.inheritance;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data public final class MyFriends extends Friend{

    public Friend[] getFriend() {
        Friend[] friends = new Friend[4];
//        int count = 0;
//        friends[count++] = new UnivFriend("Lee", "Computer", "010-333-5555");
//        friends[count++] = new UnivFriend("Seo", "Electronic", "010-222-4444");
//        friends[count++] = new CompFriend("Yoon", "R&D 1", "02-123-9999");
//        friends[count++] = new CompFriend("Park", "R&D 2", "02-321-7777");
        String[] names = {"Lee", "Seo", "Yoon", "Park"};
        String[] majors = {"Computer", "Electronic"};
        String[] departments = {"R&D 1", "R&D 2"};
        String[] phones = {"010-333-5555", "010-222-4444", "02-123-9999", "02-321-7777"};
        for (int i = 0; i < friends.length; i++) {
            friends[i] = (i<2) ? new UnivFriend(names[i], majors[i], phones[i]) : new CompFriend(names[i], departments[i-2], phones[i]);
        }
        return friends;
    }
}
@NoArgsConstructor
@Data class Friend {
    protected String name;
    protected String phone;
    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    @Override
    public String toString() {
        return String.format("이름 : %s\n전화 : %s", name, phone);
    }
}
@Data final class UnivFriend extends Friend {
    private final String major;
    public UnivFriend(String name, String major, String phone) {
        super(name, phone);
        this.major = major;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("\n전공 : %s", major);
    }
}
@Data final class CompFriend extends Friend {
    private final String department;
    public CompFriend(String name, String department, String phone) {
        super(name, phone);
        this.department = department;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("\n부서 : %s", department);
    }
}
