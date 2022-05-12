package c08.servlet;

import jakarta.servlet.http.Cookie;

public class CookieUtil {
    public static Cookie findCookie(Cookie[] cookies, String name){
        if (cookies == null){
            return null;
        }else {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(name)) {
                    return cookie;
                }
            }
            return null;
        }
    }
}
