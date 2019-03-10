package corejava.collectionframework.sports;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Player {
	private String name, email, city, state, sport;
	private int age;

}
