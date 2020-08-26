package com.satya.R24AngularApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/r24/intake")
public class R24AngularIntakeController {
	
	@Autowired
	private Intake intake;


	@GetMapping("/{id}")
	public int getDocket(@PathVariable int id) {
	    return intake.getDocket();
	}

}
