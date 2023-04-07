package LogicaDifusa;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import net.sourceforge.jFuzzyLogic.FIS;

public class AireAcondicionado {
	
	static double temperatura = 30, potencia, randomValue;
	private String fileName = "C:\\Users\\thera\\eclipse-workspace\\IA\\src\\LogicaDifusa\\AireAcondicionado.fcl";
	private Random r;

	    public static void main(String[] args) {
	    	new AireAcondicionado();
	    }
	    
	    public AireAcondicionado() {
	    	
	    	r = new Random();
	        Timer timer = new Timer();
	        System.out.println("Controlador de temperatura: ");
            System.out.println();
	        
		    TimerTask task = new TimerTask() {
		    	
		      public void run() {
			       FIS fis = FIS.load(fileName, true);

			       randomValue = -0.3 + (0.3 - -0.3) * r.nextDouble();
			       temperatura += randomValue;
			       
			       // 15� - 35�
			       fis.setVariable("temperatura", temperatura);
			        
			       fis.evaluate();
			       
			       // 0% - 100%
			       potencia = ((fis.getVariable("potencia").getLatestDefuzzifiedValue() - 16.7)*1.5);
			        
			       System.out.printf("La temperatura es de %.2f", temperatura);
			       System.out.printf("�, la potencia del aire\nacondicionador esta en %.2f", potencia);
			       System.out.println("% de su capacidad\n");
		      }
		    };
		    
		    timer.schedule(task, 0, 5000);
	   }
}