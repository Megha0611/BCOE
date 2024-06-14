package com.gvacharya.enumeration.demo;

public class MainEnumaration {
	
	
	enum UserAccess{
		ACTIVE(1,"Active User","All Access"),
		INACTIVE(2,"Inactive User","No Access at All"),
		SUSPENDED(3,"Suspended User","Login Access for Particular Time"),
		
		
		private int srNo;
		private String description;
		private String access;
		
		
		private UserAccess(intSrNo,String description,String access) {
			this.srNo=srNo;
			this.description=description;
			this.access=access;S
		}
		
		
		
	}
	
	public int getSrNo() {
			return srNo;
		}


		public void setSrNo(int srNo) {
			this.srNo = srNo;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public String getAccess() {
			return access;
		}


		public void setAccess(String access) {
			this.access = access;
		}


		public String getRole() {
			return role;
		}


		public void setRole(String role) {
			this.role = role;
		}

	private String role;
	
	
	public static void main(String[] args) {
		System.out.println(UserAccess.ACTIVE);
		System.out.println(UserAccess.INACTIVE.getSrNo());
		System.out.println(UserAccess.ACTIVE.getDescription());
		
		for(UserAccess userAccess: UserAccess.values()) {
			System.out.println(UserAccess.getSrNo() + "." userAccess.name() +"." +""
		                                       +userAccess.getDescription());
		}
		
		
		
		
		}
	}


