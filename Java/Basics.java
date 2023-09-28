
//Basics of Java:
//1)Java is pass by Value not pass by reference.
//2)2 types of mem-Stack & Heap.
//3)Objs with no reference variable is deleted from mem when garbage collectn hits.
//4)Bcoz of JVM and class file(byte code) java is platform independent but JVM is dependent.
//5)Java is WORA-Write once read anywhere (Byte code can run on all OS).
//6).java file is passed to compiler(javac) then .class file(byte code) is created.
//this bytecode is interpreted line by line by JVM to convert it into machine code.
//7)unreferenced values are removed from memory by garbage collector
//*In Linux   --->1)Javac compiler receives java file---->Produces Bytecode
                //2)Bytecode interpreted by JVM to convert it into machine code.
//javac filename.ext
//java filename
//JDK--->JRE--->JVM--->JIT

//JVM consist of Class loader who works loads(reads),links(allocating mem) and initializers

//Library eg.
import java.util.*;

public class Basics {
    // public-Access modifier is present so that the main() [Entry point of pgm]
    // must be executed
    // no matter what & it must be executed from anywhere.
    // Static-It is a entry point so if u want to execute main() without creating
    // objs we use static
    // String[] args-Whatever arg u give through CLI is getting store in that arr.
    public static void main(String[] args) {
        // Java is static
        // bcoz this gives error
        // a=10;
        // but this dont

        int a = 10;
        // Wrote code just for removing warning
        if (a == 10) {
            System.out.println("Tp");
        }

        // Here 'a' is a reference variable(stored in stack) and 10 is a
        // value(Object)[stored in heap]

        // If objs is changed then other variables also can see change
        int d[] = { 1, 2, 3, 4 };
        d[2] = 12;
        for (int i = 0; i < d.length - 1; i++)
            System.out.println(d[i]);

        // Java is a pass by reference
        int f = 12;
        fun(f);

    }

    public static void fun(int e) {
        e = e + 3;
        System.out.println(e);

    }
}