package com.example.tinyUrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlResource {
	
	@Autowired
	UrlService urlService;


	@GetMapping("/ShortUrl")
	public String getShortUrl(@RequestParam String URL) {
		return urlService.getShortUrl(URL);
	}
	
	@GetMapping("/LongUrl")
	public String getLongUrl(@RequestParam String URL) {
		return urlService.getLongUrl(URL);
	}

}
