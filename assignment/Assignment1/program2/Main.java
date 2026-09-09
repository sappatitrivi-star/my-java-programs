

class Student {
    int m1 = 80;
    int m2 = 75;
    int m3 = 90;

    void total() {
        System.out.println("Total = " + (m1 + m2 + m3));
    }
}

class Result extends Student {

    double average;

    void calculateAverage() {
        average = (m1 + m2 + m3) / 3.0;
        System.out.println("Average = " + average);
    }
}

class Grade extends Result {

    void calculateGrade() {
        if (average >= 80)
            System.out.println("Grade = A");
        else if (average >= 60)
            System.out.println("Grade = B");
        else
            System.out.println("Grade = C");
    }
}

public class Main {
    public static void main(String[] args) {

        Grade obj = new Grade();

        obj.total();
        obj.calculateAverage();
        obj.calculateGrade();
    }
}