public class StudentList {
    int index = 0;
    Student[] studentsArray;
    int arrLength = 10;

    public StudentList() {
        studentsArray = new Student[arrLength];
    }

    public void increaseList() {
        arrLength = arrLength * 2;
        Student[] newStudents = new Student[arrLength];
        for (int i = 0; i < studentsArray.length; i++) {
            newStudents[i] = studentsArray[i];

        }
        studentsArray=newStudents;
    }

    public void addStudent(Student student) {
        if (arrLength == index) {
            increaseList();
            studentsArray[index++] = student;
        } else {
            studentsArray[index++] = student;
        }
    }

    public void removeByName(String name) {
        for (int index = 0; index < studentsArray.length - 1; index++) {
            if (studentsArray[index] != null && studentsArray[index].name.equals(name)) {
             removeByIndex(index);
                index--;
            }
        }
    }

    public void removeByIndex(int index) {
        for (int j = index; j < studentsArray.length - 1; j++) {
            studentsArray[j] = studentsArray[++index];
        }
        studentsArray[index] = null;
    }
}
