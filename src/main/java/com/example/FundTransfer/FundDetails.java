package com.example.FundTransfer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FundDetails {

	@GetMapping(path="/all")
	@ResponseBody
	public String getAccountDetails() {
	return "Fund is Transfered";
	}

}
