package jp.co.axiz.web.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.dao.scheduleDao;
import jp.co.axiz.web.dto.scheduleDto;
import jp.co.axiz.web.form.UpdateForm;

@Controller
public class UpdateController {
	@Autowired
	scheduleDao schedule;

	@RequestMapping("/Supdate") // updateに飛ばす
	public String update(@ModelAttribute("Supdate") UpdateForm form, Model model) {

		return "Supdate";
	}

	@RequestMapping("/SupdateInput") // updateに飛ばす
	public String updateInput(@ModelAttribute("Supdate") UpdateForm form, Model model) {

		return "SupdateInput";
	}

	@RequestMapping(value = "/SupdateInput", method = RequestMethod.POST)
	public String updateInput(@ModelAttribute("Supdate") UpdateForm form, HttpSession session, Model model) {
		String date = form.getDate();
		if (date.equals("")) {
			String msg = "必須項目を入力してください。";
			model.addAttribute("msg", msg);
			return "Supdate";
		} else {
			scheduleDto dto = schedule.syutoku(date);
			String date2 = dto.getDate();
			String event2 = dto.getEvent();
			if (!date.equals(date2)) {
				String msg = "入力されたデータは存在しません。";
				model.addAttribute("msg", msg);
				return "Supdate";
			}
			session.setAttribute("date", date2);
			session.setAttribute("event", event2);
			System.out.println(event2);
			return "SupdateInput";
		}
	}

	@RequestMapping(value = "/SupdateConfirm", method = RequestMethod.POST)
	public String updateConfirm(@ModelAttribute("Supdate") UpdateForm form, HttpSession session, Model model) {
		String date = (String) session.getAttribute("date");
		String event = (String) session.getAttribute("event");

		String nevent = form.getNevent();

		if (event.equals(nevent)) {
			String msg = "場所が変更されていません。";
			model.addAttribute("msg", msg);
			return "SupdateInput";
		} else {
			session.setAttribute("date", date);
			session.setAttribute("event", event);
			session.setAttribute("newdate", date);
			session.setAttribute("newevent", nevent);


			return "SupdateConfirm";
		}

	}

	@RequestMapping(value = "/Supdate", method = RequestMethod.POST)
	public String update(@ModelAttribute("Supdate") UpdateForm form, HttpSession session, Model model) {
		String date = (String) session.getAttribute("newdate");
		String event = (String) session.getAttribute("newevent");
		schedule.update(date, event);

		return "SupdateResult";
	}
}
