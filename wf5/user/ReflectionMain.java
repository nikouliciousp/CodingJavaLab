package gr.aueb.cf.projects.wf5.user;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionMain {
    public static void main(String[] args) {
        try {
            //Load Classes
            Class<?> aClass = Class.forName("gr.aueb.cf.projects.wf5.user.User");
            Class<?> bClass = Class.forName("gr.aueb.cf.projects.wf5.user.UserCredentials");

            //Gets overloaded constructors and creates instances
            Constructor<?>  intCtr1 = aClass.getConstructor(Long.class, String.class, String.class);
            User rApp1 = (User) intCtr1.newInstance(1L, "Periklis", "Nikoulis");

            Constructor<?>  intCtr2 = bClass.getConstructor(Long.class, String.class, String.class);
            UserCredentials rApp2 = (UserCredentials) intCtr2.newInstance(1L, "perisNik", "qwerty");

            //Gets methods userToString, userCredentialsToString and invokes on rApp1 and rApp2 instances respectively
            Method userToString = aClass.getMethod("userToString");
            System.out.println(userToString.invoke(rApp1));

            Method userCredentialsToString = bClass.getMethod("userCredentialsToString");
            System.out.println(userCredentialsToString.invoke(rApp2));
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
