package a.b.c.com.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import a.b.c.com.service.SpringAutowiredService;
import a.b.c.com.vo.FormDataVO;

@Controller
public class SpringAutowiredController {
	private Logger logger = Logger.getLogger(SpringAutowiredController.class);
	
	final private SpringAutowiredService springAutowiredService;
	
	// SpringAutowiredService springAutowiredService = new SpringAutowiredServiceImpl();
	
	// 생성자 주입 
	@Autowired(required=false)
	public SpringAutowiredController(SpringAutowiredService springAutowiredService) {
		this.springAutowiredService = springAutowiredService;
	}
	
	
	@RequestMapping(value="autowired_test", method=RequestMethod.GET)
	public String autowired_test() {
		logger.info("SpringAutowiredController.autowired_test() 함수 진입");
		
		return "autowired/autowired_test_return";
	}
	
	@RequestMapping(value="autowired_test_get", method=RequestMethod.GET)
	public String autowiredTest_Get(FormDataVO fvo, Model model) {
		
		List<FormDataVO> list = springAutowiredService.autowiredTest(fvo);
		int listSize = list.size();
		
		logger.info("listSize >>> : " + listSize);
		System.out.println("listSize >>> : " + listSize);
		
		model.addAttribute("list", list);
		
		return "autowired/autowired_test_get_return";
	}
}
