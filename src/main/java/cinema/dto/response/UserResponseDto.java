package cinema.dto.response;

import java.util.Set;

public class UserResponseDto {
    private Long id;
    private String email;
    private Set<Long> rolesId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Long> getRolesId() {
        return rolesId;
    }

    public void setRolesId(Set<Long> rolesId) {
        this.rolesId = rolesId;
    }
}
