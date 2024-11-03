package A1_3;

import java.util.List;

public class Department {
    private School school;
    private List<Subject> subjectList;
    private List<Instructor> instructorList;

    public Department(School school, List<Subject> subjectList, List<Instructor> instructorList) {
        this.school = school;
        this.subjectList = subjectList;
        this.instructorList = instructorList;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public List<Instructor> getInstructorList() {
        return instructorList;
    }

    public void setInstructorList(List<Instructor> instructorList) {
        this.instructorList = instructorList;
    }
}
