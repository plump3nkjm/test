package jp.co.axiz.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//トップページとメニュー画面
@Controller
public class IndexController {


@RequestMapping({"/","/index"})
	public String index(){
		return "index";

	}
@RequestMapping({"/menu"})
public String menu(){
	return "menu";

}
@RequestMapping(value="/logout",method = RequestMethod.POST)
public String logout(){
	return "logout";
}
@RequestMapping(value="/logout2")
public String logout2(){
	return "logout";
}
}