package OOP.Model;

import lombok.*;

@Data
@RequiredArgsConstructor
//@Setter
//@Getter
//@ToString

public class User {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String profile;
}