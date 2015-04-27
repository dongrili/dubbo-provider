package web;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
	
	int i = 0;
	
	@ResponseBody
	@RequestMapping("/sayHello.json")
	public String sayHello(){
		
		return "hi"+ (++i);
	}
	@ResponseBody
	@RequestMapping(value="getTime")
	public String getTime(){
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		return format.format(date);
	}

}
