package io.javabrains.springbootquickstart.topics;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicsService {

    private List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Java", "Java Description"),
            new Topic("javascript", "Javascript", "Javascript Description")
    );

    public List<Topic> getTopics() {
        return topics;
    }
}
