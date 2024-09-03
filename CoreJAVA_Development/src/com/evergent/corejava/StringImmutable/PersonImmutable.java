package com.evergent.corejava.StringImmutable;

 public final class PersonImmutable {
		// TODO Auto-generated method stub
		private final String name;
		private final int age;
		//Constructor to initialize the final fields
		public PersonImmutable(String name, int age) {
			// TODO Auto-generated constructor stub
			this.name=name;
			this.age=age;
		}
		public String MyName() {
			return name;
		}
		
		public int MyAge() {
			return age;
		}

	}



