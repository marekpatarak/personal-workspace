package com.pproject.app.control;

import java.util.Collections;
import java.util.List;

import com.pproject.app.entity.BusinessEntity;
import com.pproject.app.repository.BusinessEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.pproject.app.entity.Notice;
import com.pproject.app.repository.NoticeRepository;

@Controller
@RequestMapping(path="/")
public class MainController {

	@Autowired
	private NoticeRepository noticeRepository;

	@Autowired
	private BusinessEntityRepository businessEntityRepository;
	
	@Autowired
	private NoticeService noticeService;

	public static int pageLimit = 50;
	
	@GetMapping(path="/addnotice")
	public @ResponseBody String addNewNotice (@RequestParam int guid, @RequestParam String title, @RequestParam String description, @RequestParam String link, @RequestParam String pubDate) {
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

	@GetMapping(path="/fetch")
	public String fetchFeedAndPersist() {
		try {
			noticeService.fetchFeedForPreview();

		} catch (Exception e) {
			return "error";
		}
		return "success";
	}

	@GetMapping(path="/notices")
	public String fetchNoticesForPreview(Model model) {

		List<Notice> noticeList = (List<Notice>)noticeRepository.findAll();
		Collections.sort(noticeList);
		model.addAttribute("noticeList", noticeList);
		return "noticepreview";
	}

	@GetMapping(path="/notices/{page}")
	public String fetchNoticesPerPage(@PathVariable("page") String page, Model model) {

		List<Notice> noticeList = (List<Notice>)noticeRepository.findAll();
		Collections.sort(noticeList);
		model.addAttribute("noticeList", noticeList.subList(pageLimit*Integer.parseInt(page), pageLimit*Integer.parseInt(page)+pageLimit));
		return "noticepreview";
	}

	@GetMapping(path="/notices/filter/type/{type}")
	public String fetchNoticesByType(@PathVariable("type") String type, Model model) {

		List<Notice> noticeList = noticeRepository.findNoticesByTitleContaining(" - " + type);
		Collections.sort(noticeList);
		model.addAttribute("noticeList", noticeList);
		return "noticepreview";
	}

	@GetMapping("/register")
	public String showRegisterForm(Model model) {

		model.addAttribute("businessentity", new BusinessEntity());
		return "register";
	}

	@PostMapping("/register")
	public String registerSubmit(@ModelAttribute BusinessEntity businessEntity) {

		businessEntityRepository.save(businessEntity);
		return "success";
	}


}
