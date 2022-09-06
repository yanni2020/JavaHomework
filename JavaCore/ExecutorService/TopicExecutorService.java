package ExecutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 1)	Define a inner class A has method “getMethod()” which return string 
 *      “A.getMethod” and another inner class B has method “getMethod()” which 
 *      return string “B.getMethod”. write another method “runSameTime()” which 
 *      should let A and B getMethod to run at the same time, but the 
 *      “runSameTime()” method should return a string “B.getMethod A.getMethod”
 */
public class TopicExecutorService {
    
    public static class A {
        public static String getMethod() {return "A.getMethod";}
    }

    public static class B {
        public static String getMethod() {return "B.getMethod";}
    }

    public static String runSameTime() {
        return B.getMethod()+A.getMethod();
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService excutor = Executors.newFixedThreadPool(2);
        // excutor.execute(new Runnable() {
        //     public void run(){
        //         System.out.println(A.getMethod());
        //         System.out.println(B.getMethod());
        //     }
        // });
        Future future = excutor.submit(new Callable() {
            public Object call() throws Exception {
                return runSameTime();
            }
        });
        System.out.println(future.get());
        excutor.shutdown();
    }
}
