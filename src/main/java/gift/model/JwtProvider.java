package gift.model;

<<<<<<< HEAD
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import java.util.Map;
=======
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
>>>>>>> df4061f392a6503fa29b555655ee0c4f99214880
import org.springframework.beans.factory.annotation.Value;

public class JwtProvider {
    @Value("${jwt.key}")
    private String secretKey;

    public String generateToken(User user) {
        return Jwts.builder()
                .claim("username", user.getUsername())
                .claim("role", user.getRole())
                .signWith(Keys.hmacShaKeyFor(secretKey.getBytes()))
                .compact();
    }
<<<<<<< HEAD

    public Map<String, Object> tokenToClaims(String token) {
        try {
            Claims claims = Jwts.parser()
                    .verifyWith(Keys.hmacShaKeyFor(secretKey.getBytes()))
                    .build()
                    .parseSignedClaims(token)
                    .getPayload();

            return claims;
        } catch (Exception e) {
            return null;
        }
    }
=======
>>>>>>> df4061f392a6503fa29b555655ee0c4f99214880
}