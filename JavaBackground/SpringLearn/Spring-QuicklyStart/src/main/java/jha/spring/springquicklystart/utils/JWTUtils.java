package jha.spring.springquicklystart.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JWTUtils {
    /**
     * 用于加密JWT
     * @param claim
     * @return
     */
    public static String EncoderJWT(Map<String,?> claim){
        Map<String, Object> map = new HashMap<>();
        map.put("alg", "HS256");
        map.put("typ", "JWT");
        String token = JWT.create()
                .withHeader(map)//用于添加Header,不加就是默认HS256
                .withClaim("user", claim)
                .withExpiresAt(new Date(System.currentTimeMillis() + 3600 * 1000))//用于设置过期时间
                .withIssuedAt(new Date())
                .sign(Algorithm.HMAC256("MySecretKey" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))));
        return token;
    }

    /**
     * 用于解密JWT
     * @param token
     * @return
     */
    public static Map<String,?> DecodeJWT(String token){
        DecodedJWT jwt = JWT.require(Algorithm.HMAC256("MySecretKey" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))))
                .build().verify(token);
        Map<String, Claim> claims = jwt.getClaims();
        return claims;

    }
}
