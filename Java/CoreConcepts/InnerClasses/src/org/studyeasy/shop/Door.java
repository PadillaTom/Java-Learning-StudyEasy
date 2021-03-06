package org.studyeasy.shop;

public class Door {
	
	private Lock lock;
	
	public Door() {
		lock = new Lock(true);
	}
	
//	Getter of Lock Class, so we can access it's methods.
	public Lock getLock() {
		return lock;
	}


	public void shopStatus() {
		if(lock.isLock()) {
			System.out.println("Shop is Closed");
		} else {
			System.out.println("Shop is Open");
		}
	}
	
//	**** INNER CLASS ****
	public class Lock {
//		Fields:
		private boolean lock;
//		Method:
		public Lock(boolean lock) {
			this.lock = lock;
		}
//		Getters and Setters:
		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}
		
	}

}
