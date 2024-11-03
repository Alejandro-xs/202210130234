package A1_2;

import java.util.ArrayList;

public class EducationalInstitution {
    private ArrayList<Course> courseList;
    private Building mainBuilding;
    private ArrayList<Building> additionalBuildings;

    public EducationalInstitution() {
        this.courseList = new ArrayList<>();
        this.mainBuilding = new Building();
        this.additionalBuildings = new ArrayList<>();
    }
}