package jp.co.axiz.web.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.dao.scheduleDao;
import jp.co.axiz.web.dto.scheduleDto;
import jp.co.axiz.web.form.SselectForm;

@Controller
public class SelectController {

	@Autowired
	private scheduleDao schedule;

	@RequestMapping("/Sselect")
	public String Sselect(@ModelAttribute("Sselect") SselectForm form) {

		return "Sselect";
	}

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public String result(@ModelAttribute("Sselect") SselectForm form, Model model) {
		String date = form.getDate();

		if (date.equals("")) {
			List<scheduleDto> list = schedule.select(date);
			model.addAttribute("event", list);

		} else {
			List<scheduleDto> list =schedule.select(date);
			if (list.isEmpty()) {
				String msg = "入力されたデータは存在しません。";
				model.addAttribute("msg", msg);
				return "Sselect";
			}
			else{
				model.addAttribute("event", list);
				return "SselectResult";
				}
	}
		return "SselectResult";

}

}
