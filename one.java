import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employer
{
	private Long id;
	private String employerName;
	private Set<employee> employees;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public String getEmployerName()
	{
		return employerName;
	}
	public void setEmployerName(String employerName)
	{
		this.employerName = employerName;
	}
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="employer")
	public Set<employee> getEmployees()
	{
		return employees;
	}
	public void setEmployees(Set<employee> employees)
	{
		this.employees = employees;
	}
}
</employee></employee></employee>
