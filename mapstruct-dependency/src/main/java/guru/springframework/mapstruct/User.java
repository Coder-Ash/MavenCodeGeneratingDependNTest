package guru.springframework.mapstruct;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor
@Builder
public @Data class User {

    private String firstName;
    private String lastName;
    private String email;
}