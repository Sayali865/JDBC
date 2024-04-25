package com.anudip.demo;

public class Operations {

		private int id;
		private String Name;
		private String desg;
		private String dept;
		private int sal;
		
		public Operations(int id, String name, String desg, String dept, int sal)
		{
			super();
			this.id = id;
			Name = name;
			this.desg = desg;
			this.dept = dept;
			this.sal = sal;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getDesg() {
			return desg;
		}

		public void setDesg(String desg) {
			this.desg = desg;
		}

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}

		public int getSal() {
			return sal;
		}

		public void setSal(int sal) {
			this.sal = sal;
		}
	}



