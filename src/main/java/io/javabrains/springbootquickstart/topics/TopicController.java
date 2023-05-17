package io.javabrains.springbootquickstart.topics;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    private TopicsService topicsService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicsService.getTopics();
    }

}
