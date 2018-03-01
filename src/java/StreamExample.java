package java;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public List<String> demo(List<String> list) {
		return list.stream().filter(e -> e.length() < 5).collect(Collectors.toList());
	}

}
