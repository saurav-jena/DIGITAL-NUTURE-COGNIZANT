public class main {
    public static void main (String [] args) {
        Logger logger1=Logger.getInstances();

        logger1.log("my first name saurav");

        Logger logger2=Logger.getInstances();
        logger2.log("my last name jena ");

        if (logger1 == logger2) {
            System.out.println("Both loggers are the same instance. Singleton works!");
        } else {
            System.out.println("Different instances! Singleton failed.");
        }
    }

}
