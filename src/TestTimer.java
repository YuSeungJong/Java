import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TestTimer {

 Timer timer = null;
 HelloTask task = null;
 
 public TestTimer() {
  timer = new Timer();
  HelloTask task = new HelloTask();
  timer.schedule(task, new Date(), 1000);
 }
 
 public synchronized void stop() {
  if(timer != null)
   timer.cancel();
 }
 
 public synchronized void start() throws Exception {
  timer = new Timer();
  if(task == null)
   task = new HelloTask();
  
  timer.schedule(task, 0, 1000);
 }
 
 class HelloTask extends TimerTask {
  public void run() {
   System.out.println(new Date());
  }
 }
 
 public static void main(String[] args) {
  try {
   TestTimer t = new TestTimer();
   Thread.sleep(3000);
   t.stop();
   Thread.sleep(2000);
   t.start();
  } catch (Exception e) {
   e.printStackTrace();
  }
  
 }
 
}



