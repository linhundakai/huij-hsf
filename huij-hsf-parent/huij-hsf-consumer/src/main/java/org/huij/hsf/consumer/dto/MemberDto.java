/**
 * 
 */
package org.huij.hsf.consumer.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author Administrator
 *
 */
public class MemberDto implements Serializable {

	private static final long serialVersionUID = 4518902655656320779L;

	@NotBlank(message = "用户名不能为空")
	private String username;

	@NotBlank(message = "密码不能为空")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
