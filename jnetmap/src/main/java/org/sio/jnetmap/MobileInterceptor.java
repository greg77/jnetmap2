package org.sio.jnetmap;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.sio.jnetmap.domain.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MobileInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
			Boolean validToken = false;
			String username = request.getHeader("username");
			User currentUser = null;
			try {
				currentUser = User.findUserByUsername(username);
			} catch (Exception e) {
				response.sendError(403);
				return false;
			}
			String serveurPassword = sha1(currentUser.getPassword());
			String serveurDigest = sha1(serveurPassword+request.getHeader("timestamp"));
			String androidDigest = request.getHeader("digest");
			if (!serveurDigest.equals(androidDigest)){
				response.sendError(401);				
			}
			else{
				validToken = true;				
			}
			System.out.println("SHA1pwd:"+ serveurPassword);
			System.out.println(serveurDigest);
			System.out.println("android: "+ androidDigest);
			
			
		
		return validToken;
	}
	

	
	static String sha1(String input) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }
         
        return sb.toString();
    }
}
