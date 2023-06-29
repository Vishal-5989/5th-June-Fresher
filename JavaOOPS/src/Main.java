// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EnacapsulationProgramOne obj = new EnacapsulationProgramOne();
        obj.setX(6);
        int number = obj.getX();
        System.out.println(number);

        EncapsulationProgramTwo obj1 = new EncapsulationProgramTwo();
        obj1.setCourse("java");
        String course = obj1.getCourse();
        System.out.println(course);

        EncapsulationReadOnlyAccess obj2 = new EncapsulationReadOnlyAccess();
        String name = obj2.getName();
        System.out.println(name);

        EncapsulationProgramWriteOnlyAccess obj3 = new EncapsulationProgramWriteOnlyAccess();
        obj3.setCompany("Neutrino");

    }
}