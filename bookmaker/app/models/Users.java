package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import akka.stream.impl.io.InputStreamSinkStage.Data;
import io.ebean.Finder;
import io.ebean.annotation.NotNull;

@Entity
public class Users extends BaseModel {

	private static final long serialVersionUID = 1L;

	@NotNull
	@Column(unique = true)
	public String userName; // ユーザー名はユニークである事

	@NotNull
	public String password; // よくあるパスワード

	@NotNull
	public String fullName; // フルネーム

	public Data loginedAt;// ログイン日時

	@OneToMany
	public List<BookMakerTable> bookmakertable; // ブックマークテーブル

	public static Finder<Long, Users> find = new Finder<Long, Users>(Users.class); // 検索

	public String toString() {
		return "Parent [id=" + id + ", name=" + userName + ", fullName=" + fullName + "]";
	}

	// インサートメソッド
	public String create(Users users) {
		// userNameフィールドからusers名を検索しヒットしたらエラーを返す、query発行
		if (Users.find.query().where().eq("userName", users.userName).findCount() > 0) {
			return "ユーザー名が重複しています。他のユーザー名を入力してください。";
		}

		try {
			// インサート
			users.save();
		} catch (Exception e) {
			// 更新失敗
			return "想定しないエラーが発生しました。時間をおいて再度お試しください。";
		}

		return null;
	}

}