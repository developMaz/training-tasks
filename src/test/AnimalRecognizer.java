package test;

interface Animal {
    
    String size();
    String agresion();
    String name();
}

class Cat implements Animal{
    

    public String size(){
        return "mały";
    }
    
    public String agresion(){
        return "średnio";
    }
    
    public String name(){
        return "Kot";
    }
}

class Mouse implements Animal{

    public String size(){
        return "malutka";
    }
    
    public String agresion(){
        return "nieagresywna";
    }
    
    public String name(){
        return "Mysz";
    }
}

class Dog implements Animal{

    public String size(){
        return "duży";
    }
    
    public String agresion(){
        return "agresywny";
    }
    
    public String name(){
        return "Pies";
    }
}

class AnimalRecognizer{
    
    public String recognize(Animal animal) {
          return "Jestem " + animal.size() + " " + animal.name() 
                  + ". I jestem trochę " + animal.agresion();
    }
}

class App {
    public static void main (String[] args){
        

       AnimalRecognizer animalRecognizer = new AnimalRecognizer();
       
       String animal1 = animalRecognizer.recognize(new Cat());
       String animal2 = animalRecognizer.recognize(new Mouse());
       String animal3 = animalRecognizer.recognize(new Dog());   
       
       
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);   

    }
}