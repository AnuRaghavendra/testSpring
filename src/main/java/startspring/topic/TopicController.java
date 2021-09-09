package startspring.topic;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	public List<Topics> getTopics() {
		return Arrays.asList(
				new Topics("01", "spring", "spring desc"),
				new Topics("02", "spring mvc", "spring mvc desc"),
				new Topics("03", "spring rest", "spring rest desc")
				);
	}

}
