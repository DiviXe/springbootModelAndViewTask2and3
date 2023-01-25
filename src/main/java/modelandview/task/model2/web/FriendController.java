package modelandview.task.model2.web;

import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import modelandview.task.model2.domain.Friend;

@Controller
public class FriendController {
	
	private CopyOnWriteArrayList<Friend> friendList =
			new CopyOnWriteArrayList<>();
	
	@GetMapping("/index")
	public String addFriends(Model model) {
		model.addAttribute("friendList", friendList);
		model.addAttribute("friend", new Friend());
		return "index";
	}
	
	@PostMapping("/index") 
		public String postFriend (@RequestParam String Name, @ModelAttribute Friend friend) {
			friendList.add(friend);
			
			return "redirect:/index";
			}
	}


