package gr.aueb.cf.projects.wf5.user;

/**
 *
 */
public class UserMain {
    public static void main(String[] args) {
        User periklis = new User(1L, "Periklis", "Nikoulis");
        UserCredentials perisNik = new UserCredentials(1L, "perisNik", "qwerty");

        System.out.println(periklis.getId() + ", "
                            + periklis.getFirstname() + ", " + periklis.getLastname());
        System.out.println(perisNik.getId() + ", "
                            + perisNik.getUsername() + ", " + perisNik.getPassword());
    }
}
