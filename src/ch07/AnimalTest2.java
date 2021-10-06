package ch07;

public class AnimalTest2 {
    public static void main(String[] args) {
        BigCat bc = new BigCat();//객체화
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

//        AnimalTest2 at = new AnimalTest2();
//        at.animalCrying(bc);
//        at.animalCrying(cat);
//        at.animalCrying(dog);
//        at.animalCrying(cow);


        animalCrying(bc);//큰 고양이 냐~옹
        animalCrying(cat);//고양이 야옹야옹
        animalCrying(dog);//강아지가 멍멍
        animalCrying(cow);//소가 음머~
    }
    public static void animalCrying(Animal ani){
         ani.crying();
   }

}
