package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import io.ebean.Finder;
import io.ebean.annotation.NotNull;
import play.data.Form;

@Entity
public class BookMakerTable extends BaseModel {

	private static final long serialVersionUID = 1L;

	@NotNull
	public String siteName;// サイト名

	@NotNull
	@Column(unique = true)
	public String url;// ・URL

	public String memo;// ・備考

	public String image;// ・画像（迷い中）

	@ManyToOne
	public Users users; // リレーション

	public static Finder<Long, BookMakerTable> find = new Finder<Long, BookMakerTable>(BookMakerTable.class); // 検索

	// ブックマークレット登録
	public String doInsert(BookMakerTable booker) {
		booker.save();
		return "更新しました";
	}

}
