package threadsync;

public class RuntimeExample {
	public static void main(String args[]) throws Exception {
		//Runtime.getRuntime().exec("notepad");// will open a new notepad
		//Runtime.getRuntime().exec("C:\\Windows\\System32\\shutdown -s -t 0");   //to shutdown a system
		//Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -r -t 0");   //to restart
		System.out.println(Runtime.getRuntime().availableProcessors());  //to get available processors
	}
}

/*
 * Java Runtime class: Java Runtime class is used to interact with java runtime
 * environment. Java Runtime class provides methods to execute a process, invoke
 * GC, get total and free memory etc. There is only one instance of
 * java.lang.Runtime class is available for one java application.
 */