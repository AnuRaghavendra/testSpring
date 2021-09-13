package startspring.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topics> topics = new ArrayList<>(Arrays.asList(
			new Topics("01", "spring", "spring desc"),
			new Topics("02", "spring mvc", "spring mvc desc"),
			new Topics("03", "spring rest", "spring rest desc")
			));
	
	public List<Topics> getAllTopics() {
		return topics;
	}
	public Topics getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topics topic) {
		topics.add(topic);	
	}
	public void putTopic(Topics topic, String id) {
		for (int i=0; i<topics.size(); i++) {
			Topics t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
			}
		}
	}
	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		
	}
}
