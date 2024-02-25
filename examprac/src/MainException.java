//class CustomException extends Exception {
//    CustomException(String message) {
//        super(message); // Using the message parameter of the Exception class
//    }
//
//    // toString() method is not necessary here since the superclass already provides a meaningful toString() implementation
//}
//
//public class MainException {
//    public static void main(String args[]) {
//        try {
//            throw new CustomException("This is a custom message");
//        } catch(CustomException e) {
//            System.out.println(e);
//        }
//    }
//}


// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Class that uses the custom exception
class ExceptionDemo {
    public static void checkValue(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Negative value not allowed");
        }
        System.out.println("Value is valid: " + value);
    }
}

// Main class
public class MainException {
    public static void main(String[] args) {
        try {
            // Using the class that may throw the custom exception
            ExceptionDemo.checkValue(-5);
        } catch (CustomException ex) {
            // Catching and handling the custom exception
            System.out.println(ex);
        }
    }
}

