public class Student {
    // data/attributes
    Name name;
    String kp;
    String address;
    String schoolname;
    float marks[] = new float[5];

    // methods or operations
    public float calcAvg() {
        float total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total / marks.length;
    }

    public float calcMin() {
        float min = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        return min;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setMark(float mark, int i) {
        marks[i] = mark;
    }
    
    public String getFName() {
        return name.fname;
    }
}