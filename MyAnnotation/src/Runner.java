
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Runner {
    public static void main(String[] args) {
        try {
            Class c1 = Class.forName(MyService.class.getName());
            if (!c1.isAnnotationPresent(Version.class)) {
                System.out.println("No annotation");
            } else {
                System.out.println("class " + c1.getName() + " annotated: " + c1.getAnnotation(Version.class));
                MyService myService = new MyService();
                myService.setVersion(10.0);
                myService.setNameVersion("Android Q");
                Method method = myService.getClass().getDeclaredMethod("thisClassInfo");
                method.setAccessible(true);
                method.invoke(myService);
            }


        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

