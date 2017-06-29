package jp.co.axiz.web.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.dao.reserveDao;
import jp.co.axiz.web.dto.reserveDto;
import jp.co.axiz.web.form.SreserveForm;

@Controller
public class ReserveController {
	@Autowired
	reserveDao reserve;

	@RequestMapping(value = "/Sreserve")
	public String reserve(@ModelAttribute("reserved") SreserveForm form, Model model) {

		return "Sreserve";
	}

	@RequestMapping(value = "reserved", method = RequestMethod.POST)
	public String result(@ModelAttribute("reserved") SreserveForm form, Model model) {
		String date = form.getDate();

		if (date.equals("")) {
			List<reserveDto> list = reserve.select(date);
			model.addAttribute("event", list);

		} else {
			List<reserveDto> list = reserve.select(date);
			if (list.isEmpty()) {
				String msg = "入力されたデータは存在しません。";
				model.addAttribute("msg", msg);
				return "Sreserve";
			} else {
				model.addAttribute("event", list);
				return "SreserveResult";
			}
		}
		return "SreserveResult";

	}

}
