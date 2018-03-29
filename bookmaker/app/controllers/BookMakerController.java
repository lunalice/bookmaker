package controllers;

import javax.inject.Inject;

import models.BookMakerTable;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

public class BookMakerController extends Controller {

	@Inject
	FormFactory formFactory;

	// ユーザー作成メソッド（C)
	public Result doInsert() {
		BookMakerTable booker = formFactory.form(BookMakerTable.class).bindFromRequest().get();
		String Message = booker.doInsert(booker); // インサート判定

		// 更新出来たか判定
		if (Message == null) {
			flash("errormsg", "更新失敗しました。"); // フラッシュでメッセー字表示
			return redirect(routes.LoginController.login()); // リダイレクトでapplication.indexに戻す
		}

		// 作成出来たら。top画面に戻る。
		flash("successmsg", Message); // フラッシュでメッセージ作成
		return ok(views.html.bookmaker.render());
	}
}
