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
import jp.co.axiz.web.form.DeleteForm;

@Controller
public class DeleteController {
	@Autowired
	scheduleDao schedule;

	@RequestMapping("/Sdelete") // deleteに飛ばす
	public String delete(@ModelAttribute("Sdelete") DeleteForm form, Model model) {

		return "Sdelete";
	}


	@RequestMapping(value = "/SdeleteConfirm", method = RequestMethod.POST)
	public String deletecheck(@ModelAttribute("Sdelete") DeleteForm form, HttpSession session, Model model) {
		String date = form.getDate();
		if (date.equals("")) {
			String msg = "必須項目を入力してください。";
			model.addAttribute("msg", msg);
			return "Sdelete";
		} else {
			scheduleDto dto = schedule.syutoku(date);
			String date2 = dto.getDate();
			String event2 = dto.getEvent();
			if (!date.equals(date2)) {
				String msg = "入力されたデータは存在しません。";
				model.addAttribute("msg", msg);
				return "Sdelete";
			}
			session.setAttribute("date", date2);
			session.setAttribute("event", event2);

			return "SdeleteConfirm";
		}
	}

	@RequestMapping(value = "/Sdelete", method = RequestMethod.POST)
	public String deletedelete(@ModelAttribute("Sdelete") DeleteForm form, HttpSession session, Model model) {
		String date= (String) session.getAttribute("date");
		schedule.delete(date);

		return "SdeleteResult";

	}
}
