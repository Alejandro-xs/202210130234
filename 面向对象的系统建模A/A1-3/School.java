package A1_3;
import java.util.List;
public class School {
    private List<Student> studentList;
    private Department department = new Department();
    private List<Department> departmentList;
    public List<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public List<Department> getDepartmentList() {
        return departmentList;
    }
    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }
}
