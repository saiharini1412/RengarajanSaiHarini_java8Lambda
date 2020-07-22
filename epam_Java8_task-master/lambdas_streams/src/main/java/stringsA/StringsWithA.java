package stringsA;
import java.util.List;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StringsWithA {
	public List<String> search(List<String> list) {
		Stream<String> stream = ((Collection<String>) list).stream();
		return (List<String>) stream.filter(s->s.startsWith("a") && s.length()==3).collect(Collectors.toList());
	}
}