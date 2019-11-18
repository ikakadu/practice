package com.it.dd;

import java.util.List;

public class person {
	private String name;
	private String color;
	
	private List<Dog> dog;

	
	
	public class Dog {

		private String dogName;

		public String getDogName() {
			return dogName;
		}

		public void setDogName(String dogName) {
			this.dogName = dogName;
		}

		public Dog(String dogName) {
			super();
			this.dogName = dogName;
		}

		@Override
		public String toString() {
			return "Dog [dogName=" + dogName + "]";
		}
		
	}
	
	public List<Dog> getDog() {
		return dog;
	}

	public void setDog(List<Dog> dog) {
		this.dog = dog;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", color=" + color + ", dog=" + dog + "]";
	}

	public void setColor(String color) {
		this.color = color;
	}

	public person(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public person() {}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((dog == null) ? 0 : dog.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person other = (person) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (dog == null) {
			if (other.dog != null)
				return false;
		} else if (!dog.equals(other.dog))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
