package Oops;

public class Reflection {

    // Declaring and initializing string
    String n = "ReflectionGeeks";

    // Main driver method
    public static void main(String[] args) {

        // Try block to check for exceptions
        try {
            // Correcting the class name to match "Geeks"
            Class<?> c = Class.forName("Oops.Reflection");

            // Creating an object of the main class using reflection
            //Reflection o = (Reflection) c.getDeclaredConstructor().newInstance();
            Reflection o = (Reflection) c.getDeclaredConstructor().newInstance();

            // Print and display
            System.out.println(o.n);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
