package org.apache.shiro.spring.boot.sms.realm;

import org.apache.shiro.biz.realm.AbstractAuthorizingRealm;
import org.apache.shiro.spring.boot.sms.token.SmsLoginToken;

/**
 * Sms AuthorizingRealm
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
public class SmsAuthorizingRealm extends AbstractAuthorizingRealm {

	@Override
	/**
	 * Returns the authentication token class.
	 *
	 * @return the authentication token class
	 */
	public Class<?> getAuthenticationTokenClass() {
		return SmsLoginToken.class;// 此Realm只支持SmsLoginToken
	}

}
