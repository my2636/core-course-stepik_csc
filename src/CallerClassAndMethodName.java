public class CallerClassAndMethodName {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        doingAnything();
    }
    public static String getCallerClassAndMethodName() {
        Throwable throwable = new Throwable();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        return stackTrace[1].getClassName() + "#" + stackTrace[1].getMethodName();
    }
    public static void doingAnything() {
        System.out.println(getCallerClassAndMethodName());
    }
}
