package lambda.newslatter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Subscriber {

    private long id;
    private String email;
}
