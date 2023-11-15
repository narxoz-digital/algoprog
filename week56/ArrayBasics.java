import java.util.Scanner;

class Student{
    public Student(String name, double grade){
        this.name = name;
        this.grade = grade;
    }
    public String toString(){
        return "{"+name+", "+grade+"}";
                
    }
    public String name;
    public double grade;
}

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // declaring and creation of array of references
        Student [] a = new Student[n]; 

        // raeding 
        for(int i=0; i<n; ++i)
            a[i] = new Student(input.next(), input.nextDouble());

        // writing
        for(int i=0; i<n; ++i)
            System.out.print(a[i]+" ");
        System.out.println();

    }
}
