package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class infoController {

  
	@RequestMapping("/sayhi.action")
	public String print(ModelMap model){

            System.out.println("mode and view...");
            return "hello";
	}
        
        @RequestMapping(value = "/getWords.action", method = RequestMethod.GET)

        //这个注解就直接返回数据...
        @ResponseBody
        public String setWords(){

            System.out.println("send a word...");
            return "a word com from server...";
        }
}
