package Access_Modifiers;

class Student {
    String name = "Srishti";   // default variable

    void display() {          // default method
        System.out.println("Name: " + name);
    }
}

class default_am {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);  // Allowed
        s.display();                 // Allowed
    }
}