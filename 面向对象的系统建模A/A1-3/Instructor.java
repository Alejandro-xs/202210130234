package A1_3;

import java.util.List;
public class Instructor {
    private Department department;
    private List<Subject> subjectList; 
    public Instructor(Department department, List<Subject> subjectList) {
        this.department = department;
        this.subjectList = subjectList;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public List<Subject> getSubjectList() {
        return subjectList;
    }
    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }
}
