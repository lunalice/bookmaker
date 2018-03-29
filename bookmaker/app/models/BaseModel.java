package models;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import akka.http.javadsl.model.headers.Date;
import io.ebean.Model;
import io.ebean.annotation.CreatedTimestamp;
import io.ebean.annotation.UpdatedTimestamp;

@MappedSuperclass
public class BaseModel extends Model {
	private static final long serialVersionUID = 1L;
	@Id
	public Long id; // id

	@CreatedTimestamp
	public Date createdAt; // 追加時間

	@Version
	@UpdatedTimestamp
	public Date updatedAt; // 更新時間

}
