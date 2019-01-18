package test;

import java.util.HashSet;



public class Books {
        private String name;
        private int year;
        
        public Books(String name, int year){
            this.name = name;
            this.year = year;
        }
        
        public String getName(){
            return this.name;
        }
        
        public int getYear(){
            return this.year;
        }
        
        @Override
        public String toString(){
            return "Tytuł: " + this.name +
                   ", rok wydania: " + this.year;
        }
        
        public int hashCode(){
            return this.year;
        }

        public boolean equals(Object o){
            Books e = (Books) o;
            return (name.equals(e.getName())) &&
                   (year == e.getYear());
        }

}

class App5 {
    public static void main (String[] args){
        
        Books book1 = new Books("Tytuł 1", 2001);
        Books book2 = new Books("Tytuł 2", 2002);
        Books book3 = new Books("Tytuł 3", 2003);
        Books book4 = new Books("Tytuł 4", 2004);
        Books book5 = new Books("Tytuł 5", 2005);
        
        HashSet<Books> books = new HashSet<Books>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        
        for (Books b : books) {
            if(b.getYear() <=2004){
                System.out.println(b);
            }
        }
    }
}

