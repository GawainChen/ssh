package domain;

import java.util.Set;

/*
 * 用户类
 * */
public class User {
	private String id;
	// 用户id
	private String userName;
	// 用户名
	private String password;
	// 密码
	private String realName;
	// 真实姓名
	private String gender;
	// 性别
	private Integer age;
	// 年龄
	private String personalSignature;
	// 个性签名
	private Set<Information> informations;
	// 用户发布信息
	private Set<Comment> comments;

	// 所发表的评论

	/*
	 * 默认构造函数，在使用Spring和Hibernate的环境中一般需要（反射）
	 */

	public User() {

	}

	/*
	 * 带参数的构造函数，用来初始化User类的属性。 该参数列表中不包括id,因为id是由Hibernate来进行初始化的。
	 * id的初始化操作发生在将User对象保存到数据库之前的瞬间。
	 */

	public User(int age, String gender, String password,
			String personalSignature, String realName, String userName) {
		this.age = age;
		this.gender = gender;
		this.password = password;
		this.personalSignature = personalSignature;
		this.realName = realName;
		this.userName = userName;

	}

/*	public String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPersonalSignature() {
		return personalSignature;
	}

	public void setPersonalSignature(String personalSignature) {
		this.personalSignature = personalSignature;
	}

	public Set<Information> getInformations() {
		return informations;
	}

	// 设置用户发布的信息User和Information是一对多的关系----一个用户可以发表多条信息
	public void setInformations(Set<Information> informations) {
		this.informations = informations;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}*/

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPersonalSignature() {
		return personalSignature;
	}

	public void setPersonalSignature(String personalSignature) {
		this.personalSignature = personalSignature;
	}

	public Set<Information> getInformations() {
		return informations;
	}

	public void setInformations(Set<Information> informations) {
		this.informations = informations;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	/*
	 * 重载Object类的toString方法，将用户对象转化为字符串展现
	 */
	public String toString() {
		return "用户名： " + userName + " " + "真实姓名: " + realName;

	}
}
