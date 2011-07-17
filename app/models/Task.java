package models;

import javax.persistence.Entity;
import javax.persistence.Lob;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.Model;
import play.modules.elasticsearch.annotations.ElasticSearchable;

@ElasticSearchable
@Entity
public class Task extends Model{

	public String label;

	public Task(String label) {
		super();
		this.label = label;
	}

	@Override
	public String toString() {
		return "label [label=" + label + "]";
	}
}
