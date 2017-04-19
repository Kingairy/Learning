package designPatterns;

public class Singleton {
	/***
	 * Singleton Parttern
	 * 
	 * @author wangqizheng
	 * 
	 *         use safe mode to make sure only one instance of Singleton in
	 *         memory.use flag in constructor to prevent reflection intrusion
	 */
	private static volatile boolean flag = false;

	private Singleton() {
		synchronized (Singleton.class) {
			if (flag == false) {
				flag = !flag;
			} else
				throw new RuntimeException("Singleton invaded!");
		}
		System.out.println("Singlton create!");
	}

	private static class SingletonHolder {
		private final static Singleton singleton = new Singleton();
	}

	public static Singleton getSingleton() {
		return SingletonHolder.singleton;
	}

	public void operation() {
		System.out.println("Operate singleton");
	}

	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingleton();
		singleton = Singleton.getSingleton();
		singleton.operation();
		try {
			singleton = (Singleton) Class.forName("designPatterns.Singleton").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
