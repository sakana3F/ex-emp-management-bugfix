package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@NotBlank(message="名前は必須です")
	private String name;
	/** メールアドレス */
	@Size(min=1, max=120, message="Eメールは1文字以上127文字以内で入力してください")
	@Email(message="Eメールの形が不正です")
	private String mailAddress;
	/** パスワード */
	@Size(min=6, max=12, message="パスワードは6文字以上12文字以内で記入してください")
	private String password;
	/** 確認用パスワード */
	@NotBlank(message = "確認用パスワードを入力してください")
	private String confirmPassword;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + "]";
	}

	

}
