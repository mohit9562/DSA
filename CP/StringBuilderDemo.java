package CP;
import java.io.*;
import java.util.*;
public class StringBuilderDemo {
    public static void main(String[] args) {

        // ✅ 1. Create StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // ✅ 2. append()
        sb.append(" World");
        System.out.println("append(): " + sb);   // Hello World

        // ✅ 3. insert()
        sb.insert(5, ",");
        System.out.println("insert(): " + sb);   // Hello, World

        // ✅ 4. delete()
        sb.delete(5, 6);
        System.out.println("delete(): " + sb);   // Hello World

        // ✅ 5. deleteCharAt()
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt(): " + sb); // HelloWorld

        // ✅ 6. reverse()
        sb.reverse();
        System.out.println("reverse(): " + sb);  // dlroWolleH

        // ✅ 7. reverse back
        sb.reverse();
        System.out.println("reverse back: " + sb); // HelloWorld

        // ✅ 8. charAt()
        char ch = sb.charAt(1);
        System.out.println("charAt(1): " + ch);  // e

        // ✅ 9. setCharAt()
        sb.setCharAt(0, 'Y');
        System.out.println("setCharAt(): " + sb); // YelloWorld

        // ✅ 10. replace()
        sb.replace(0, 5, "Hello");
        System.out.println("replace(): " + sb); // HelloWorld

        // ✅ 11. substring() (does NOT modify SB)
        String sub = sb.substring(0, 5);
        System.out.println("substring(): " + sub); // Hello

        // ✅ 12. length()
        System.out.println("length(): " + sb.length());

        // ✅ 13. capacity()
        System.out.println("capacity(): " + sb.capacity());

        // ✅ 14. ensureCapacity()
        sb.ensureCapacity(100);
        System.out.println("ensureCapacity(): " + sb.capacity());

        // ✅ 15. indexOf()
        System.out.println("indexOf(\"World\"): " + sb.indexOf("World"));

        // ✅ 16. lastIndexOf()
        System.out.println("lastIndexOf(\"l\"): " + sb.lastIndexOf("l"));

        // ✅ 17. toString()
        String normalString = sb.toString();
        System.out.println("toString(): " + normalString);

        // ✅ 18. setLength() (truncate or expand)
        sb.setLength(5);
        System.out.println("setLength(5): " + sb); // Hello

        // ✅ 19. Clear StringBuilder
        sb.setLength(0);
        System.out.println("clear(): " + sb); // empty

        // ✅ 20. Append numbers and chars
        sb.append(100);
        sb.append(' ');
        sb.append(true);
        System.out.println("append mixed: " + sb); // 100 true
    }
}

