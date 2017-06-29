package jp.co.axiz.web.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.dao.adminDao;
import jp.co.axiz.web.dao.userinfoDao;
import jp.co.axiz.web.dto.adminDto;
import jp.co.axiz.web.dto.userinfoDto;
import jp.co.axiz.web.form.Form;

@Controller
public class AuthController {

	@Autowired
	private adminDao admin;// インスタンス生成
	@Autowired
	private userinfoDao user;// インスタンス生成

	// 管理者ログイン処理
	@RequestMapping("/adminlogin")
	public String adminlogin(@ModelAttribute("login") Form form) {

		return "adminlogin";
	}

	@RequestMapping(value = "/adminlogin", method = RequestMethod.POST)

	public String adminlogincheck(@ModelAttribute("login") Form form, HttpSession session, Model model) {
		// loginという名前のモデルを取ってくる
		String id = form.getAid();
		String pass = form.getApass();

		if (id.equals("")) {
			id = "0";
		}

		List<adminDto> list = admin.login(id, pass);
		if (!list.isEmpty()) {

			int i = Integer.parseInt(id);
			List<adminDto> list2 = admin.syutoku(i);
			String name = list2.get(0).getAdmin_name();

			session.setAttribute("adminname", name);

			return "menu";
		} else {

			String msg = "ID、PASSが間違っています。IDは半角で入力してください。";
			model.addAttribute("msg", msg);
			return "adminlogin";
		}
	}

	// ユーザーログイン処理
	@RequestMapping("/login")
	public String login(@ModelAttribute("login") Form form) {

		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)

	public String logincheck(@ModelAttribute("login") Form form, Model model) {
		// loginという名前のモデルを取ってくる

		List<userinfoDto> list = user.login(form.getId(), form.getPass());
		if (!list.isEmpty()) {
			return "top";
		} else {
			String msg = "ID、PASSが間違っています。IDは半角で入力してください。";
			model.addAttribute("msg", msg);

			return "login";
		}
	}

}