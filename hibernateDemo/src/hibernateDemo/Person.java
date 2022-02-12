package hibernateDemo;

import java.util.Objects;

public class Person {
	    private int id;
	    private String name,address,phone;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public Person(int id, String name, String address, String phone) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.phone = phone;
		}
		@Override
		public int hashCode() {
			return Objects.hash(address, id, name, phone);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name)
					&& Objects.equals(phone, other.phone);
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
		}
		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}
	    }

