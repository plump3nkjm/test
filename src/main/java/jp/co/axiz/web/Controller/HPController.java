package jp.co.axiz.web.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.dao.reserveDao;
import jp.co.axiz.web.dao.scheduleDao;
import jp.co.axiz.web.dto.scheduleDto;
import jp.co.axiz.web.form.ReserveForm;
import jp.co.axiz.web.form.SSselectForm;

@Controller
public class HPController {
	@Autowired
	private scheduleDao schedule;
	@Autowired
	private reserveDao reserve;

	@RequestMapping("/top")
	public String top() {

		return "top";
	}

	@RequestMapping("/member")
	public String member() {

		return "member";
	}

	@RequestMapping("/schedule")
	public String schedule(@ModelAttribute("SSselect") SSselectForm form, @ModelAttribute("reserve") ReserveForm rform,
			Model model) {

		return "schedule";
	}

	// スケジュールの表示
	@RequestMapping(value = "/list2", method = RequestMethod.POST)
	public String result(@ModelAttribute("SSselect") SSselectForm form, @ModelAttribute("reserve") ReserveForm rform,
			Model model) {
		String date = form.getDate();

		if (date.equals("")) {
			List<scheduleDto> list = schedule.select(date);
			model.addAttribute("event", list);

		} else {
			List<scheduleDto> list = schedule.select(date);
			if (list.isEmpty()) {
				String msg = "入力されたデータは存在しません。";
				model.addAttribute("msg", msg);
				return "schedule";
			} else {

				model.addAttribute("event", date);
				model.addAttribute("event", list);
				return "schedule";
			}
		}
		return "schedule";

	}
	// 予約フォーム用

	@RequestMapping(value = "/reserve", method = RequestMethod.POST)
	public String reserve(@ModelAttribute("reserve") ReserveForm rform, @ModelAttribute("SSselect") SSselectForm form,
			Model model) {
		String name = rform.getName();
		String date = rform.getDate();
		String event = rform.getEvent();
		String ticket = rform.getTicket();
		if (name.equals("") || date.equals("") || event.equals("") || ticket.equals("")) {
			String msg = "すべて入力してください。";
			model.addAttribute("msg", msg);
			return "schedule";
		} else {

			reserve.reserveregister(date, event, name, ticket);
			String msg = "予約しました。";
			model.addAttribute("msg", msg);

			return "schedule";
		}

	}

}
