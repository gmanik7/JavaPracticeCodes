package ImmutableConcept;

final class Student{
  private static   int id;
   private static String name;

    public static int getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


}

public class Immutable {
    public static void main(String[] args) {
        int id = 101;
        String name= "java";

        Student s1 = new Student(id,name);

        System.out.println("id: "+ s1.getId() + "\n" + "name: "+ s1.getName());

        //after changing the variables
        id = 102;
        name = "python";


        System.out.println("id: "+ s1.getId() + "\n" + "name: "+ s1.getName());
        /**
         * Output: No change in output
         * id: 101
         * name: java
         */





    }




}
