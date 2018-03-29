package controllers;

import javax.inject.Inject;

import io.ebean.ExpressionList;
import models.Users;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

public class LoginController extends Controller {

	@Inject
	FormFactory formFactory;

	// ログインページ
	public Result login() {
		return ok(views.html.login.render());
	}

	// ユーザー確認
	public Result doLogin() {
		Users user = formFactory.form(Users.class).bindFromRequest().get();
		ExpressionList<Users> getuser = Users.find.query().where().eq("userName", user.userName).and().eq("password", user.password);
		// ユーザー存在判定
		if (getuser.findCount() == 0) {
			flash("errormsg", "入力が間違っています。"); // フラッシュでメッセージ表示
			return redirect(routes.LoginController.login()); // リダイレクトでapplication.indexに戻す
		}

		// ログイン成功メッセージ
		flash("successmsg", "ログインが成功しました。"); // フラッシュでメッセージ作成
		setSession(getuser.findOne());
		return ok(views.html.bookmaker.render());
	}

	// ログアウト時セッション削除
	public Result logout() {
		clearSession();
		return redirect(routes.HomeController.index());
	}

	// セッションセット
	private void setSession(Users user) {
		session("fullName", user.fullName);
		session("id", user.id.toString());
	}

	// セットされているセッションを削除する。
	private void clearSession() {
		session().clear();
	}

}
