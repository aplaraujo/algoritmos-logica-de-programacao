package extra;

public class TypeUtils {
    public static String typeof(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getSimpleName();
    }
}
