package Java.DataStructures;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * Created by ryu on 1/3/17.
 */
class Printer {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) System.out.println(element);
    }
}
public class JavaGenerics {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray={1, 2, 3};
        String[] stringArray={"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count=0;
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if(name.equals("printArray")) count++;
        }
        if (count>1) System.out.println("Mehtod overloading is not allowed!");
    }
}
