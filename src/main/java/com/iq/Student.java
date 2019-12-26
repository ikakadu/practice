package com.iq;

import com.equator.NeedToCompare;

import java.util.Objects;

public class Student {
	private int age;

	@NeedToCompare
	private String addr;

	private String sex;

	@Override
	public String toString() {
		return "Student{" +
				"age=" + age +
				", addr='" + addr + '\'' +
				", sex='" + sex + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return age == student.age &&
				Objects.equals(addr, student.addr) &&
				Objects.equals(sex, student.sex);
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, addr, sex);
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(int age) {
		super();
		this.age = age;
	}

}
