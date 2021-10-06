package ch07;

import com.sun.org.apache.xerces.internal.impl.dv.xs.AnyURIDV;

public class AnimalTest {
    public static void main(String[] args) {
        BigCat bigCat = new BigCat();
        Cat cat = new BigCat();
        Animal animal = new BigCat();
        Animal animal2 = new Cat();
//        Animal animal3 = new Animal();
//        Object obj = new Animal();

        //! BigCat bc = new Cat();
        //! Cat cat2 = new Animal();

        Cat cat2 = new BigCat();
        cat2.crying();
        BigCat bigCat1 = (BigCat)cat2;
        bigCat1.sleep();
        //cat2.sleep();
    }
}
