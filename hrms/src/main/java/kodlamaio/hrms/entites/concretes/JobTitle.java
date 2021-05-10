package kodlamaio.hrms.entites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity  //sen bir veritabanı nesnesisin demek
@Table(name = "job_titles")  //burda veritabanında hangi nesneye karşılık geldiğini söylüyoruz
public class JobTitle {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;

	public JobTitle() {
		super();
	}
}
