public class Main {
    public static void main(String[] args) {
        Student mike = new Student();

        Name name = new Name();
        name.setFName("Michael");
        name.setMName("Learns to");
        name.setLName("Rok");
        mike.setName(name);

        Student adila = new Student();
        name = new Name();
        name.setFName("Adila");
        name.setMName("binti");
        name.setLName("Izzat");
        adila.setName(name);

        Student imran = new Student();
        name = new Name();
        name.setFName("Syed");
        name.setLName("Imran");
        imran.setName(name);

        // creating a batch object
        StudentBatch sb2023 = new StudentBatch();
        sb2023.add(mike,0);
        sb2023.add(adila,1);

        // declare a method that allows for the following:
        boolean isIn = sb2023.find("Adlin");

        Teacher cikguminah = new Teacher();
        cikguminah.setName("Cikgu Minah");

        mike.setMark(100, 0);
        mike.setMark(100, 1);
        mike.setMark(100, 2);
        mike.setMark(100, 3);
        mike.setMark(100, 4);

        // calculate and print the avg
        float avg = 0;
        avg = mike.calcAvg();
        System.out.println("Avg = " + avg);

        // calculate the min marks for mike
        System.out.println("Min = " + mike.calcMin());
    }
}
