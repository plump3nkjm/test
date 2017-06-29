package jp.co.axiz.web.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.dao.userinfoDao;
import jp.co.axiz.web.dto.userinfoDto;
import jp.co.axiz.web.form.NewUserForm;

@Controller
public class NewUserController {
	@Autowired
	userinfoDao user;

	@RequestMapping(value = "/new")
	public String newuser(@ModelAttribute("new") NewUserForm form, Model model) {

		return "newuser";
	}

	@RequestMapping(value = "/newregister", method = RequestMethod.POST)
	public String newuserregister(@Validated @ModelAttribute("new") NewUserForm form, BindingResult bindingResult,
			Model model) {
		if (bindingResult.hasErrors()) {
			return "newuser";
		}
		String pass = form.getPass();
		String repass = form.getRepass();
		String name = form.getName();
		String id = form.getId();

		List<userinfoDto> list = user.idcheck(id);
		if (!list.isEmpty()) {
			String msg4 = "そのIDは存在します。";
			model.addAttribute("msg4", msg4);
			return "newuser";
		}
		if (pass.equals("") || repass.equals("") || name.equals("") || id.equals("")) {
			String msg3 = "すべて入力してください。";
			model.addAttribute("msg3", msg3);
			return "newuser";
		}
		try {
			Integer.parseInt(id);
		}
			catch(Exception e){
				String msg5 = "数字で入力してください。";
				model.addAttribute("msg5", msg5);
				return "newuser";
		}
		if (pass.equals(repass)) {
			int i = Integer.parseInt(id);
			user.newregister(i, name, repass);
			String msg = "登録しました。";
			String user = "あなたのIDは"+i+"パスワードは"+pass+"です。";
			model.addAttribute("msg2", msg);
			model.addAttribute("user", user);
			form.clear();
			return "newuser";
		} else {
			String msg1 = "パスワードが一致していません。";
			model.addAttribute("msg", msg1);
		}
		return "newuser";
	}

}
