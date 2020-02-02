package org.apache.shiro.spring.boot.sms.realm;

import org.apache.shiro.biz.realm.AbstractAuthorizingRealm;
import org.apache.shiro.spring.boot.sms.token.SmsLoginToken;

/**
 * Sms AuthorizingRealm
 * @author 		： <a href="https://github.com/hiwepy">hiwepy</a>
 */
public class SmsAuthorizingRealm extends AbstractAuthorizingRealm {

	@Override
	public Class<?> getAuthenticationTokenClass() {
		return SmsLoginToken.class;// 此Realm只支持SmsLoginToken
	}

}
