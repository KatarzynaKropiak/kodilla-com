
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum theForum = new Forum();
        Map<Integer, ForumUser> par = theForum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> LocalDate.now().isAfter(forumUser.getDateOfBirth().plusYears(20)))
                .filter(forumUser -> forumUser.getNoOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdUser, forumUser -> forumUser));

        System.out.println("# elements: " + par.size());
        par.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}

