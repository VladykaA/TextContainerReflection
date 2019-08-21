import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> cls = TextContainer.class;
        TextContainer textContainer = new TextContainer();
        SaveTo st = cls.getAnnotation(SaveTo.class);

        Method method = cls.getMethod("save", String.class, String.class);
        method.invoke(textContainer, st.path(), textContainer.text);
    }
}
