public class StudentList {
    int index = 0;
    Student[] studentsArray;
    int arrLength = 10;

    public StudentList() {
        studentsArray = new Student[arrLength];
    }

    public Student[] increaseList(Student[] students) {
        arrLength = arrLength * 2;
        Student[] newStudents = new Student[arrLength];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        return newStudents;
    }

    public void addStudent(Student student) {
        if (arrLength == index) {
            studentsArray = increaseList(studentsArray);
            studentsArray[index++] = student;
        } else {
            studentsArray[index++] = student;
        }
    }


    public Student[] removeByName(String name, Student[] studentsArray) {
        for (int i = 0; i < studentsArray.length - 1; i++) {
            if (studentsArray[i] != null && studentsArray[i].name.equals(name)) {
                studentsArray = removeByIndex(studentsArray, i);
                i--;
            }
        }

        return studentsArray;
    }

    public Student[] removeByIndex(Student[] studentsArray, int i) {
        for (int j = i; j < studentsArray.length - 1; j++) {
            studentsArray[j] = studentsArray[++i];
        }
        studentsArray[i] = null;
        return studentsArray;
    }
}
