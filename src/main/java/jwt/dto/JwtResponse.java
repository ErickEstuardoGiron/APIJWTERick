package jwt.dto;

public class JwtResponse {
    private final String jwtToken;

    public JwtResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    // Getters

    public String getJwtToken() {
        return jwtToken;
    }
}
