public class main
{
    public static void main(String args[])
    {
        student student1=new student(
            1,
            "Anandhu",
            20,
            "anandhu@gmail.com"
        );
        student student2=new student(
            2,
            "Jeffu",
            20,
            "jeffu@gmail.com"
        );

        student1.setAge(1);
        System.out.println("Age : "+student1.getAge());
    }
}