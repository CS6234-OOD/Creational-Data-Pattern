public class MakeCourseTesting
{
    public static void main(String [] args)
    {
        FactoryBuildingForm MakeCourse = new FactoryBuildingForm();


        Course CS = MakeCourse.createCourse("Self-Pace", "Object-Oriented-Design", 20000.00, "GW", "CS", "1-10-17", "5-21-17");
        System.out.println(CS.getName());

    }
}
