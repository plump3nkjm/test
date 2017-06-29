package jp.co.axiz.web.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.dao.scheduleDao;
import jp.co.axiz.web.form.InsertForm;
//スケジュール登録
@Controller
public class InsertController {

	@Autowired
	scheduleDao schedule;

	@RequestMapping("/register")
	public String insert(@ModelAttribute("register") InsertForm form, Model model) {

		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String insertcheck(@ModelAttribute("register") InsertForm form, HttpSession session, Model model) {
		String date = form.getDate();
		String event = form.getEvent();

		if (date.equals("") || event.equals("")) {
			String msg = "すべて入力してください。";
			model.addAttribute("msg", msg);
			return "register";
		} else {
			session.setAttribute("date", date);
			session.setAttribute("event", event);
			return "registerConfirm";
		}
	}

	@RequestMapping(value = "/registerConfirm", method = RequestMethod.POST)
	public String insertin(@ModelAttribute("register") InsertForm form, HttpSession session, Model model) {
		String date = (String) session.getAttribute("date");
		String event = (String) session.getAttribute("event");
		schedule.register(date, event);
		return "registerResult";
	}

}
