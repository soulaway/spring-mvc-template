package com.github.soulaway.messagebook;
 
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class MessageController {
 
    @Autowired
    private MessageDao messageDao;
 
    @RequestMapping(value="/message")
    public ModelAndView messageBook(HttpServletRequest request) {
        // Handle a new guest (if any):
        String text = request.getParameter("text");
        if (text != null)
        	messageDao.persist(new Message(text));
 
        // Prepare the result view (message.jsp):
        return new ModelAndView("message.jsp", "messageDao", messageDao);
    }
}