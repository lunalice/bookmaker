package controllers;

import javax.inject.Inject;

import models.BookMakerTable;
import models.Users;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security.Authenticator;

/**
 * This controller contains an action to handle HTTP requests to the
 * application's home page.
 */
public class ApplicationController extends Controller {

	// ユーザー作成フォーム
	private final Form<Users> form;
	private final Form<BookMakerTable> bookmaker;
	@Inject Authenticator auth;


	// 入力フォームを作成
	@Inject
	public ApplicationController(FormFactory formFactory) {
		this.form = formFactory.form(Users.class);
		this.bookmaker = formFactory.form(BookMakerTable.class);
	}

	// ユーザーフォームを作成してビューを表示
	public Result index() {
		return ok(views.html.application.render(form));
	}

	// ユーザー作成メソッド（C)
	public Result doCreate() {
		Users user = form.bindFromRequest().get();

		String errorMessage = user.create(user); // エラーメッセージ判定

		// 更新出来たか判定
		if (errorMessage != null) {
			flash("errormsg", errorMessage); // フラッシュでメッセー字表示
			return redirect(routes.ApplicationController.index()); // リダイレクトでapplication.indexに戻す
		}

		// 作成出来たら。top画面に戻る。
		flash("successmsg", "ユーザー登録が完了しました。"); // フラッシュでメッセージ作成
		return redirect(routes.HomeController.index());
	}

}
