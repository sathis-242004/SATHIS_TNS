package college.CollegeModule;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "college")
public class College {

	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "college_admin")
	    private String collegeAdmin;

	    @Column(name = "college_name")
	    private String collegeName;

	    @Column(name = "location")
	    private String location;

	    // getters & setters
	

    // Getters and Setters for all fields
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCollegeAdmin() {
        return collegeAdmin;
    }

    public void setCollegeAdmin(String collegeAdmin) {
        this.collegeAdmin = collegeAdmin;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

	public College(Long id, String collegeAdmin, String collegeName, String location) {
		super();
		this.id = id;
		this.collegeAdmin = collegeAdmin;
		this.collegeName = collegeName;
		this.location = location;
	}

	public College() {
		super();
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", collegeAdmin=" + collegeAdmin + ", collegeName=" + collegeName + ", location="
				+ location + "]";
	}
    
    
    
    
    
}

