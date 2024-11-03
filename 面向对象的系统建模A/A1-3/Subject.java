package A1_3;

import java.util.List;
public class Subject {
    private Department department;
    private List<Instructor> instructorList;
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public List<Instructor> getInstructorList() {
        return instructorList;
    }
    public void setInstructorList(List<Instructor> instructorList) {
        this.instructorList = instructorList;
    }
}
