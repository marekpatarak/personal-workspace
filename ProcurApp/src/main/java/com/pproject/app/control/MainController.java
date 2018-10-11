package com.pproject.app.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pproject.app.entity.Notice;
import com.pproject.app.repository.NoticeRepository;

@Controller
@RequestMapping(path="/index")
public class MainController {

	@Autowired
	private NoticeRepository noticeRepository;
	
	@GetMapping(path="/addnotice")
	public @ResponseBody String addNewNotice (@RequestParam String guid, @RequestParam String title, @RequestParam String description, @RequestParam String link, @RequestParam String pubDate) {
		Notice n = new Notice();
		n.setGuid(guid);
		n.setTitle(title);
		n.setDescription(description);
		n.setLink(link);
		n.setPubDate(pubDate);
		noticeRepository.save(n);
		return "Saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Notice> getAllNotices() {
		return noticeRepository.findAll();
	}
	
}
