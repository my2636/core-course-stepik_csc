public class CallerClassAndMethodName {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        doingAnything();
    }
    public static String getCallerClassAndMethodName() {
        Throwable throwable = new Throwable();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        if (stackTrace.length > 2) {
            return stackTrace[2].getClassName() + "#" + stackTrace[2].getMethodName();
        } else return null;
    }
    public static void doingAnything() {
        System.out.println(getCallerClassAndMethodName());
    }
}
