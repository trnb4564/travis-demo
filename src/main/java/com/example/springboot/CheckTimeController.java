package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.time.Instant;

@RestController
public class CheckTimeController {

	@GetMapping("/time")
	public Map<String, String> returnTimes() {

		HashMap<String, String> timesMap = new HashMap<>();

		LocalDateTime dt = LocalDateTime.now();
		timesMap.put("localTime", dt.toString());

		Instant nowUTC = Instant.now();
		timesMap.put("UTC", nowUTC.toString());

		timesMap.put("timeZones", "local, UTC");
		
		return timesMap;
	}

}
