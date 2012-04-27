/*(C) 2007-2012 Alibaba Group Holding Limited.	

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import com.taobao.datasource.resource.security.SecureIdentityLoginModule;

/**
 * @author junyu
 *
 */
public class JbossPasswordDecode {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		try {
			String passwd = SecureIdentityLoginModule.encode("tddl");
			String real=SecureIdentityLoginModule.decode(null,passwd);
		    System.out.println(passwd+"  "+real);
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		}
	}

}